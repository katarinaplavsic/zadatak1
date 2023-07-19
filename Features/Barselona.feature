Feature: Barselona

  @Barselona_TestCase1
  Scenario: Barselona_TestCase1
    Given Navigate to URL "https://www.booking.com/"
    Then Click on the X button to dismiss the popup
    Then Type in "Barselona" into search field by placeholder "Where are you going?"
    Then Click on calendar button by class "d47738b911 e246f833f7 fe211c0731"
    Then Click on start date
    Then Click on end date
    Then Wait
    Then Click on Search button
    Then Assert search results by class
    Then Wait
    Then Browser quit
