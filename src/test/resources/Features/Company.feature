@tag
Feature: Company functionality
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Create company
    Given User launches "<Browser>" application
    And User login to the application
    When User creates company with "<cName>" and "<cWeb>" and "<Address>" and "<City>" and "<State>" and "<Zip>" data
    Then Company should be created using above data

    Examples: 
      | cName    | cWeb         | Address | City      | State     | Zip    | Browser |
      | Test com | www.test.com | Road 15 | Hyderabad | Telangana | 500035 | chrome  |
      | Test com | www.test.com | Road 15 | Hyderabad | Telangana | 500035 | ff      |
      | Test com | www.test.com | Road 15 | Hyderabad | Telangana | 500035 | ie      |
