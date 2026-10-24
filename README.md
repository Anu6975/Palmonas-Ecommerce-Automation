# 💎 Palmonas E-Commerce Automation

**Automating real-world jewellery shopping workflows with Selenium WebDriver, Java, TestNG, Maven and Page Object Model (POM).**

[![Java](https://img.shields.io/badge/Java-19-orange?logo=openjdk)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-Testing-red)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)](https://maven.apache.org/)
[![Automation](https://img.shields.io/badge/Testing-UI%20Automation-blue)](https://www.selenium.dev/)

## 📌 Project Overview

Palmonas E-Commerce Automation is a UI automation project developed to test selected customer-facing workflows on the [Palmonas](https://www.palmonas.com/) jewellery shopping website.

The project uses Selenium WebDriver with Java and TestNG, follows the Page Object Model (POM), and uses Maven for dependency management.

The objective is to practise structured automation of real-world e-commerce interactions, including homepage navigation, product search, product options and shopping cart navigation.

## 🎯 Project Objectives

- Automate key user interactions on a live e-commerce website.
- Implement reusable page classes using the Page Object Model.
- Use TestNG annotations and assertions to validate application behaviour.
- Apply explicit waits for synchronisation with dynamic web elements.
- Organise test code for readability, maintainability and reuse.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 19 | Programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution and assertions |
| Maven | Dependency and build management |
| Page Object Model | Test framework design pattern |
| Chrome | Browser under test |
| Git and GitHub | Version control and project hosting |

## 🧪 Test Coverage

### 1. Homepage Tests
- Verify homepage navigation is visible.
- Validate the page title.
- Verify navigation to the New Arrivals collection.

### 2. Product Search Tests
- Verify the search field is displayed.
- Enter a product search term.
- Validate the entered search value.
- Submit a search and inspect the resulting URL.

### 3. Product Interaction Tests
- Search for a jewellery product.
- Open the product options popup using the quick-add control.
- Verify the popup's Add to Cart button is visible.
- Trigger the Add to Cart action using the default-selected options.

### 4. Shopping Cart Tests
- Perform the product search and add-to-cart workflow.
- Navigate to the shopping cart.
- Verify that the cart page opens.

**Coverage note:** The current tests validate selected UI interactions and navigation. Product persistence in the cart, cart contents, checkout completion, payment and order placement are not claimed as verified unless corresponding assertions are implemented and pass.

## 🏗️ Project Structure

```text
Palmonas-Ecommerce-Automation/
│
├── src/
│   └── test/
│       └── java/
│           ├── Base/
│           │   └── BaseTest.java
│           │
│           ├── Page/
│           │   ├── Home_Page.java
│           │   ├── Search_Page.java
│           │   ├── Product_Page.java
│           │   └── Cart_Page.java
│           │
│           └── tests/
│               ├── Home_tests.java
│               ├── Search_tests.java
│               ├── Product_tests.java
│               └── Cart_tests.java
│
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Before running the tests, install:

- Java Development Kit (JDK) 19
- Apache Maven
- Google Chrome
- An IDE such as Eclipse or IntelliJ IDEA

Selenium Manager can automatically resolve the appropriate browser driver in supported configurations.

## 🚀 Setup and Execution

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/Palmonas-Ecommerce-Automation.git
```

### 2. Navigate to the project

```bash
cd Palmonas-Ecommerce-Automation
```

### 3. Install dependencies and run tests

```bash
mvn clean test
```

Alternatively, run an individual test class from your IDE using **Run As → TestNG Test**.

## 🧩 Framework Design

The project follows the Page Object Model to separate page interactions from test logic.

- **Base:** Initialises and closes the browser for each test.
- **Page:** Contains page locators and reusable interaction methods.
- **tests:** Contains TestNG test cases and assertions.
- **pom.xml:** Defines Selenium, TestNG and Maven build dependencies.

Explicit waits are used to synchronise interactions with elements that appear dynamically.

## 🔍 Limitations and Future Enhancements

Potential improvements include:

- Verify actual product details and selected variants.
- Assert that the cart count increases after adding a product.
- Validate product names and quantities in the cart.
- Add negative and boundary test scenarios.
- Capture screenshots when tests fail.
- Generate TestNG or Maven Surefire test reports.
- Expand coverage to permitted checkout validation scenarios.

Live websites may change their layout, selectors or behaviour. Tests may require maintenance when the application changes.

## ⚠️ Responsible Testing

This project is intended for educational and portfolio demonstration purposes. Automated interaction with the live website should comply with its applicable terms and policies. No real purchases or payments are intended.

## 👩‍💻 Author

**QA Automation Portfolio Project**

Developed using Java, Selenium WebDriver, TestNG, Maven and Page Object Model.
