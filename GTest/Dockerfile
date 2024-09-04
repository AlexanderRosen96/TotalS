FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/GTest-0.0.1-SNAPSHOT.jar /app/GTest-0.0.1-SNAPSHOT.jar

EXPOSE 8585

ENTRYPOINT ["java", "-jar", "/app/GTest-0.0.1-SNAPSHOT.jar"]