import numpy as np
import time
from pytest import approx
from datetime import timedelta, datetime, timezone

# Accuracy to which real values are checked with pytest.approximate
accuracy = 1E-6

# Standard delay used throughout test scripts
assertDelay = 0.1

# List with observers that need to be skipped (i.e. standard observers for each platform)
skipObservers = ["MachinePartHash",
                 "Execution Duration", "Tree Execution Duration", "Peak Exec Duration", "Peak Tree Exec Duration",
                 "Peak Tree Exec  Duration"
                 ]

# Dictionary used to test setting a value around the limits (settings & arguments)
factorValues = {"within": -1,
                "on": 0,
                "slightly beyond": +1,
                "largely beyond": +1000
                }

def compare_values(variableName, actualValue, expectedValue, errorMessage):
    """
    Function checking current value of a setting/argument against an expected value using an assertion
    :param variableName: setting or argument name
    :param actualValue: the actual value
    :param expectedValue: the expected value
    :param errorMessage: error message in case of failure
    :return: assertion
    """
    # Check against expected value and report an assert error in caes
    assert actualValue == approx(expectedValue, accuracy), f"[ERROR] {errorMessage}. \
        Value of {variableName} not updated correctly: {actualValue} while {expectedValue} expected"


def check_current_value(object, expectedValue, errorMessage):
    """
    Function checking current value of a setting/argument against an expected value using an assertion
    :param object: setting or argument object
    :param expectedValue: the expected value
    :param errorMessage: error message in case of failure
    :return: the actual value
    """
    # Get updated setting/argument value
    currentValue = object.GetCurrentValue()
    # Check against expected value and report an assert error if not matching
    compare_values(object.name, currentValue, expectedValue, errorMessage)
    # Return the current value of the settings/argument
    return currentValue


def write_new_random_value(object, errorMessage):
    """
    Function writing new random value of a setting/argument and checking if it was written correctly
    :param object: setting or argument object
    :param errorMessage: error message in case of failure
    :return: the new random value
    """
    # Generate new setting/argument value
    newObjectValue = object.GenerateNewRandomValue()

    # Set new setting/argument value
    object.SetCurrentValue(newObjectValue)

    # Get updated setting/argument value, check the write action and return the actual value
    return check_current_value(object, newObjectValue, errorMessage)


def check_prop_change(prop_name, value_before, value_after, factor=0, limit=False):
    """
    Asserting the value change of any variable
    :param prop_name: Name of the observer, setting, argument, ...
    :param value_before: value before change
    :param value_after: value after update
    :param factor: indicating increase or decrease
    """
    if "Bool" in prop_name:
        assert value_after is not value_before, \
            f"{prop_name} not updated correctly: expected {not value_before}, read {value_before}, factor {factor}"

# region redundant checks
#    elif "USInt" in prop_name:
#        assert value_after == value_before + (1 * factor), \
#            f"{prop_name} not updated correctly: expected {value_before + (1 * factor)}, read {value_after}, factor {factor}"
#    elif "UInt" in prop_name:
#        assert value_after == value_before + (1 * factor), \
#            f"{prop_name} not updated correctly: expected {value_before + (1 * factor)}, read {value_after}, factor {factor}"
#    elif "UDInt" in prop_name:
#        assert value_after == value_before + (1 * factor), \
#            f"{prop_name} not updated correctly: expected {np.int32(value_before + (1 * factor))}, read {value_after}, factor {factor}"
#    elif "ULInt" in prop_name:
#        assert np.uint64(value_after) == np.uint64(value_before + (1 * factor)), \
#            f"{prop_name} not updated correctly: expected {np.int64(value_before + (1 * factor))}, read {value_after}, factor {factor}"
#
#    elif 'SInt' in prop_name:
#        assert np.int8(value_after) == np.int8(value_before + (1 * factor)), \
#            f"{prop_name} not updated correctly: expected {np.int8(value_before + (1 * factor))}, read {value_after}, factor {factor}"
#    elif 'DInt' in prop_name:
#        assert value_after == value_before + (1 * factor), \
#            f"{prop_name} not updated correctly: expected {value_before + (1 * factor)}, read {value_after}, factor {factor}"
#    elif 'LInt' in prop_name:
#        assert np.int64(value_after) == np.int64(value_before + (1 * factor)), \
#            f"{prop_name} not updated correctly: expected {np.int64(value_before + (1 * factor))}, read {value_after}, factor {factor}"
# endregionre

    elif ('Int' in prop_name) or ('Byte' in prop_name) or ('Word' in prop_name):
        assert value_after == value_before + (1 * factor), \
            f"{prop_name} not updated correctly: expected {value_before + (1 * factor)}, read {value_after}, factor {factor}"

    elif 'Real' in prop_name:
        assert value_after == approx(value_before + (0.25 * factor), accuracy), \
            f"{prop_name} not updated correctly: expected {value_before + (0.25 * factor)}, read {value_after}, factor {factor}"

    elif 'Enum' in prop_name:
        if value_before == 4 and factor == 1 and limit == False:
            assert value_after == 1, \
                f"{prop_name} not updated correctly: expected 1, read {value_after}, factor {factor}"
        elif value_before == 1 and factor == -1 and limit == False:
            assert value_after == 4, \
                f"{prop_name} not updated correctly: expected 4, read {value_after}, factor {factor}"
        else:
            assert value_after == value_before + (1 * factor), \
                f"{prop_name} not updated correctly: expected {value_before + (1 * factor)}, read {value_after}, factor {factor}"
    else:
        print("[INFO]: skipped observer change for", prop_name, "(unknown type)")


def update_and_check_limit(object, limit):
    """
    Function updating and checking new limit values
    :param object: setting or argument object
    :param limit: upper or lower limit
    :return: assertion
    """
    if 'Real' in object.name:
        delta = 0.25
    else:
        delta = 1

    lowerLimit = object.lowerLimit
    upperLimit = object.upperLimit

    newLowerLimit = lowerLimit
    newUpperLimit = upperLimit

    if limit == "lowerLimit":
        newLowerLimit = lowerLimit - delta
        object.SetLowerLimit(newLowerLimit)
    elif limit == "upperLimit":
        newUpperLimit = upperLimit + delta
        object.SetUpperLimit(newUpperLimit)

    # Retrieve the current value to update both the lower and upperlimit of a variable object
    object.GetCurrentValue()

    # Check both limits against there expected values (of which only one should be changed)
    function_name = "update_limit(" + limit + ")"
    object_name = object.name + "." + limit
    compare_values(object_name, object.lowerLimit, newLowerLimit, function_name)
    compare_values(object_name, object.upperLimit, newUpperLimit, function_name)


def set_near_limit(object, limit, bound):
    """
    Function asserting value changes around limits
    :param object: setting or argument object
    :param limit: upper or lower limit
    :param bound: within, on or beyond limit
    :return: assertion
    """

    # Set delta limit in-/decrement
    if 'Real' in object.name:
        delta = 0.001
    else:
        delta = 1

    objectValue = object.currentValue

    # offset with which new value is set below or above the limit
    offset = delta * factorValues[bound]

    if limit == "lowerLimit":
        newObjectValue = object.lowerLimit - offset
    elif limit == "upperLimit":
        newObjectValue = object.upperLimit + offset

    object.SetCurrentValue(newObjectValue)

    expectedValue = newObjectValue
    if "beyond" in bound:
        # value outside the limits should not be rejected
        expectedValue = objectValue

    check_current_value(object, expectedValue, "Set value " + bound + " " + limit)


def restore_default(object):
    """
    Function asserting restoring the default value of a setting/argument
    :param object: setting or argument object
    :return: assertion
    """
    # Generate new setting/argument value
    write_new_random_value(object, "Write random value @ restore_default")

    # Restore default setting/argument value
    object.RestoreDefaultValue()

    # Check restore action
    check_current_value(object, object.defaultValue, "Restore default")


def restore_saved(object):
    """
    Function asserting restoring the saved value of a setting/argument
    :param object: setting or argument object
    :return: assertion
    """
    # Generate new setting/argument value
    write_new_random_value(object, "Write random value @ restore_saved")

    # Restore saved setting/argument value
    object.RestoreSavedValue()

    # Check restore action
    check_current_value(object, object.savedValue, "Restore saved")


def save_current(object):
    """
    Function asserting saving the current value of a setting/argument
    :param object: setting or argument object
    :return: assertion
    """
    # Generate new setting/argument value
    saved_value = write_new_random_value(object, "Write random value @ save_current")

    # Save current value
    object.SaveCurrentValue()

    # Update machine part properties a.o. the .savedValue attribute
    object.GetCurrentValue()

    # Check save action
    compare_values(object.name, saved_value, object.savedValue, "Save Current")


def approximateDatetime(datetime1, datetime2):
    assert abs(datetime2 - datetime1) <= timedelta(seconds=1), f"{abs(datetime2 - datetime1)}"
    return


def entryTimeCheck(history, rangeLim):
    dtMcs = datetime.strptime(history[0].timeStamp, '%Y-%m-%dT%H:%M:%S.%f%z')
    for i in (1, rangeLim):
        dtMcsNext = dtMcs
        dtMcs = datetime.strptime(history[i].timeStamp, '%Y-%m-%dT%H:%M:%S.%f%z')
        assert dtMcs <= dtMcsNext, f"{dtMcs}, {dtMcsNext}"
