FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/STest-0.0.1-SNAPSHOT.jar /app/STest-0.0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/STest-0.0.1-SNAPSHOT.jar"]