
FROM maven:3.8.1-openjdk-17-slim AS build


WORKDIR /usr/local/src


COPY ./ ./


RUN mvn package


FROM tomcat:9.0.50-jdk11-openjdk-slim


COPY --from=build /usr/local/src/target/javaLab3-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/


EXPOSE 8080

CMD ["catalina.sh", "run"]


# docker run -p 8088:8088 javawebapp