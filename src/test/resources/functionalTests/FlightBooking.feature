Feature: Automated Flight Booking Test
Description: This tests flight booking behaviour

Scenario: E2E Flight search
    Given user is on Flights Search page
    And user fills search flights form
    Then result appears for the provided journey search