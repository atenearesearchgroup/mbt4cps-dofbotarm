import pytest
import logging
from cordisLibrary.CordisLogger import CordisLogger
from cordisLibrary.CordisConnection import CordisConnection
from RunCordisTests import controller

@pytest.fixture(scope='session')
def Logger():
    """
    Create Logger for logging test results
    """
    return CordisLogger("TestLogger", "FunctionalTests", logging.DEBUG)


@pytest.fixture(scope='session')
def Connection(Logger):
    """
    Set up a connection with the MCS
    """
    return CordisConnection('config.xml', Logger, controller)


@pytest.fixture(scope='session')
def CC1(Connection):
    """
    Set up a connection to the root machine part of a specific controller
    """
    return Connection.GetMachine(controller)
