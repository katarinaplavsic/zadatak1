Feature: Beograd

  @Beograd_TestCase2
  Scenario: Beograd_TestCase2
    Given Navigate to URL "https://www.booking.com/"
    Then Wait
    Then Click on the X button to dismiss the popup
    Then Type in "Beograd" into search field by placeholder "Where are you going?"
    Then Click on calendar button by class "d47738b911 e246f833f7 fe211c0731"
    Then Click on start date
    Then Click on end date
    Then Click on Search button
    Then Assert search results by class
    Then Wait
    Then Browser quit
