# Serenity BDD + Cucumber + JUnit Framework

A simple UI test automation framework using **Serenity BDD**, **Cucumber**, and **JUnit**, compatible with **Java 1.8** and **Gradle 8.1.6**. This sample demonstrates launching a browser and redirecting to a website (Google).

## 📁 Project Structure

```
serenity-bdd-cucumber-junit/
├── build.gradle
├── serenity.conf
├── Dockerfile
├── docker-compose.yml
├── src/
│   └── test/
│       ├── java/
│       │   ├── steps/RedirectSteps.java
│       │   ├── pages/HomePage.java
│       │   └── runners/CucumberTestSuite.java
│       └── resources/
│           └── features/redirect.feature
```

## 📦 Dependencies Used

- `serenity-core`: Core library for Serenity
- `serenity-junit`: Integration with JUnit 4
- `serenity-cucumber`: Cucumber integration
- `cucumber-java`: Glue logic (step definitions)
- `cucumber-junit`: JUnit runner for Cucumber
- `junit`: JUnit test framework

## ⚙️ Setup

### Prerequisites
- Java 1.8
- Gradle 8.1.6+
- Chrome installed
- Docker (optional)

### Build the project
```bash
gradle clean build
```

## ▶️ Execute Tests

### Using Gradle
```bash
gradle test
```

### Using Docker
```bash
docker build -t serenity-tests .
docker run --rm serenity-tests
```

### Using Docker Compose
```bash
docker-compose up --build
```

## 📊 Serenity Report

After running the tests, open:
```
target/site/serenity/index.html
```

## 🔄 Redirect Feature (Sample)

**Feature File:**
```gherkin
Feature: Website Redirection

  Scenario: Open Google Homepage
    Given I open the Google homepage
```

## 🐳 Docker Integration

Docker and Docker Compose are included for easy execution in isolated environments.

## 🚀 Parallel Execution (Concept)

JUnit 4 doesn't support true parallelism. Simulate it by:
- Splitting test cases into separate runners
- Using CI pipelines with multiple containers

## 📧 Email Report (Manual)

Example:
```bash
echo "Test Report" | mutt -s "Serenity Report" -a target/site/serenity/index.html -- your.email@example.com
```

## ✅ Tested On

- Java 1.8
- Gradle 8.1.6
- Chrome 124+
- Serenity BDD 3.6.12
- Cucumber Java 7.11.1
- JUnit 4.13.2

## 🪪 License

Free to use and modify.

## 🙋 Need Help?

If you want to:
- Add CI/CD (GitHub Actions, Jenkins, etc.)
- Integrate Allure reporting
- Add API testing
- Set up cloud browsers (e.g., Selenium Grid, BrowserStack)

Let me know and I’ll help you extend the project!