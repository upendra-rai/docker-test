# Stage 1: Build stage using a slim image
FROM openjdk:17-jdk-slim AS builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Stage 2: Run stage using an Alpine image
FROM openjdk:17-alpine
COPY --from=builder /app.jar /app.jar
CMD ["java", "-jar", "/app.jar"]