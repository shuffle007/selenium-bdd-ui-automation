@regression
Feature: UpSkill Automation Practice

  Background: 
    Given Open UpSkill Automation Practice page
    When Switch to Practice iFrame

  Scenario: Textbox Practice
    Then User should able to write on Textbox

  Scenario: Mousehover Practice
    When Mouse Hover to Hover Over Me
    Then Click on Link

  Scenario: Dropdown Practice
    When Select Option from dropdown
    Then Verify Option selected

  Scenario: Alert Practice
    When Click on Alert
    Then Click on OK

  Scenario: Radio Button Practice
    Then Click on Radio 2

  Scenario: Checkbox Practice
    Then Click on Checkbox 2

  Scenario: Switch Window Practice
    When Click on Open Window
    Then Switch to new Window
    And Click on Courses

  Scenario: Confirm Practice
    When Click on Confirm
    Then Click on OK
    And Verify Great

  Scenario: Cancel Practice
    When Click on Confirm
    Then Click on cancel

  Scenario: Iframe Courses Practice
    When Switch to iFrame Courses
    Then Click on Courses
