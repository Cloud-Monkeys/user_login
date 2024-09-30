# Use the official OpenJDK as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /usr/src/java/com/example/microservice1

# Copy the JAR file into the container (the JAR file is created after building the Spring Boot project)
COPY target/microservice1-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the application will run (Spring Boot usually runs on 8080)
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
