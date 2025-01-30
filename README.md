# Selenium BDD UI Automation

A comprehensive Selenium project using BDD (Cucumber) for UI test automation. This repository demonstrates industry-standard practices for automating web UI tests with reusable components, cross-browser support, and parallel execution.

---

## Features
- **BDD Framework**: Built using Cucumber with Gherkin syntax.
- **Selenium WebDriver**: Automates browsers for UI testing.
- **Page Object Model (POM)**: Ensures maintainable and reusable code.
- **Cross-browser Compatibility**: Test on Chrome, Firefox, and other supported browsers.
- **Parallel Execution**: Execute tests faster across multiple threads or browsers.
- **Extent Reports**: Generates visually rich reports of test execution.
---

## Prerequisites
Make sure you have the following installed on your machine:
- **Java Development Kit (JDK)**: Version 8 or later.
- **Apache Maven**: For dependency management and build tasks.
- **Integrated Development Environment (IDE)**: Recommended - IntelliJ IDEA or Eclipse.
- **Browser Drivers**: For running tests (e.g., ChromeDriver, GeckoDriver). 
  - No need to manually download drivers. The project uses WebDriverManager to handle browser driver management automatically.

---

## Project Setup

Follow these steps to set up and run the project on your local machine:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/shuffle007/selenium-bdd-ui-automation.git

2. **Navigate to the project directory**:
   ```bash
   cd selenium-bdd-ui-automation
   
3. **Install project dependencies:** Run Maven to clean any previous builds and install dependencies:
   ```bash
   mvn clean install

## Set up Browser Driver
This project uses **WebDriverManager** to automatically download and manage the correct version of the WebDriver (e.g., ChromeDriver) for your system. No manual setup of WebDrivers is required.

When the tests are run, WebDriverManager will:
- Detect the version of your installed browser.
- Download the compatible WebDriver version.
- Configure the WebDriver for use.


## Running Tests
#### Run All Tests
- To execute tests, use: 
  ```bash
  mvn test
- Test results, including ExtentReports, will be generated in the `target` folder.

#### Run Specific Feature Files
- To execute tests for a specific feature file:
  ```bash
  mvn test -Dcucumber.options="src/test/resources/features/YourFeatureFile.feature"

#### Run Tests by Tags
- To execute tests associated with specific tags in your feature files:
  ```bash
  mvn test -Dcucumber.options="--tags @YourTag"

## Folder Structure
- selenium-bdd-ui-automation/
  - src/
    - test/
      - java/
        - com.utilities/: Contains utility classes such as SetupDrivers, BeforeActions, and AfterActions.
        - com.stepdefinitions/: Holds step definitions for feature files.
        - com.pages/: Contains Page Object Model classes.
        - RunnerClass.java: The Cucumber test runner.
      - resources/
        - features/: Contains Gherkin feature files.
        - extent.properties: Configuration for ExtentReports.
  - config/: Contains config.xml for ExtentReports.
  - target/: Stores test reports and build artifacts.
  - pom.xml: The Maven configuration file.

## Configuration
The config/ directory contains the config.xml file, which is used for configuring ExtentReports. Ensure this file is properly set up to match your reporting requirements.

## Technologies Used
- Selenium WebDriver
- Cucumber (Gherkin syntax)
- TestNG
- Maven
- Java
- ExtentReports: Visual test reports.

## Contributing
Feel free to fork this project and submit pull requests for any improvements or features!

## License
This project is licensed under the MIT License.
