# hellospring
Hello Spring application - Spring Boot basics

There are a few topics to learn for beginners.
- REST API webservice
- Maven
- Git
- IntelliJ IDEA
- API Server with Spring Boot
- API Client with OkHttp
- Basic JUnit tests

## Required knowledge
Basic knowledge of Java programming language is required as well as how to read JSON and XML data.
- Java
- JSON
- XML


## REST API

REST API is a way to communicate between client and server. It is a way to send and receive data in a standard format. The standard format is JSON. JSON is a text format that is completely language independent. It is a text format that is completely language independent. It is based on a subset of the JavaScript Programming Language, Standard ECMA-262 3rd Edition - December 1999. JSON is a text format that is completely language independent. It is based on a subset of the JavaScript Programming Language, Standard ECMA-262 3rd Edition - December 1999. JSON is a text format that is completely language independent. It is based on a subset of the JavaScript Programming Language, Standard ECMA-262 3rd Edition - December 1999. JSON is a text format that is completely language independent. It is based on a subset of the JavaScript Programming Language, Standard ECMA-262 3rd Edition - December 1999.
REST, or Representational State Transfer, is an architectural style used for designing networked applications. It's often used in web services development, particularly in APIs (Application Programming Interfaces).

A REST API (or RESTful API) is an API that adheres to the principles of REST. It's a way for two computer systems to communicate over HTTP in a similar way to web servers and browsers. This API allows different software systems to communicate with each other in a standardized way, typically involving transferring data in the form of JSON or XML.

The core of REST APIs are HTTP methods that correspond to the Create, Read, Update, and Delete (CRUD) operations:

-    GET: This method is used to retrieve information from the given server using a given URI. Requests using GET should only retrieve data and should have no other effect on the data.

-    POST: A POST request is used to send data to the server, for example, customer information, file upload, etc. using HTML forms.

-    PUT: Replaces all current representations of the target resource with the request payload.

-    PATCH: This method is used for partial updates to a resource. For example, if you only need to update one field of the resource.

-    DELETE: Removes the specified resource.

In addition to these methods, there are a few other less commonly used HTTP methods, like HEAD, OPTIONS, CONNECT, and TRACE.

Each of these methods provides a different way of interacting with a resource, whether that's to create a new resource (POST), retrieve the resource (GET), update the resource (PUT or PATCH), or delete the resource (DELETE).

A typical REST API request includes:

    Endpoint (URL): The URL of the server or system you want to connect to.

    Method: The HTTP method such as GET, POST, PUT, PATCH or DELETE.

    Headers: Additional information, like user authentication token, content type the client is sending, or accepting from server etc.

    Data/Body: This includes any data you want to send to the server. This is often in JSON or XML format and is included in the body of the request, but is not required when the method is GET or DELETE as these are meant to retrieve or delete data respectively.

Remember, REST is stateless, meaning that each HTTP request should contain all the necessary information, without requiring the server to remember the state of the application.

## REST API Server
REST APIs are usually a webservice. For a webservice to work, you need to have a server that provides the service.
In this case, we will be using Spring Boot to create a REST API server.
However, you can use any other framework or language to create a REST API server like 
Javascript (Node.js), Python (FAST API, Django, Flask), Golang (Gin, Echo), Java (Spring Boot, Micronaut, Quarkus), etc.
The reason why I am introducing Spring Boot is because it is one of the most popular frameworks for creating REST API servers.
And that is because it is the most common enterprise framework used in the industry.
If you are planning to work as an IT professional, you will most likely be using Spring Boot at some point in your career.

The second most used framework is Node.js. However, Node.js is not a framework, but a runtime environment for Javascript.
You can use Node.js to create a REST API server, but you will need to use a framework like Express.js.
Python is also a popular language for creating REST API servers. However, it is not as popular as Spring Boot or Node.js. One reason for that is that the perfomance is not as well as with other languages.
Golang is a relatively new language, but it is gaining popularity. It is a compiled language, so it is faster than Python or Java. 
However, it is not as popular as Spring Boot or Node.js. 
One reason for that is that the SDK and the framework are not as mature as with other languages, and therefore has fewer options, especially for large scaling applications from the industry.
Yet, you can find projects with Golang as well in the industry, just not as many as with Spring Boot or Node.js.

### Spring Boot
Spring Boot is a framework for creating REST API servers. It is based on the Spring framework, which is a framework for creating enterprise applications with Java.
Spring Boot is an incredibly efficient and convenient framework for creating REST API servers. 
Essentially, it is a simplified and more focused extension of the Spring framework, which was designed with the primary aim of simplifying the creation of enterprise-grade applications.

Building on the robust foundation provided by the Spring framework, Spring Boot offers a host of features to facilitate the rapid development of standalone, production-grade applications. 
The main focus of Spring Boot is to reduce the amount of configuration necessary and eliminate the complexity associated with Spring.

One of the most compelling features of Spring Boot is its 'opinionated' approach to configuration. 
This means that it comes with sensible defaults based on industry standards, allowing you to get your projects off the ground swiftly without having to make myriad configuration decisions right at the outset.

Spring Boot also supports an embedded Java server, meaning you can create standalone applications that can run independently without needing to be deployed on an other server like JBOS or Tomcat.
This substantially simplifies the process of application deployment and makes it more efficient.

Moreover, Spring Boot has excellent integration with Spring's various other projects, like Spring Data, Spring Security, and Spring Cloud. 
This makes it a versatile tool for developers looking to leverage these functionalities in their applications.

Spring Boot also includes a built-in mechanism for handling persistence, transactions, dealing with databases, security, and even more complex features like MVC web and REST services.
It is also friendly towards cloud deployment and is thus a popular choice for microservices-based architectures.

Furthermore, with the use of Spring Boot's Actuator, developers can easily implement application monitoring, gaining insight into the workings and performance metrics of your application.

To sum it up, Spring Boot enhances the process of application development by providing a platform that is easy to understand and use, 
but still retains the flexibility and robustness of Spring. 
It has become a vital tool for Java developers worldwide, streamlining the process of creating high-quality, resilient, 
and scalable applications for various industry needs.

## Swagger / OpenAPI documentation for REST APIs in Spring Boot

You need to add a dependency to your pom.xml file to use Swagger in your Spring Boot project.
```xml  
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.1.0</version>
</dependency>
```
After that, you have a new auto-generated Swagger UI at http://localhost:8080/swagger-ui/index.html

