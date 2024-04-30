Feature: Finding The Truth

  @test
  Scenario: As a user, I should be able to navigate to correct case
    Given I am on the homepage
    When  I click on the start button
    And   I click on Who is to blame case link
    Then  I should be navigate to correct case

  @test
  Scenario: As a user, I should be able to judge a person with appropriate option selection - Guilty
    Given I am on the homepage
    When  I click on the start button
    And   I choose Making a case against Kevin
    And   I am redirected to a video with the JUDGE THIS button
    And   I click on the JUDGE THIS button
    And   I see two options: Guilty and Not Guilty
    When  I select the Guilty option and then click on the Vote button
    Then  I should see the result indicating that I selected the Guilty option

  @test
  Scenario: As a user, I should be able to judge a person with appropriate option selection - Not Guilty
    Given I am on the homepage
    When  I click on the start button
    And   I choose Making a case against Kevin
    And   I am redirected to a video with the JUDGE THIS button
    And   I click on the JUDGE THIS button
    And   I see two options: Guilty and Not Guilty
    When  I select the Not Guilty option and then click on the Vote button
    Then  I should see the result indicating that I selected the Not Guilty option

