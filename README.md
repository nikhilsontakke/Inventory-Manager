# Inventory-Manager
A Java platform based inventory manager which enables user to manage all necessary inventory operations such as managing vendor details, managing product details and also managing employee details, etc. For detailed information checkout README file
Database Mangement is done using MYSQL and front-end is done using Netbeans.
# Features of Inventory Manager
1. User Registration :- Helps User Register using the license key.
2. User Login :- Authentication module for user login.
3. User Account Management :- Provides Features such as updating user information and changing username and password. 
4. Vendors Management :- Provides managing platform for user to deal with vendors information and affairs.
5. Products Management :- Provides managing platform for user to deal with products information and affairs.
6. Employee Management :- Provides managing platform for user to deal with employee information and affairs.
7. Saving data into CSV :- Helps in exporting all the data from users account realated to vendors, products and employees into csv file.
8. Developer Details :- Gives an insight of software and developer information
# Software Requirements 
1. Netbeans 8.1 or higher
2. Mysql Community Version 8.0.1
3. Java Development Kit 8 
4. JDBC connector 8.0.1 - (Easy download link - https://jar-download.com/artifacts/mysql/mysql-connector-java/8.0.11/source-code )
# Setup
1. Install MySql 8 and run it on localhost port 3306
2. Create Database by name 'inventorymanager'
3. Create Tables by name 'logincredentials,vendor,product,employees' (for parameters refer database section below)
4. Run project Files 
# Database Information
There are four different tables with the following description in the database named as inventorymanager
1. "logincredentils" table stores information of administrator persons and has parameters as - (name varchar(20),username varchar(20),password varchar (20),licensekey varchar(20),company varchar(20))
2. "vendor" table stores information about vendor has parameters as - (name varchar(20),number bigint(10),email varchar(20),address varchar(30))
3. "product" table stores information about the current inventory status and has parameters as -(name varchar(20),productcode varchar(20),companyname varchar(20),quantity varchar(20))
4. "employees" table stores information of employees currently employed at the company as has parameters as - (name varchar(20),employeeid varchar(20),category varchar(20),number varchar(20))
# Legal
This code is in no way affiliated with, authorized, maintained, sponsored or endorsed by any company or organization. This is an independent and unofficial software. Use at your own risk.
# License 
nikhilsontakke/Inventory-Manager is licensed under the
MIT License

