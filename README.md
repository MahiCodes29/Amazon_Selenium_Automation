# Amazon Selenium Automation

A Selenium WebDriver automation testing project for automating key Amazon e-commerce workflows using Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM).

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- ChromeDriver
- Git
- GitHub

## Project Structure

```text
Amazon_Selenium_Automation
│
├── src
│   │
│   ├── main
│   │   └── java
│   │       │
│   │       ├── Pages
│   │       │   ├── AmazonHomePage.java
│   │       │   ├── AmazonSearchResultsPage.java
│   │       │   ├── ProductDetailsPage.java
│   │       │   ├── AddToCartPage.java
│   │       │   ├── LoginPage.java
│   │       │   └── RegisterPage.java
│   │       │
│   │       └── utilities
│   │           └── ScreenshotUtils.java
│   │
│   └── test
│       └── java
│           │
│           ├── Base
│           │   └── BaseTest.java
│           │
│           └── Tests
│               ├── AmazonSearchTest.java
│               ├── AmazonSearchResultsTest.java
│               ├── ProductDetailsTest.java
│               └── AddToCartTest.java
│
├── pom.xml
├── testng.xml
└── README.md
