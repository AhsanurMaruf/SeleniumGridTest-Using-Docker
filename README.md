# 🚀 Selenium Grid Cross-Browser Testing with Docker

This project demonstrates how to perform **cross-browser testing** using **Selenium Grid 4** on **Docker**. The automation runs on **Chrome**, **Firefox**, and **Microsoft Edge** browsers using a centralized Selenium Grid hub.

---

## 🧰 Technologies Used

- Java
- Selenium WebDriver (v4.20.0)
- Docker & Docker Compose
- Selenium Grid 4
- Eclipse IDE
- Maven

---

## 🧪 Browsers Supported

- ✅ Google Chrome
- ✅ Mozilla Firefox
- ✅ Microsoft Edge

---

## ⚙️ Prerequisites

Make sure the following are installed:

- ✅ Docker & Docker Compose
- ✅ Eclipse IDE (or any other Java IDE)
- ✅ Java JDK 11+ (Tested on Java 23)
- ✅ WSL 2 (For Windows 10/11 users)
- ✅ Internet (to pull browser images from Docker Hub)

---

## Start Selenium Grid via Docker Compose

docker-compose up -d

This will start:

    🧠 Selenium Hub

    🌐 Chrome Node

    🦊 Firefox Node

    🟦 Edge Node

## Check Selenium Grid UI

Visit the Grid status:

http://localhost:4444/ui

## ▶️ Running the Tests
🔸 From Eclipse:

    Import the Maven project into Eclipse.

    Open the Rcms.java file.

    Right-click on the file → Run As → Java Application.

The test will run on Chrome, Firefox, and Edge, and print page titles to the console.
🛑 Stop Selenium Grid

docker-compose down

## 📁 Project Structure

selenium-grid-cross-browser/
├── docker-compose.yml
├── pom.xml
└── src/
    └── test/
        └── java/
            └── Rcms.java

## 🔐 Test Scenario

    Opens the RCMS Login Portal

    Fills in:

        Username: Example.com.bd

        Password

    Clicks the Login button

    Checks if login is successful and prints the browser title

🧠 Concepts Demonstrated

    Cross-browser automation with Selenium Grid

    Dockerized Selenium environment setup

    Java WebDriver automation using RemoteWebDriver

    Parallel browser sessions in different containers
