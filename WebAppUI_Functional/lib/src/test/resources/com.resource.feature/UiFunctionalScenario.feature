#Author - varundevsinha@gmail.com
@Webtool1
Feature: Bank associates are able to access webtool from different geo-locations.
  
  Rule: A valid user log-in to the webtool, and can do client assessment.

  Background: 
    Given Webtool1 system is up and running. Scenario Test data is prepared.
    And Associate log-in with valid "UserId" and "Password".
    And Associate selects the "Location" and Server.

  @Create @Associate @Regression
  Scenario: Bank associate log-in to webtool and do client assessment.
    Given Associate goes to create new assessment page.
    When Creates the new client assessment with the required details.
    Then Submits the assessment and Successfully log-out from the webtool.

  @Search @Associate @Smoke @Regression
  Scenario: Bank associate log-in to webtool and search client assessment.
    Given Associate goes to search page.
    When Search the client assessment with "AssessmentId", and verify the "Risk".
    Then Successfully log-out from the webtool.

  @Update @Associate @Smoke
  Scenario: Bank associate log-in to webtool and update client assessment.
    Given Associate goes to search page.
    When Search the client assessment with "AssessmentId", and update the "Risk".
    Then Successfully log-out from the webtool.   