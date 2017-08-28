# Players list solution

**Used technology**

For this task I am using Spring Boot and Spring MVC. The main reason is that I have very recent experience with this technology stack. I also believe it is very powerful and easy to use. It is also very easy to nicely integrate Swagger, which I implemented as well because I believe having live documentation is very important for API.


Spring Boot solution produces lightweight package suitable for deploying with Docker and Kubenetes. Spring Boot can also be configured to use Jetty (instead of Tomcat) as a Java Servlet container, so the packege will be even lighter.


Please note that the API implementation is a bit complicated for this simple problem, but my idea is to show how a real life implementation should look like. 

On the contrary the UI is simplified, since I didn't have the time to create proper modular solution (might be packaged in buld time with Node.js and WebPack). I used Vue.js for building the UI.


**Run unit tests:**

  *`mvn clean test`*

**Run integration tests:**

  *`mvn clean test -P integration`*

**Run application:**

  *`mvn spring-boot:run`*
  
**Access to Swagger interface**

  [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
  
  
**Access to Players list**
[http://localhost:8080/ui.html](http://localhost:8080/ui.html)
  

**Access GCloud service**
[curl -X GET http://35.195.189.224/api/players](curl -X GET http://35.195.189.224/api/players)
[curl -X GET http://35.195.189.224/api/player/8040](curl -X GET http://35.195.189.224/api/player/8040)


**Comments**
1. I am not sure what would be the proper scale for the decimal values, so I put it to 5
2. Model is not good enough, entities have duplicating fields - should be refined
3. Project Lombok can be used to reduce verbosity on the entity classes
4. Tests can be extended to increase coverage, but even now they are pretty much enough
5. Error handling can be improved - error and success response should be returned in а common structure
6. UI is very basic and far from perfect. I was actually not expecting a full-stack assignment but I did my best to finish it in time.
7. UI will not work on IE because fetch() is not supported
8. UI requires interned access because some of the JS libraries are downloaded from external resources
9. Design is minimalistic, but the players list is sortable and searchable
  
  
