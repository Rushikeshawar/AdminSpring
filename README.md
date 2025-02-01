# Admin Panel (Spring Boot + Hibernate Project)

## Tech Stack:

**Frontend:** React.js / Angular, HTML, CSS, Bootstrap  
**Backend:** Spring Boot (Java)  
**Database:** Hibernate  
**Authentication:** JWT (JSON Web Token)  

## Project Overview

This is an admin panel designed to help admins manage products in an e-commerce platform. The application allows for adding, viewing, updating, and deleting products, with access secured via JWT authentication. The backend is built using Spring Boot with Hibernate as the ORM framework, and the database is managed using MySQL.

## Features & Functionality

### 1. Authentication (Login & Registration)
- Admin can log in using JWT authentication.
- Upon successful login, the Navbar with product management options becomes visible.

### 2. Navbar (Visible Only to Admin)
Admin has access to the following options in the Navbar:
✅ Add Product  
✅ Show Products  

### 3. Add Product (Form Validation & Database Integration)
- This feature is accessible only to Admin.
- Admin can enter product details, including:
  - Name
  - Price
  - Description
  - Image
- Input fields are validated before saving the product to the MySQL database using Hibernate.

### 4. Show Products (Fetch & Display Data from Database)
- Displays all products stored in the database.
- Provides action buttons for each product:
  ✅ Update Product  
  ✅ Delete Product  

### 5. Update & Delete Product (CRUD Operations)
Admin can:
✅ Update product details.  
✅ Delete products from the database.  

## Development Roadmap

### 1. Backend (Spring Boot + Hibernate + MySQL)
✅ Setup Spring Boot project.  
✅ Integrate Hibernate ORM for database interactions.  
✅ Create REST API endpoints:
   - `/api/admin`
   - `/api/login`
   - `/api/add-product`
   - `/api/update-product`
   - `/api/delete-product`
   - `/api/get-products`
✅ Implement JWT Authentication.  
✅ Configure MySQL database.  

### 2. Frontend (React.js / Angular, HTML, CSS, Bootstrap)
✅ Create Login & Registration Page.  
✅ Implement Protected Routes (only Admin can access the dashboard).  
✅ Build Product Form (Add & Update).  
✅ Fetch and display products.  
✅ Add Update & Delete functionality.

