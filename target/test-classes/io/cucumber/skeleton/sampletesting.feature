    #Author: abdo.atef.88@gmail.com-----------------------
  @SeleniumAssignmentCompletion
  Feature: Selenium Test Assignments Features

  Background: Login Page
    Given I am on home page of application "https://jqueryui.com/"

  @DragAndDrop
  Scenario: Test Drag and Drop Scenario
    When I select Droppable option from left menu under interactions
    And Drag Drag me to my target component to Drop here component
    Then I should be able to able to drag and drop

  @MultipleSelect
  Scenario Outline: Test Multiple Select Options
    When I select Selectable option from left menu under interactions
    And Select items "<Items>" from options
    Then I should be able to verify that the multiple select option is allowed

    Examples:
      | Items                |
      | Item 1;Item 3;Item 5 |


  @ControlGroup
  Scenario Outline: Test Control Group
    When I select Controlgroup option from left menu under interactions
    And enter booking details for Horizontal orientation like Vehicle Option "<VehicleOption1>" Type "<VehicleType1>" number "<Number1>"
    And enter booking details for Vertical orintation like Vehicle Option "<VehicleOption2>" Type "<VehicleType2>" number "<Number2>"
    And opt for Insurance for either case
    And click on Book Now Button
    Then Booking should be Successful

    Examples:
      | VehicleOption1 | VehicleOption2 | VehicleType1 | VehicleType2 | Number1 | Number2 |
      | SUV            | Truck          | Automatic    | Standard     |       2 |       1 |
