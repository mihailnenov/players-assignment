FROM openjdk:latest

COPY target/Assignment-solution-1.0-SNAPSHOT.jar football-players.jar

CMD java -jar football-players.jar

EXPOSE 8080


