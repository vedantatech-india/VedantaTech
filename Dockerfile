# Step 1: Build JAR using Maven
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Run the app
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/VedantaTech-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]