# Tracking Number Generator API

This project is a RESTful API that generates unique tracking numbers for parcels. Designed with scalability and concurrency in mind, the API can handle high traffic and concurrent requests efficiently.

## Features
- Generates unique tracking numbers for parcels. 
- Designed to be efficient, scalable, and capable of handling concurrent requests. 
- Implements a sample /next-tracking-number endpoint that takes parameters to create unique tracking numbers based on parcel details.

## Technologies Used
- Java 17
- Spring Boot 3 
- Spring Data JPA 
- H2 Database (for local development/testing)
- Maven

## Getting Started
### Prerequisites
1. Java 17: Ensure that Java 17 or higher is installed. Check the version with:
  ``` java -version ```

2. Maven: Ensure Maven is installed to manage dependencies and run the project. Check the version with:
    ```mvn -version```
3. Spring Boot: Ensure Spring Boot is installed and configured correctly. Check the version with:
    ```mvn spring-boot:version```

## Installation and Setup
### 1. Clone the repository:
```bash
git clone git@github.com:srinivasboga/Getrosoft_Assessment.git
cd Getrosoft_Assessment
```
### 2. Build the project:
```bash
mvn clean install   
```
### 3. Run the project:
```bash
mvn spring-boot:run
```
By default, the application will start at http://localhost:8080.

## API Usage
### Endpoint: `GET /next-tracking-number`
Generate a unique tracking number for a parcel.
### URL: `http://localhost:8080/next-tracking-number`
### Method: `GET`
### Query Parameters
- `origin_country_id`: (String) ISO 3166-1 alpha-2 country code for the origin (e.g., "MY"). 
- `destination_country_id`: (String) ISO 3166-1 alpha-2 country code for the destination (e.g., "ID"). 
- `weight`: (Decimal) Parcel weight up to three decimal places (e.g., "1.234"). 
- `created_at`: (String) RFC 3339 timestamp of the order creation (e.g., "2018-11-20T19:29:32+08:00"). 
- `customer_id`: (String) UUID for the customer (e.g., "de619854-b59b-425e-9db4-943979e1bd49"). 
- `customer_name`: (String) Customer’s name (e.g., "RedBox Logistics"). 
- `customer_slug`: (String) Customer’s slug-case name (e.g., "redbox-logistics").

- ### Example Request:
```bash
curl "http://localhost:8080/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2018-11-20T19:29:32+08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics"
```
- ### Example Response:
```bash
{
  "tracking_number": "AB1234567890",
  "created_at": "2024-10-28T08:00:00Z"
}
```

## Testing
1. ### Run Unit Tests:
```bash
mvn test
```
2. ### Testing Concurrent Requests: 
    You can test the API's concurrency handling by running multiple parallel requests. Tools like Apache JMeter or simple scripts can be used to simulate high concurrency.

## Additional Notes
- This API uses an in-memory H2 database for local testing. For production, replace the H2 database with a persistent database such as PostgreSQL or MySQL.
- Ensure security best practices are followed, especially when deploying to production.