FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
WORKDIR /spring-demo
COPY ${JAR_FILE} spring-demo.jar
VOLUME /spring-demo
EXPOSE 8081
ENTRYPOINT ["java","-jar","spring-demo.jar"]
