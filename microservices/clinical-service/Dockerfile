FROM gradle:8.14-jdk17 AS builder
WORKDIR /app
COPY . .
RUN ./gradlew :microservices:clinical-service:bootJar --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/microservices/clinical-service/build/libs/*.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
