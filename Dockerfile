FROM openjdk:23-ea-17-oraclelinux9

ADD target/hello-world-0.0.1.jar hello-world-0.0.1.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/hello-world-0.0.1.jar"]