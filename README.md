# Players list solution

**Used technology**

For this task I am using Spring Boot and Spring MVC. The main reason is that I have very recent experience with this technology stack. I also believe it is very powerful and easy to use. It is also very easy to nicely integrate Swagger, which I implemented as well because I believe having live documentation is very important for API.

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
  

**Comments**
1. I am not sure what would be the proper scale for the decimal values, so I put it to 5
2. Model is not good enough, entities have duplicating fields
3. Tests can be extended
4. Error handling can be improved - error and success response should be returned in а common structure
4. UI is very basic and far from perfect. I was actually not expecting a full-stack assignment but I did my best to finish it in time.
  
  
