Feature: Zajecar_2_adults_2_rooms

  @Zajecar_2_adults_2_rooms_TestCase_5
  Scenario: Zajecar_TestCase_5
    Given Navigate to URL "https://www.booking.com/"
    Then Wait
    Then Click on the X button to dismiss the popup
    Then Type in "Zajecar" into search field by placeholder "Where are you going?"
    Then Wait
    Then Click on calendar button by class "d47738b911 e246f833f7 fe211c0731"
    Then Click on start date
    Then Wait
    Then Click on end date
    Then Wait
    Then Click on occupancy option
    Then Wait
    Then Click on plus sign
    Then Wait
    Then Click on button Done
    Then Wait
    Then Click on Search button
    Then Wait
    Then Browser quit

