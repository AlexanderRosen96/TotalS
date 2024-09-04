FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/PTest-0.0.1-SNAPSHOT.jar /app/PTest-0.0.1-SNAPSHOT.jar

EXPOSE 7272

ENTRYPOINT ["java", "-jar", "/app/PTest-0.0.1-SNAPSHOT.jar"]