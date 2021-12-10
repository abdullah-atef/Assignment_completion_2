Feature:

  Scenario Outline:
    Given User Open Landing Page
    When User clicks on Sign In Url
    And User Insert valid Email as "<email>"
    And User Insert valid Password as "<password>"
    And User Clicks on SignIn button
    Then User Full Name displayed properly
    Examples:
      |email|password|
      |abdo.atef.88@gmail.com|P@ssw0rd|
