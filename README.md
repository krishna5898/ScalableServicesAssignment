Overview of the Project:

Grooming Easy is an innovative e-commerce platform that bridges the gap between consumers and salons. Recognizing that grooming is a vital aspect of our lives and addressing an unmet demand, we set out to simplify the process of finding the perfect salon that caters to individual needs.
With Grooming Easy, customers can explore various grooming options, including hairstyles, beard styles, hair colors, and the latest trends, all through the power of AI and VR visualization. Our platform allows users to visualize their chosen styles, making the decision process easier and more informed.
Once a style is selected, customers can effortlessly locate nearby salons within a few kilometers, book appointments, and place orders as needed. Grooming Easy ensures that the path to personal style and grooming is convenient, seamless, and tailored to every individual's preferences.

Salon Locator:
An interactive map to find nearby salons within a few kilometers.
Filter options based on services offered, customer reviews, and ratings.
Appointment Booking:
Easy online booking system with options to choose stylists and preferred time slots.
Real-time availability of salons and stylists.

Salon Service:
Command Side:
Function: Handle appointment bookings and updates.
Operations:
POST /appointments: Create a new appointment.
DELETE /appointment/{id}: Delete an existing appointment.
Data Store: MySQL database optimized for write operations.
Handling: Use a command handler to process the request and update the database.
Query Side:
Function: Retrieve appointment information.
Operations:
GET /appointments: Fetches a list of appointments.
GET /appointment/{id}: Fetches details of a specific appointment.
Data Store: MySQL database or a read-optimized cache.
Handling: Use a query handler to fetch data from the database or cache.

Technologies Used
Java: Programming language used to build the service.

Spring Boot: Framework used for building the RESTful APIs.

MySQL: Database used for storing salon-related data.

Kafka: Message broker used for event-driven communication.

Docker: Containerization platform used to deploy the service.

Kubernetes: Orchestration platform used to manage the deployment.

Prerequisites
Java 11 or higher

Maven: For building the project

MySQL: Database setup and running

Kafka: Message broker setup and running

Docker: Installed and configured

Kubernetes: Cluster setup and configured


Update the application.properties file with your MySQL database configuration:
spring.datasource.url=jdbc:mysql://localhost:3306/salon_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Build Docker Image:
Generate read me for salon service
Sure! Here is a sample README for the Salon Service:

Salon Service
Overview
The Salon Service is a microservice designed to manage salon operations, including booking appointments, managing stylist schedules, and handling customer data. This service leverages a MySQL database for data storage and provides RESTful APIs for interaction.

Features
Appointment Booking: Customers can book appointments with their preferred stylists.

Stylist Management: Manage stylist schedules and availability.

Customer Management: Store and retrieve customer information.

Notifications: Send notifications for appointment reminders and confirmations.

Technologies Used
Java: Programming language used to build the service.

Spring Boot: Framework used for building the RESTful APIs.

MySQL: Database used for storing salon-related data.

Kafka: Message broker used for event-driven communication.

Docker: Containerization platform used to deploy the service.

Kubernetes: Orchestration platform used to manage the deployment.

Prerequisites
Java 11 or higher

Maven: For building the project

MySQL: Database setup and running

Kafka: Message broker setup and running

Docker: Installed and configured

Kubernetes: Cluster setup and configured

Getting Started
Clone the Repository
sh
git clone https://github.com/your-repo/salon-service.git
cd salon-service
Configure Database
Update the application.properties file with your MySQL database configuration:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/salon_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Build the Project
sh
mvn clean install
Run the Service
sh
java -jar target/salon-service.jar
Docker
Build Docker Image
docker build -t salon-service .
docker run -d -p 8080:8080 --name salon-service salon-service
Apply the Kubernetes configurations:
kubectl apply -f kubernetes/salon-service/deployment.yaml
kubectl apply -f kubernetes/salon-service/service.yaml
