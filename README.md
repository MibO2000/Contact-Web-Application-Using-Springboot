# Contact-Web-Application-Using-Springboot

## Technologies

-Java

-HTML

### **Video Demo**: [CS50.FinalProject](https://youtu.be/Hft1bP16ZfM)
### **Disclaimer** : As a self learning CS student, if I make any mistake when it comes to terminology, I am really sorry. I started my journey with CS50 and this is my first project.
## **Description**:
I use Java Springboot for the backend, mySQL for the database and HTML for the frontend. 
This is a simple contact web application where you can create new contact, update or delete it. 
To make it really simple, I display the contact as a table where it shows first name, last name, email address and phone number. 
It stores all of the contact in the database so that everytime the web is opened, it will show all the contact that have saved.

## **Each files**:

People.java from Entity package is where I create table, assign columns and stuff.
ContactController.java from Controller package is where I use get and post methods that speaks with the user inputs and HTML files.
ContactRepository.java from Repository package is an interface that extends JpaRepository so that the methods that might use in service implementation are no longer needed to be coded.
ContactServiceImpl.java from Service package implements the ContactService.java interface accepts ContactRepository as a constructor which is used to overwrite Service methods.
Dependency injections are used to make the codes clean and reusable.

## **Web HTML**:
I use **Thymeleaf** template engine alongside with bootstrap.
To add a new contact, we have to click on the "**Add New Contact**" buttom which will leads to the new web page where we can see 4 boxes to fill, first name, last name, email address and phone number. 
After filling all of those boxes, click "**submit**" or hit enter to submit the contact. 
Then, we will be back to the main web page with a new contact displaying in the table.
There is an "Action" column where you can update or delete the Contact just by clicking the relevant buttom. 
Updating the contact will lead us to the web page kind of similar to the create web page where you can change all of the attributes. 
After updating the contact, click "submit" or hit enter to update the contact. 
Then, we will be back to the main web page with a updated contact displaying in the table. 
Deleting the contact will remove the contact from the table.
As I use mySQL database system, we can store a lot of contacts in this contact system.

>Thanks for reading till the end.

