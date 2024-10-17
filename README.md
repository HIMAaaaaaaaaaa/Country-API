# API Backend Project

## Overview
This project demonstrates the creation of APIs that interact with an Oracle database. Each API is responsible for different functionality, such as retrieving, adding, updating, or deleting data. The data is displayed on a frontend web page using the Angular framework, where each API's information is presented after being fetched from the database. The APIs are tested using Postman to verify the implementation of various HTTP methods like GET, POST, UPDATE, and DELETE.

## Goal
The main goal of the project is to retrieve and display data from the Oracle database using PL/SQL, and present the information through a frontend web page built with Angular. An example of the displayed data includes employee information such as:

- **REGION_ID**: Unique identifier for the region.
- **COUNTRY_NAME**: Name of the country.
- **COUNTRY_ID**: Unique identifier for the country.

## Features
- Connects to an Oracle database
- Supports full CRUD operations:
  - **GET**: Retrieve data from the database
  - **POST**: Add new data
  - **UPDATE**: Modify existing data
  - **DELETE**: Remove data from the database
- Displays data on a web page using Angular framework
- Tested using Postman to ensure proper functionality

## Tools Used
- **Spring Boot** for creating the APIs
- **Postman** for testing and verifying API responses
- **Oracle Database** using PL/SQL for storing and managing data
- **Angular** for frontend development and displaying API data

## Getting Started
To run the project locally:
1. Clone the repository.
2. Set up the Oracle database and configure the connection.
3. Use Postman to test the APIs with the given URLs.
4. Run the Angular frontend to display the data.

## API Endpoints
Here are the API endpoints and their corresponding actions:
1. **GET /api/entity**: Retrieve a list of entities.
2. **POST /api/entity**: Add a new entity to the database.
3. **PUT /api/entity/{id}**: Update an existing entity.
4. **DELETE /api/entity/{id}**: Remove an entity from the database.
5. **GET /api/entity/{id}**: Retrieve a specific entity by its ID.

## Future Enhancements
- Add authentication and authorization
- Implement advanced queries and filters
