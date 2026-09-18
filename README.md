# Online Food Delivery Project

This project is a full-stack online food delivery application built with a Spring Boot backend and React frontends.

## Tech Stack
- Backend: Java, Spring Boot, Spring Security, JWT, MongoDB, AWS S3
- Frontend: React, Vite, Bootstrap, React Router
- Admin panel: React + Vite

## Project Structure
- `online-food-delivery-project/foodiesapi` - REST API backend
- `online-food-delivery-project/foodies` - customer frontend
- `online-food-delivery-project/adminpanel` - admin frontend

## Features
- User registration and login
- Food listing and search
- Cart management
- Order placement and tracking
- Admin food and order management
- Razorpay payment integration

## Prerequisites
- Java 21+
- Maven
- Node.js 18+
- MongoDB running locally or configured remotely

## Run Backend
```bash
cd online-food-delivery-project/foodiesapi
./mvnw spring-boot:run
```

## Run Customer Frontend
```bash
cd online-food-delivery-project/foodies
npm install
npm run dev
```

## Run Admin Frontend
```bash
cd online-food-delivery-project/adminpanel
npm install
npm run dev
```

## Notes
- Update MongoDB and environment-specific configuration in the backend `application.properties` file before running the app.
- The project was prepared for GitHub publishing after fixing the Java encoding issues and completing repo setup.
