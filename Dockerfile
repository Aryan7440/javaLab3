FROM maven:3.8.1-openjdk-11-slim AS build

# The application's .war file will be placed in the /usr/local/tomcat/webapps directory
WORKDIR /usr/local/src

# Copy the Maven project to the Docker image
COPY ./javalab3/pom.xml ./pom.xml
COPY ./javalab3/src ./src

# Build the application
RUN mvn package

# Use Tomcat base image
FROM tomcat:9.0.50-jdk11-openjdk-slim

# Copy the .war file to the webapps directory of the Tomcat server
COPY --from=build /usr/local/src/target/javaLab3-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

# Expose port 8080 to the outside world
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]