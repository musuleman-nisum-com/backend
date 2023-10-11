# FROM maven:3.8.4-openjdk-17 as maven-builder
# COPY src /app/src
# COPY pom.xml /app
#
# RUN mvn -f /app/pom.xml clean package -DskipTests
# FROM openjdk:17-alpine
#
# COPY --from=maven-builder app/target/backend-0.0.1-SNAPSHOT.jar /app-service/backend-0.0.1-SNAPSHOT.jar
# WORKDIR /app-service
#
# EXPOSE 6700
# ENTRYPOINT ["java","-jar","backend-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17-alpine
EXPOSE 6700
WORKDIR /app
COPY target/backend-0.0.1-SNAPSHOT.jar /app/backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]