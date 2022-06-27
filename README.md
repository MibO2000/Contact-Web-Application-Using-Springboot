# Contact-Web-Application-Using-Springboot
### Video Demo: https://youtu.be/Hft1bP16ZfM
### Description: I use Java Springboot for the backend and HTML for the frontend. This is a simple contact web application where you can create new contact, update or delete it.
### People.java from Entity package is where I create table, assign columns and stuff.
### ContactController.java from Controller package is where I use get and post methods that speaks with the user inputs and HTML files.
### ContactRepository.java from Repository package is an interface that extends JpaRepository so that the methods that might use in service implementation are no longer needed to be coded.
### ContactServiceImpl.java from Service package implements the ContactService.java interface accepts ContactRepository as a constructor which is used to overwrite Service methods.
### Dependency injections are used to make the codes clean and reusable.
>This is my first ever real life Springboot project.
