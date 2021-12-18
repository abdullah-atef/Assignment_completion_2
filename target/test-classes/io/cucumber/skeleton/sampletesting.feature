    #Author: abdo.atef.88@gmail.com-----------------------
  @SeleniumAssignmentCompletion
  Feature: Selenium Test Assignments Features

    Background: Landing Page
      Given User in homepage



  @DragAndDrop
  Scenario: Test Drag and Drop
    When User selects Droppable option under interactions
    And Drag me to my target component to Drop here component
    Then User should be able to do drag and drop

  @MultipleSelect
  Scenario Outline: Test Multiple Select Options
    When User selects Selectable option from left menu under interactions
    And User selects items "<Items>" from options
    Then User should be able to verify that the multiple select option is allowed

    Examples:
      | Items                |
      | Item 1;Item 3;Item 7 |


  @ControlGroup
  Scenario Outline: Test Control Group
    When User selects Controlgroup option from left menu under interactions
    And enter booking details for Horizontal orientation: Vehicle Option "<VehicleOption1>" Type "<VehicleType1>" number "<Number1>"
    And enter booking details for Vertical orientation: Vehicle Option "<VehicleOption2>" Type "<VehicleType2>" number "<Number2>"
    And select Insurance for both cases
    And click on Book Now Button
    Then Booking should be Successful

    Examples:
      | VehicleOption1 | VehicleOption2 | VehicleType1 | VehicleType2 | Number1 | Number2 |
      | SUV            | Truck          | Automatic    | Standard     |       2 |       1 |
