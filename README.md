# Contact-Web-Application-Using-Springboot
### Video Demo: https://youtu.be/Hft1bP16ZfM
### Disclaimer : As a self learning CS student, if I make any mistake when it comes to terminology, I am really sorry. I started my journey with CS50 and this is my first project.
## Description:
### I use Java Springboot for the backend, mySQL for the database and HTML for the frontend. This is a simple contact web application where you can create new contact, update or delete it. To make it really simple, I display the contact as a table where it shows first name, last name, email address and phone number. It stores all of the contact in the database so that everytime the web is opened, it will show all the contact that have saved.
### People.java from Entity package is where I create table, assign columns and stuff.
### ContactController.java from Controller package is where I use get and post methods that speaks with the user inputs and HTML files.
### ContactRepository.java from Repository package is an interface that extends JpaRepository so that the methods that might use in service implementation are no longer needed to be coded.
### ContactServiceImpl.java from Service package implements the ContactService.java interface accepts ContactRepository as a constructor which is used to overwrite Service methods.
### Dependency injections are used to make the codes clean and reusable.
>Thanks for reading till the end.
