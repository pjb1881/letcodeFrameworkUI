# LetcodeAutomation 🚀

LetcodeAutomation is a simple Selenium-based test automation framework created during my initial learning phase of Automation Testing in the latter half of 2022. It is designed to automate and validate several functionalities on the [LetCode](https://letcode.in/) practice site.

> 📌 **Note:** This is an early-stage learning project and may not reflect current best practices in automation architecture or tooling.

---

## 📚 Project Summary

- **Tech Stack:** Java, Selenium WebDriver, TestNG, Maven, ExtentReports
- **Target Site:** [https://letcode.in/](https://letcode.in/)
- **Use Cases Covered:**
  - Form input validation
  - Button interactions and location validations
  - Field disabling and readonly field checks
  - Navigation between workspace and feature-specific pages
  - Excel-driven data management using Apache POI

---

## 📁 Project Structure

letcodeAutomation/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com.web.letcode/ → Core logic (locators, screens, utilities)
│ └── test/
│ └── java/
│ └── com.web.letcode.tests/ → Test classes using TestNG
│ └── resources/
│ ├── Reports/ → ExtentReport HTML outputs
│ └── utilities/
│ └── env/ → Excel sheets (links.xlsx, keys.xlsx)
│
├── pom.xml → Maven dependencies
└── README.md → This file


---

## ⚙️ How to Run

### 🔧 Prerequisites

- JDK 8 or later (Recommended: JDK 11+)
- Maven 3.x
- Internet access to download dependencies (ChromeDriver via WebDriverManager)

### ▶️ Command to Execute

```bash
mvn clean install -DbrowserType=Chrome

You can pass "edge" instead of "Chrome" if you want to use Microsoft Edge.

🧪 Reporting
ExtentReports are auto-generated at:
src/test/resources/Reports/LetcodeInputTest.html

📦 Dependencies
Dependencies are managed using Maven. Key libraries:

selenium-java

testng

extent-reports

apache poi for Excel reading

log4j for logging

webdrivermanager for automatic driver management

📝 Notes
This project does not use a PageFactory or advanced design patterns (such as Page Object + Factory or BDD).

It was built as part of a learning journey and can serve as a reference for beginners starting automation with Java and Selenium.

👨‍💻 Author
Jagadeesh Bhaskar Parimi
📅 Created in: 2022 (During learning phase)
🌐 LinkedIn -> https://www.linkedin.com/in/jagadeesh-bhaskar-p-352373180/

