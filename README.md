# 🎓 Spring Boot Student Management

> Student management REST API built with Spring Boot

## 📋 What I Learned

Through following AliBou Coding's Spring Boot tutorial, I gained hands-on experience with:

- **Spring Boot** - Application setup and configuration
- **REST API** - Creating GET, POST, PUT, DELETE endpoints
- **Spring Data JPA** - Database operations and entity mapping
- **Dependency Injection** - Service layer architecture
- **Git & GitHub** - Version control and repository management

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web & Spring Data JPA
- H2 Database
- Maven
- Git

## 🚀 Quick Start

```bash
# Clone and run
git clone [your-repo-url]
cd student-management
mvn spring-boot:run
```

Application runs on `http://localhost:8080`

## 📚 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/students` | Get all students |
| GET | `/api/v1/students/{id}` | Get student by ID |
| POST | `/api/v1/students` | Create student |
| PUT | `/api/v1/students/{id}` | Update student |
| DELETE | `/api/v1/students/{id}` | Delete student |

## 📝 Example Usage

**Create Student:**
```json
POST /api/v1/students
{
    "firstname": "Tarik",
    "lastname": "Rizvic",
    "dateOfBirth": "2003-08-01",
    "email": "trizvic1@etf.unsa.ba"
}
```

## 🏗️ Project Structure

- `StudentController` - REST endpoints
- `StudentService` - Business logic
- `StudentRepository` - Data access (JPA)
- `Student` - Entity class

## 📺 Tutorial Credit

Built following [AliBou Coding's Spring Boot Tutorial](https://www.youtube.com/watch?v=wsq1-m1dy_I)

---

**My first Spring Boot application** ✨
