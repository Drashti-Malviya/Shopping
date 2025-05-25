FROM openjdk:8-jdk-alpine
COPY target/user-0.0.1-SNAPSHOT.jar user-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "user-0.0.1-SNAPSHOT.jar"]




