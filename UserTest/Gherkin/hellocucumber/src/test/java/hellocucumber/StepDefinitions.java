package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

	private String angle_precision;
	private String time_precision;
	
	@Given("The angle precision is {string} degrees")
	public void the_angle_precision_is_degrees(String string) {
	    setAngle_precision(string);
	}

	@Given("The time precision is {string} ms")
	public void the_time_precision_is_ms(String string) {
	    setTime_precision(string);
	}
	
	
	@Given("We have an operational arm")
	public void we_have_an_operational_arm() {
	
	}
	
	
	@When("The {string} operation is called with arguments {int}, {int} and {int}")
	public void the_operation_is_called_with_arguments_and(String string, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("The result for {string} with {int}, {int} and {int} is True")
	public void the_result_for_with_and_is_true(String string, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("The result is {string} {int}")
	public void the_result_is(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("The {string} operations is called with arguments {int}, {int}, {int}, {int}, {int}, {int} and {int}")
	public void the_operations_is_called_with_arguments_and(String string, Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("The result for {string} with {int}, {int}, {int}, {int}, {int}, {int} and {int} is True")
	public void the_result_for_with_and_is_true(String string, Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	public String getAngle_precision() {
		return angle_precision;
	}

	public void setAngle_precision(String angle_precision) {
		this.angle_precision = angle_precision;
	}

	public String getTime_precision() {
		return time_precision;
	}

	public void setTime_precision(String time_precision) {
		this.time_precision = time_precision;
	}

	
}
