# Use an official Maven image to build the app
FROM openjdk:17

# Set working directory in container
WORKDIR /app

# Copy all project files into the container
COPY target/* .

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]