Feature: This feature will be used to automate PizzaHut Website

  @Regression
  Scenario: This scenario will be used to Place the Order
    Given I have launched the application11
    When I enter the location as "Dharwad"
    And I select the very first suggestion from the list
    Then I should land on the Deals page
    And I select the tab
    And I add "mazedar-makhni-paneer" to the basket
    And I note down the price "₹359" displayed on the screen
    Then I should see the pizza "Personal Mazedar Makhni Paneer" is added to the cart
    Then price is also displayed correctly
    And I click on the Checkout button
    Then I should be landed on the secured checkout page
    And I enter the personal details
      | Name          | Mobile     | Email       |
      | Rajesh Sharma | 8888888888 | abc@xyz.com |
    And I enter the address details
      | 123 Main Street |
      | Some Landmark   |
