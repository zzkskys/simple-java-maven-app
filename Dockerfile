FROM openjdk:8-jdk-alpine
WORKDIR /spring-demo
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-demo.jar
EXPOSE 8081
VOLUME /spring-demo
ENTRYPOINT ["java","-jar","./spring-demo.jar"]
