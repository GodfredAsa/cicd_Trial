FROM openjdk:11
EXPOSE 8080
ADD target/cicd123.jar cicd123.jar
ENTRYPOINT ["java","-jar","cicd123.jar"]