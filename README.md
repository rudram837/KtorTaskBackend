# KtorTaskBackend

A RESTful Task Management Backend built with **Kotlin** and **Ktor**. This project demonstrates CRUD (Create, Read, Update, Delete) operations using JSON serialization and in-memory data storage.

## 🚀 Features

- Create Task
- Retrieve All Tasks
- Update Existing Task
- Delete Task
- RESTful API
- JSON Serialization
- In-Memory Storage

## 🛠 Tech Stack

- Kotlin
- Ktor
- Netty
- Kotlinx Serialization
- Gradle

## 📌 API Endpoints

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| GET | `/task` | Get all tasks |
| POST | `/task` | Create a task |
| PUT | `/task/{id}` | Update a task |
| DELETE | `/task/{id}` | Delete a task |

## 📤 Sample Request

**POST** `/task`

```json
{
  "name": "Learn Ktor",
  "description": "Build a REST API",
  "priority": "HIGH"
}
```

### Response

```json
{
  "id": 1,
  "name": "Learn Ktor",
  "description": "Build a REST API",
  "priority": "HIGH"
}
```

## ▶️ Run Locally

Clone the repository:

```bash
git clone https://github.com/rudram837/KtorTaskBackend.git
```

Move into the project directory:

```bash
cd KtorTaskBackend
```

Run the application:

```bash
./gradlew run
```

Server URL:

```
http://localhost:8088
```

## 🧪 Tested Using

- Postman
- Browser

## 📈 Future Improvements

- Database Integration (MySQL/PostgreSQL)
- JWT Authentication
- Request Validation
- Global Exception Handling
- Unit Testing

## Author

👤 **Rudra Maurya**

* LinkedIn: [@rudramaurya](https://www.linkedin.com/in/rudra-maurya-6bb350253?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app)
* GitHub: [@rudramaurya](https://github.com/rudram837)
* Portfolio: [@Rudra](https://rudram837-portfolio.netlify.app/)
