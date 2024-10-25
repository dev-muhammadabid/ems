# EMS - Employee Management System

EMS (Employee Management System) is a **web-based application** designed to manage and store employee details efficiently. It offers features such as adding new employee information, editing existing records, and deleting employee details, making it a comprehensive solution for HR and employee management.

## Features

- **Add Employee**: Easily add employee information such as name, designation, department, and contact details.
- **Edit Employee**: Modify existing employee records with updated information.
- **Delete Employee**: Remove employee details from the system when they leave the organization.
- **View Employee Details**: View a list of all employees with relevant details.

## Tech Stack

- **Backend**: Java with Spring Boot
- **Frontend**: Bootstrap for responsive UI design
- **Database**: MySQL (or any relational database) for employee data storage
- **Build Tool**: Maven
- **API Documentation**: Swagger UI (optional)

## Getting Started

### Prerequisites

- **Java** 23
- **Maven**
- **MySQL**
- **IDE** (IntelliJ IDEA)

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/dev-muhamamdabid/ems.git
    ```
2. **Navigate to the project directory**:
    ```bash
    cd ems
    ```
3. **Configure the database connection**:
    Open the `application.properties` (or `application.yml`) file inside `src/main/resources` and update your database connection:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ems
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
4. **Build the project**:
    If using Maven:
    ```bash
    mvn clean install
    ```
5. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

### Access the Application

After the application starts successfully, you can access it via:
- `http://localhost:8080`

## Frontend Customization

**Bootstrap** is used for the frontend to build a simple, responsive, and clean user interface. You can easily customize the look and feel by updating the styles defined in the `src/main/resources/templates/html` directory.

## API Endpoints

- `GET /employees`: Retrieve a list of all employees.
- `POST /employees`: Add a new employee.
- `PUT /employees/{id}`: Update an existing employee.
- `DELETE /employees/{id}`: Remove an employee by ID.

## Contributions

Contributions, issues, and feature requests are welcome! Feel free to check out the issues and submit a pull request.

### How to Contribute

1. **Fork the Project**
2. **Create your Feature Branch**:
    ```bash
    git checkout -b feature/AmazingFeature
    ```
3. **Commit your Changes**:
    ```bash
    git commit -m 'Add some AmazingFeature'
    ```
4. **Push to the Branch**:
    ```bash
    git push origin feature/AmazingFeature
    ```
5. **Open a Pull Request**

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Author

**Muhammad Abid**

- **GitHub**: [@dev-muhammadabid](https://github.com/dev-muhammadabid)
- **Email**: mail.muhammadabid@gmail.com

Feel free to reach out for any questions or collaboration!
