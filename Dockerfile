FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8020
ENTRYPOINT ["java","-jar","-Dspring.cloud.config.uri=http://3.20.236.165:8888","/app.jar"]
