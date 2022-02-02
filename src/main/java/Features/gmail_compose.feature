Feature: Mail Composing

  Scenario: Login to Gmail and compose the Email
    Given User enter the gmail URL
    When User enter the email id and password
    And Click on Compose button
    And User enter the TO email id
    And User enter the Subject
    And User enter the content in the body of the mail
    Then User click on send button
