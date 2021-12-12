   <br />
  <h2 align="center">
	- Ironhack Bootcamp Final Project -
    <br />
    <br />
   </h2>

<p align="center">
	<img src="https://i.imgur.com/ebWGfYA.png">
</p>
   
  <h3 align="center">
	  A guitar learning app that lets you track your progress
    <br />
   </h3>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block"> 📋 Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributors">Contributors</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## ✏️ About The Project

This project was created as the final project for the Ironhack FullStack Remote Bootcamp to showcase some of the skills adquired during the course. 

#### Built With

* ♨️ Java
* 🍃 Spring Boot
* 🐬 MySQL
* ♦️ Angular
* 💅 Sass

## ⚙️ App Structure

The app main functionality comes from four services where the data needed for each of its lessons is stored.
They share a similar database structure, but in future implementations they might differ from each other to accomodate more advanced functionalities.

<p align="center">
	<img src="https://i.imgur.com/phkWRhS.png">
</p>

There's also an Edge / Authorization service that handles the JWT based authorization and the http petitions to the data services coming from the frontend. It also holds all the annotations and feedback that the user can create for each lesson.
<p align="center">
	<img src="https://i.imgur.com/lcF9mgI.png">
</p>

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

5. Open a terminal in VSCode and execute the command below to start the live server. 
	  ```
	  ng serve
	  ```

6. Open the address below with you favorite browser (Chrome recommended). 
	```
	http://localhost:4200/
	  ```
7.  You're all set!
