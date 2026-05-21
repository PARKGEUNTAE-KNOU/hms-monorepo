FROM gradle:8.14-jdk17 AS builder
WORKDIR /app
COPY . .
RUN ./gradlew :microservices:staff-service:bootJar --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/microservices/staff-service/build/libs/*.jar app.jar
EXPOSE 8022
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
