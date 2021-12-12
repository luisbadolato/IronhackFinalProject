  <h2 align="center">
	- Ironhack Bootcamp Final Project -
    <br />
    <br />
   </h2>

<p align="center">
	<img src="https://i.imgur.com/ebWGfYA.png">
</p>
   
  <h3 align="center">
	  A guitar learning app that lets you track your musical prowess
    <br />
 </h3>

<!-- TABLE OF CONTENTS -->

  <summary><h2 style="display: inline-block"> 📋 Table of Contents</h2></summary>
  <ol>
    <li> <a href="#about-the-project">About The Project</a> </li>
    <li><a href="#app-structure"> App Structure</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contribution">Contribution and Special Thanks</a></li>
    <li><a href="#license">License</a></li>
  </ol>


<!-- ABOUT THE PROJECT -->

## ✏️ About The Project

This project was created as the final project for the Ironhack FullStack Remote Bootcamp to showcase some of the skills adquired during the course. 

#### Built With

* ♨️ Java
* 🍃 Spring Boot
* 🐬 MySQL
* ♦️ Angular
* 💅 Sass


<!-- APP STRUCTURE -->
## ⚙️ App Structure

The app main functionality comes from four services where the data needed for each of its lessons is stored.
They share a similar database structure, but in future implementations they might differ from each other to accomodate more advanced functionalities.

<p align="center">
	<img src="https://i.imgur.com/phkWRhS.png">
</p>

The main http routes in this services are: 

``
GET http://localhost:808X/subjects
``

``
GET http://localhost:808X/lessons/{id}
``

There are also routes for accessing individual or complete subjects, sections, units and lessons, but until further implementations they're not accessible through the edge service.



There's also an Edge / Authorization service that handles the JWT based authorization and the http petitions to the data services coming from the frontend. It also holds all the annotations and feedback that the user can create for each lesson.

<p align="center">
	<img src="https://i.imgur.com/lcF9mgI.png">
</p>

<br />
Most of the http routes in this service require at least user authentication and some of them need administrator role.
The main routes are:

### Authorization routes:

``
POST http://localhost:8080/auth/login (No authorization needed)
``

``
POST http://localhost:8080/auth/nuevo (No authorization needed)
``
<br />
### User routes:

``
GET http://localhost:8080/users/all  (Admin role needed)
``

``
GET http://localhost:8080/users/{id}  (Admin role needed)
``

``
GET http://localhost:8080/users/name/{nombreUsuario}
``

``
DELETE http://localhost:8080/users/name/{nombreUsuario}
``

### Lesson user data routes: 

``
GET http://localhost:8080/data/user/{id}
``

``
GET http://localhost:8080/data/total/{nombreUsuario}/{moduleName}
``

``
GET http://localhost:8080/data/total/{nombreUsuario}/{moduleName}/{lessonId}
``

``
POST http://localhost:8080/data/new
``

``
PUT http://localhost:8080/update/{id}
``

``
DELETE http://localhost:8080/data/{id}
``

There are also several routes not yet accessed by the frontend, but they will be useful for future implementations.

<!-- GETTING STARTED -->
## ⌨️ Getting Started

In order to run the application you'll have to follow these steps:

1. Clone the repository by getting the link on the Code button or with the link below.
	  ```
	   git clone https://github.com/luisbadolato/IronhackFinalProject.git
	  ```
2. Open the "_database_routes_" folder to create the databases:
	2.1	Start with *_DatabaseCreation.sql* ( enable the commented lines if you're running as root or copy them to your 
	root LocalUserConfig script and run them from there.). Then run the rest of the script.
	2.2 	Run  *_DataInserts.sql* to populate all the databases.
3. Run with IntelliJ IDEA each one of the six services in the backend (Remember to change the user and database password in each project's application properties if needed). 
4. Open the frontend folder with VS Code.
5. Open a terminal in VSCode and execute the command below to install all the necessary dependecies. 
	  ```
	   npm install
	  ```

6.  Finally execute the command below to start the live server. 
	  ```
	   ng serve
	  ```

7. Open the address below with you favorite browser (Chrome recommended). 
	```
	 http://localhost:4200/
	  ```
8.  You're all set!

   
<!-- USAGE EXAMPLES -->
## 💻 Usage

### 🎼 Home Page
The first thing you'll see when you open the app is the *index* page, where you can access the login page, register page or try some of the app functionality as a guest user.
<p align="center">
	<img src="https://i.imgur.com/yZXcnK1.png">
</p>


### 🎼 Login Page
Here we can login if we already have an account in order to access the app's complete functionality.
If we insert wrong data we'll get an error message.
In case we're already logged in we'll get a notification and the option to either log out or access the modules page.
<p align="center">
	<img src="https://i.imgur.com/akEjJJN.png">
</p>

### 🎼 Register Page
Here we can register a new account.
In case we're already logged in we'll get a notification and the option to either log out or access the modules page.
<p align="center">
	<img src="https://i.imgur.com/vPAANm5.png">
</p>

### 🎼 Modules Page
Through this page we can access one of the four modules that hold lessons based on thematic subjects.
The only module accesable by guests is the Theory module, the rest need the user to be logged in.
<p align="center">
	<img src="https://i.imgur.com/ATwdnZE.png">
</p>

### 🎼 Lesson Page
This page is where the main functionality of the app resides.
The sidebar show the user name (we can click it to access the user profile page) and below we have all the lessons structured by units, sections and subjects. 
When a lesson is clicked all of its content is loaded to the main section of the page.
There we have the score and tablature, the user annotations and mastery level (which can be saved and updated at any time) and the lesson audio in the footer section.

<p align="center">
	<img src="https://i.imgur.com/Cv8wS9P.png">
</p>

### 🎼 User Profile Page
In its current implementation this page shows some of the user stats and lets you delete your account, logout or return to the modules page.
In a future implementation we'll add the possibility to change user details through a form and also show a summary of all the user progress.
<p align="center">
	<img src="https://i.imgur.com/B61UXtm.png">
</p>


<!-- CONTRIBUTION -->
## 👩‍👩‍👧‍👧 Contribution and Special Thanks
App design and development by Luis Badolato.
Special thanks to the teaching team in Ironhack Bootcamp: Víctor Cardozo, Iván Trujillo and Adrià López for their help and patience, to my fellow students and specially to Ana Badolato for her help achieving a somewhat decent UX for the project.

<!-- LICENSE -->
## ®️ License

Copyright © 2021 Luis Badolato
