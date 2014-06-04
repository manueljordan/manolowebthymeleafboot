# Description

Basic **Spring Framework** application, it covers and works with two of the styles of configuration available about the mechanism of **Dependency Injection** used by Spring. The sample code uses two kind of layers, they are a **Repository** and a **Service**, it how a best practice.
						
Furthermore, about **Java Programming**, the composition applied between the 
components such as a **Repository** to a **Service**, is done through interfaces 
and not through concrete classes. It how a best practice, for the purpose to swap 
out components easily.

This application works with a real persistence mechanism, therefore, it works with a **Database**, it is with [HSQL](http://hsqldb.org/). Furthermore including **Transaction Management** support.

This application is working through a **Web Environment**, furthermore using the **MVC Pattern**. 

The **view** technology used is [Thymeleaf](http://www.thymeleaf.org/). 
   
# Tutorial


The **complete** and **detailed** explanation of the source code, is available here:

- [Spring Boot: Persistence &amp; Transaction - Web &amp; Thymeleaf](http://manueljordanelera.blogspot.com/2014/06/springbootpersistencetransactionwebthymeleaf.html)

Consider to check the complete [Spring Roadmap](http://manueljordanelera.blogspot.com/2014/06/springroadmap.html), where you have available 
thirteen tutorials. 

# Features

The sample application has the following features:

## Dependency Injection

- [ ] XML
- [x] Annotation
- [ ] JavaConfig

## Technologies

<br/>
This sample application is working through the following technologies:

- ### Build Tool

	- [x] Apache Maven

- ### Database

	- [x] HSQL

- ### Server Side - Backend

	- [x] Spring Framework
	- [x] Spring Transaction
	- [x] Spring JDBC
	- [x] Spring MVC
	- [x] Spring Boot

- ### Client Side - Frontend

	- [ ] JSP
	- [x] Thymeleaf

## Notes

- The **pom.xml** file is configured to work with **Java 8**. Feel free to change 
  it to **Java 7**, it works too. 