Feature: Check_Trending_destinations

  @Check_Trending_destinations_TestCase4
  Scenario: Check_Trending_destinations_TestCase4
    Given Navigate to URL "https://www.booking.com/"
    Then Wait
    Then Click on the X button to dismiss the popup
    Then Scroll down to the element by text "Trending destinations"
    Then Wait
    Then Click on the most popular choices for travellers from Serbia
    Then Wait
    Then Click on start date
    Then Click on end date
    Then Browser quit