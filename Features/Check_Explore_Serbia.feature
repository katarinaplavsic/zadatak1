Feature: Check_Explore_Serbia

  @Check_Explore_Serbia_TestCase3
  Scenario: Check_Explore_Serbia_TestCase3
    Given Navigate to URL "https://www.booking.com/"
    Then Wait
    Then Click on the X button to dismiss the popup
    Then Scroll down to the element by text "Explore Serbia"
    Then Wait
    Then Assert 6 pictures in the Explore Serbia field by class
    Then Wait
    Then Click on element right
    Then Wait
    Then Click on element left
    Then Wait
    Then Assert colour of element "Explore Serbia" is "rgb(26, 26, 26)"
    Then Browser quit


