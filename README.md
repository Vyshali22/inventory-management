# Inventory Management System

A full-stack Inventory Management System built with Java and Spring Boot, 
featuring JWT authentication, REST APIs, and MySQL database integration.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

🚀 Built independently to demonstrate full-stack Java development skills

💡 Technologies: Java 17 · Spring Boot 3.3.5 · MySQL 8.0 · JWT · REST API · Hibernate ORM

## Tech Stack
- **Backend:** Java 17, Spring Boot 3.3.5
- **Security:** Spring Security, JWT Authentication
- **Database:** MySQL 8.0, Spring Data JPA, Hibernate
- **Tools:** Maven, Postman, IntelliJ IDEA

## Features
- JWT-based user authentication (Register/Login)
- Full CRUD operations for Products and Categories
- Low stock alert system
- Secure REST APIs with Bearer token authorization
- Auto table creation using Hibernate

## API Endpoints

### Auth
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/auth/register | Register new user |
| POST | /api/auth/login | Login and get JWT token |

### Products
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product by ID |
| POST | /api/products | Create product |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |
| GET | /api/products/low-stock | Get low stock products |

### Categories
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/categories | Get all categories |
| POST | /api/categories | Create category |
| DELETE | /api/categories/{id} | Delete category |

## Setup Instructions
1. Clone the repository
2. Create MySQL database: `CREATE DATABASE inventory_db;`
3. Update `application.properties` with your MySQL credentials
4. Run the application using IntelliJ or `mvn spring-boot:run`
5. Test APIs using Postman

## Related Experience
Built alongside:
- Tata iQ GenAI Powered Data Analytics (Forage)
- British Airways Data Science (Forage)
- JPMorgan Chase Software Engineering (Forage)
