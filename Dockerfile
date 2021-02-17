FROM openjdk:8-jdk-alpine
WORKDIR /spring-demo
COPY target/*.jar spring-demo.jar
EXPOSE 8081
VOLUME /spring-demo
ENTRYPOINT ["java","-jar","./spring-demo.jar"]
