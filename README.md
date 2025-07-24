
# 🚀 BioSched

BioSched is a full-stack biometric appointment scheduling and verification system tailored for federal and immigration processes. It enables secure appointment handling, background verification, and user management with clearly defined role-based workflows.

---

## 🧱 Tech Stack

### 🔧 Backend
- **Java Spring Boot** – RESTful API development
- **Spring Security** – Role-based access control
- **Spring Mail** – Email service for notifications
- **MySQL** – Relational database
- **Lombok** – Reduces boilerplate code
- **MapStruct** – DTO mapping
- **Docker** – Containerization

### 🎨 Frontend
- **React** – UI library
- **Redux** – Global state management
- **Tailwind CSS** or **MUI** – Styling
- **Axios** – HTTP client for API calls

### ⚙️ Infrastructure / Dev Tools
- **Docker Compose** – Orchestrates backend, frontend, and DB services
- **MySQL Workbench** – GUI for database inspection
- **Postman** – API testing

---

## 🧩 Core Roles & Workflow

### 👤 User
- Fills out an **Intake Form** with personal info.
- Receives an **appointment email** with nearest ASC (Application Support Center) details.

### 🏢 ascUser
- Accesses a **dashboard of upcoming appointments**.
- Marks users as **attended** once they arrive.

### 🔍 backgroundCheckUser
- Sees **attended applicants**.
- Conducts **background verification**.
- Marks the outcome as **Approved** or **Denied**.

### 🛠 Admin
- Manages **users and roles**.
- Monitors **system activity and logs**.
- Has full access to the system.

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Node.js 18+
- Docker + Docker Compose
- MySQL Workbench (optional)

### 🔄 Setup
1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-org/biosched.git
   cd biosched

2. **Start Services with Docker Compose**
   ```bash
   docker-compose up --build

3. **Access the App**
- Frontend: http://localhost:3000
- Backend API: http://localhost:8080/api
- MySQL: localhost:3306
   - Username: root
   - Password: password

### 📫 API Testing
- Use Postman and import the API collection provided in the /docs directory.

### 📌 Notes
- Frontend and backend containers watch for file changes if volumes are mounted.
- Email service requires SMTP configuration (e.g., Gmail SMTP or Mailtrap).
- All role-based endpoints are secured using Spring Security and JWT tokens.

