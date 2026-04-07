****🎟️ Event Ticket Booking System**
A high-concurrency Event Ticket Booking System built using Spring Boot, designed to handle real-world challenges like simultaneous seat booking, data consistency, and scalable backend architecture.

🚀 **Features**
🔐 JWT-based Authentication & Authorization (USER / ADMIN)
🎭 Event Management (Create, Update, Delete Events)
🎟️ Dynamic Seat Generation & Availability Tracking
⚡ High-Concurrency Booking System
🔒 Redis Distributed Locking + Optimistic Locking
💳 Payment Simulation with Success/Failure Handling
⏱️ Auto-release of locked seats (Scheduler)
📡 Kafka-based Event-Driven Architecture
⚡ Redis Caching for performance optimization
📊 Swagger API Documentation
🐳 Dockerized setup
🏗️ Tech Stack
Java 17, Spring Boot
Spring Security + JWT
Spring Data JPA (Hibernate)
MySQL
Redis
Kafka
Docker & Docker Compose
Swagger / OpenAPI



🧠 **System Highlights*****
Prevents double booking using:
Optimistic locking (@Version)
Redis distributed locks
Ensures data consistency with transactions
Handles concurrent booking scenarios efficiently
Event-driven communication using Kafka

**🔁 Booking Flow**
User selects seats
System validates availability
Redis lock is acquired
Booking created (PENDING)
Payment processed
On success → CONFIRMED & seats BOOKED
On failure → FAILED & seats released
