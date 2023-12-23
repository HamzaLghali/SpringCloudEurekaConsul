FROM openjdk:11-jdk-slim as build

LABEL maintainer="your.email@example.com"

ARG JAR_FILE=target/eureka-server.jar

COPY ${JAR_FILE} eureka-server.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]
