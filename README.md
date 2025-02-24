# Event Space Rental System

This project is a **Java-based Event Space Rental System** using **Hibernate, Spring, and MySQL**. It allows users to manage event bookings, spaces, and customers efficiently.

## 📌 Features
- User Registration & Authentication
- Event Space Management (Add, Update, Delete, View)
- Booking System with Availability Checks
- Payment Processing Integration (Optional)
- Admin Dashboard for Management
- Hibernate ORM for Database Operations

---

## 🏗️ Project Structure

```
Assignment03/
├── src/main/java/
│   ├── com.src.Assignment03/
│   │   ├── dao/        # Data Access Objects (DAO Layer)
│   │   ├── event/      # Event-related classes
│   │   ├── main/       # Main application runner
│   │   ├── model/      # Entity classes (Event, Booking, User)
│   │   ├── util/       # Utility classes (Hibernate config, etc.)
│
├── src/test/java/      # Unit Tests (if any)
├── pom.xml             # Maven dependencies (Hibernate, Spring, MySQL)
└── README.md           # Project Documentation
```

---

## 🛠️ Setup & Installation

### 1️⃣ Prerequisites
- Java 8 or higher
- MySQL Database
- Maven
- Eclipse/IntelliJ IDEA (Recommended)

### 2️⃣ Clone Repository
```sh
git clone https://github.com/your-repo/event-space-rental.git
cd event-space-rental
```

### 3️⃣ Configure Database
1. Open MySQL and create a database:
   ```sql
   CREATE DATABASE event_rental;
   ```
2. Update `hibernate.cfg.xml` with your database credentials.

### 4️⃣ Build & Run the Project
```sh
mvn clean install
mvn spring-boot:run
```

---

## 🔑 Technologies Used
- **Backend:** Java, Spring, Hibernate
- **Database:** MySQL
- **ORM:** Hibernate
- **Build Tool:** Maven
- **IDE:** Eclipse/IntelliJ

---

## 📜 License
This project is licensed under the MIT License.

---

## 🤝 Contributors
- **Samrudhi Borawake** *(Your Name Here)*
- Feel free to contribute! Fork the repo and submit a PR. 🚀
