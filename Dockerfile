# Use official OpenJDK 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file to the image
COPY explorers-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8085

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]