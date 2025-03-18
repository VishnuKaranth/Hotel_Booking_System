# OceanSide Hotel Booking System

## Overview

The **OceanSide Hotel Booking System** is a full-stack web application that enables users to book hotel rooms online. The system provides functionalities such as user authentication, room selection, and booking management.

## Features

- **User Authentication:** Secure login and registration using JWT-based authentication.
- **Hotel Room Booking:** Users can browse available rooms, view pricing, and make reservations.
- **Manage Bookings:** Users can view their booking details using a unique booking ID.
- **Responsive UI:** Built with React and Tailwind CSS to ensure a seamless user experience.
- **Spring Boot Backend:** Handles user authentication and booking management.
- **MySQL Database:** Stores user and booking information securely.

## Tech Stack

### Frontend

- React.js
- Tailwind CSS
- Axios (for API communication)

### Backend

- Spring Boot
- JWT Authentication
- MySQL

## Installation and Setup

### Prerequisites

Ensure you have the following installed:

- Java 17 or higher
- Node.js and npm
- MySQL Server
- Maven

### Backend Setup (Spring Boot)

1. **Clone the repository:**
   ```bash
   git clone https://github.com/VishnuKaranth/Hotel_Booking_System.git
   cd Hotel_Booking_System/oceanSide-hotel
   ```

2. **Configure the MySQL database in `src/main/resources/application.properties`:**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. **Build and run the Spring Boot application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup (React)

1. **Navigate to the frontend directory:**
   ```bash
   cd ../oceanSide-hotel Client 
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Start the development server:**
   ```bash
   npm start
   ```

## API Endpoints

### Authentication

- `POST /api/auth/signup` - Register a new user
- `POST /api/auth/login` - Authenticate a user

### Bookings

- `POST /api/bookings/create` - Create a new booking
- `GET /api/bookings/{id}` - Retrieve booking details by ID

## Deployment


## Future Enhancements

- Implement payment integration to handle online transactions.
- Add functionality to download booking details as PDFs.
- Introduce real-time room availability status.
- Implement email confirmations for bookings.
- Enhance the user interface with additional features and animations.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Open a pull request detailing your changes.

## License

This project is licensed under the MIT License.

## Contact

For any questions or inquiries:

- GitHub: [VishnuKaranth](https://github.com/VishnuKaranth)
- Email: [vishnukaranth04@gmail.com](mailto:vishnukaranth04@@gmail.com)

---

