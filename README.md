# H2ComputeFramework

## Overview

H2ComputeFramework is a Selenium-based test automation framework developed using Java and Maven. It follows a Page Object Model (POM) structure to organize page classes and test cases.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Log4j2

## Project Structure

```text
H2ComputeFramework/
├── .mvn/
├── logs/
│   └── automation.log
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Base/
│   │   │   │   └── BaseClass.java
│   │   │   └── pages/
│   │   │       ├── Checkout.java
│   │   │       ├── CheckoutOverview.java
│   │   │       ├── LogIn.java
│   │   │       ├── ViewCart.java
│   │   │       └── ViewItems.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── testCases/
│       │       ├── LogInTest.java
│       │       └── TC001_E2EPurchaseTest.java
│       └── resources/
│           ├── config.properties
│           └── log4j2.xml
├── pom.xml
└── README.md
```

## Prerequisites

Ensure the following are installed and configured:

- Java Development Kit (JDK)
- Apache Maven
- IntelliJ IDEA or another Java IDE
- A supported web browser and its compatible WebDriver setup, if required by the framework

## Configuration

1. Open `src/test/resources/config.properties`.
2. Configure the required application settings, such as the application URL and any other properties expected by the framework.
3. Ensure the browser and WebDriver configuration in `BaseClass.java` is correct for your environment.

Do not commit passwords, access tokens, or other sensitive credentials to GitHub.

## Setup

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Ensure the project SDK is configured correctly.
4. Load or reload the Maven dependencies using `pom.xml`.
5. Verify that the application is accessible and the required configuration is set.

## Running the Tests

### Run the end-to-end purchase test

To execute `TC001_E2EPurchaseTest` using Maven, open a terminal in the project root directory and run:

```bash
mvn -Dtest=TC001_E2EPurchaseTest test
```

This command runs the specified test class, provided it is configured to run through the project's Maven Surefire and TestNG setup.

### Run from IntelliJ IDEA

1. Navigate to `src/test/java/testCases/TC001_E2EPurchaseTest.java`.
2. Open the test class.
3. Click the green Run icon beside the test class or its test method.
4. Review the execution results in the Run window.

## Logs

Execution logs are stored in `logs/automation.log`, subject to the logging configuration in `src/test/resources/log4j2.xml`.

## Author

Developed as a Selenium test automation project.
