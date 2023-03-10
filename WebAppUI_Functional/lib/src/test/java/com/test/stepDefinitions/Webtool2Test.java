package com.test.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import com.test.base.JavaSeleniumBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Webtool2Test extends JavaSeleniumBase {

	public static Map<String, Object> CreateMap = new HashMap<String, Object>();
	public static Map<String, Object> SearchMap = new HashMap<String, Object>();
	public static Map<String, Object> UpdateMap = new HashMap<String, Object>();

	@Given("Webtool2 system is up and running. Scenario Test data is prepared.")
	public void webtool2_system_is_up_and_running_scenario_test_data_is_prepared() {

		/*
		 * Verify the page link is same as provided by development team. Take Screenshot
		 * of the page, and save for visual verification. Verify the login form input
		 * fields isDisplayed. Verify TestData file path field is not null in
		 * TestDataConfiguration.properties file. As per function column of excel sheet
		 * create HashMaps. Within block create TempCreateMap or TempSearchMap or
		 * TempUpdateMap and finally replace the CreateMap or SearchMap or UpdateMap.
		 * use the map data for functional testing.
		 */
	}

	@Given("User log-in with valid {string} and {string}.")
	public void user_log_in_with_valid_and(String UserId, String Password) {

		/*
		 * Search UserId field. Verify UseId field isSelected and then input the value.
		 * Search Password field. Verify Password field isSelected and then input the
		 * value. Click on login button.
		 */
	}

	@Given("User selects the {string} and Server.")
	public void user_selects_the_and_server(String Location) {

		/*
		 * Wait till the pop-up came, switchTo pop-up verify the test includes correct
		 * UserId and accept.Verify location drop-down isEnabled. Select the country
		 * from drop-down using SelectByvisibleText / SelectByIndex.
		 */
	}

	@Given("Test data loaded as per {string}.")
	public void test_data_loaded_as_per(String TestCase_Id) {

		/*
		 * Fetch test data from excel file as per TestCase_Id and store as a map to use
		 * in assessment creation.
		 */
	}

	@Given("User goes to create new assessment page.")
	public void user_goes_to_create_new_assessment_page() {

		/*
		 * Verify the UserId is showing in profile section, and user is on HomePage by
		 * verifying the pageTitle. Find create button and click on that.
		 */
	}

	@When("User creates the new client assessment with the required details.")
	public void user_creates_the_new_client_assessment_with_the_required_details() {

		/*
		 * Verify the UserId and On-boarding country is selected correctly as Associate
		 * details. Fill the assessment form with data from excel (Input fields,
		 * Drop-down fields, Radio buttons, and Check boxes). Click on calculate button,
		 * and verify the risk from excel data. If Risk assertTrue=True then take
		 * screenshot and save with prefix "True" and System_CurrentTime. If Risk
		 * assertTrue = false then take screenshot and save with prefix "false" and
		 * System_CurrentTime.
		 */
	}

	@Then("User submits the assessment and Successfully log-out from the webtool.")
	public void user_submits_the_assessment_and_successfully_log_out_from_the_webtool() {

		/*
		 * Click on submit button. Verify message of successful submit of assessment and
		 * new assessmentId generated. Create a list of all new assessment Id and save
		 * in excel. Go back to home-page then click on profile section scroll to
		 * log-out and click. Verify successful message of log-out for UserId. Wait till
		 * page redirect to log-in page window.
		 */
	}

	@Given("User goes to search page.")
	public void user_goes_to_search_page() {

		/*
		 * Verify the UserId is showing in profile section, and user is on HomePage by
		 * verifying the pageTitle. Find search button and click. Verify the search
		 * pageLink and title. In the notification section update of added assessment
		 * count is showing same as count of assessment created from excel.
		 */
	}

	@When("User search the client assessment with {string}, and verify the {string}.")
	public void user_search_the_client_assessment_with_and_verify_the(String AssessmentId, String Risk) {

		/*
		 * On the search page, input the assessment id and date range. Verify the search
		 * result section showing the searched assessmentId with risk, created date, and
		 * last updated date. Verify created date and updated date is before current
		 * date.
		 */
	}

	@Then("User successfully log-out from the webtool.")
	public void user_successfully_log_out_from_the_webtool() {

		/*
		 * Go back to home-page then click on profile section scroll to log-out and
		 * click. Verify successful message of log-out for UserId. Wait till page
		 * redirect to log-in page window.
		 */
	}

	@When("User search the client assessment with {string}, and update the {string}.")
	public void user_search_the_client_assessment_with_and_update_the(String AssessmentId, String Risk) {

		/*
		 * On the search page, input the assessment id and date range. Verify the search
		 * result section showing the searched assessmentId with risk, created date, and
		 * last updated date. Verify created date and updated date is before current
		 * date. Click on assessmentId and wait wait for assessment window to load
		 * successfully. Update the assessment details from excel sheet. Click on submit
		 * button. Verify message of successful submit of assessment and new
		 * assessmentId generated. Create a list of all updated assessment Id and save
		 * in excel.
		 */
	}

	@Then("User investigates the assessment with Name Scanning API.")
	public void user_investigates_the_assessment_with_name_scanning_api() {

		/*
		 * After searching the assessment, user click on assessment id, and wait wait
		 * for assessment window to load successfully. Then user click on Investigate
		 * button for initiating Name scanning API, then verify the message with count
		 * of updated and new assessment id(Sum of both) from the Name Scanning API card
		 * component, showing count as link..
		 */
	}
}
