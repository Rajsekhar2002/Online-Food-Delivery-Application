# Online Food Delivery Application

A full-stack online food delivery application developed using **Spring Boot and React.js**, with separate customer and admin interfaces. The application provides food browsing, cart management, order placement, order tracking, authentication, and online payment integration.

 Tech Stack

 Backend

* Java
* Spring Boot
* Spring Security
* JWT Authentication
* MongoDB
* AWS S3
* REST APIs
* Maven

 Customer Frontend

* React.js
* Vite
* Bootstrap
* React Router

 Admin Panel

* React.js
* Vite
* Bootstrap
* React Router

 Payment

* Razorpay

 Project Structure

```text
online-food-delivery-project/
├── foodiesapi/       # Spring Boot REST API backend
├── foodies/          # Customer frontend
├── adminpanel/       # Admin frontend
└── food images/      # Food image resources
```

 Key Features

* User registration and login
* JWT-based authentication and authorization
* Secure password handling using Spring Security
* Food listing and search
* Shopping cart management
* Order placement
* Order tracking and status management
* Admin food management
* Admin order management
* AWS S3 integration for food image storage
* Razorpay payment integration
* RESTful API architecture
* MongoDB database integration

Prerequisites

Make sure the following are installed before running the project:

* Java 21 or later
* Maven
* Node.js 18 or later
* MongoDB
* Git

 Backend Setup

Navigate to the backend directory:

```bash
cd online-food-delivery-project/foodiesapi
```

Run the Spring Boot application:

```bash
./mvnw spring-boot:run
```

On Windows, you can use:

```bash
mvnw.cmd spring-boot:run
```

 Customer Frontend Setup

Navigate to the customer frontend:

```bash
cd online-food-delivery-project/foodies
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm run dev
```

## Admin Panel Setup

Navigate to the admin panel:

```bash
cd online-food-delivery-project/adminpanel
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm run dev
```

 Configuration

Before running the backend, configure the required environment variables in your local environment.

The backend uses environment variables for sensitive configuration such as:

* MongoDB configuration
* AWS S3 credentials
* JWT secret
* Razorpay credentials

Do not commit actual API keys, passwords, or secret credentials to GitHub.

 Application Modules

 Customer

* Register and log in
* Browse available food items
* Search for food
* Add items to cart
* Place orders
* Make online payments
* Track order status

Admin

* Manage food items
* Manage food images
* View and manage customer orders
* Update order status

## Project Purpose
This project was developed as a **full-stack software development project** to demonstrate practical knowledge of Java, Spring Boot, REST APIs, Spring Security, JWT, MongoDB, React.js, AWS S3, and payment integration.


![image alt](https://github.com/Rajsekhar2002/Online-Food-Delivery-Application/blob/abb24ab8860c76617d3a80780bc3b8d0dcfa80a5/Screenshot%20(189).png)
![image alt](https://github.com/Rajsekhar2002/Online-Food-Delivery-Application/blob/abb24ab8860c76617d3a80780bc3b8d0dcfa80a5/Screenshot%20(190).png)
![image alt](https://github.com/Rajsekhar2002/Online-Food-Delivery-Application/blob/abb24ab8860c76617d3a80780bc3b8d0dcfa80a5/Screenshot%20(191).png)
![image alt](https://github.com/Rajsekhar2002/Online-Food-Delivery-Application/blob/abb24ab8860c76617d3a80780bc3b8d0dcfa80a5/Screenshot%20(192).png)
![image alt](https://github.com/Rajsekhar2002/Online-Food-Delivery-Application/blob/abb24ab8860c76617d3a80780bc3b8d0dcfa80a5/Screenshot%20(193).png)
![image alt](https://github.com/Rajsekhar2002/Online-Food-Delivery-Application/blob/abb24ab8860c76617d3a80780bc3b8d0dcfa80a5/Screenshot%20(194).png)

