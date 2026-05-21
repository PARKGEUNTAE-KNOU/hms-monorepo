FROM gradle:8.14-jdk17 AS builder
WORKDIR /app
COPY . .
RUN ./gradlew :microservices:clinic-support-service:bootWar --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/microservices/clinic-support-service/build/libs/*.war app.war
EXPOSE 8189
ENTRYPOINT ["java", "-jar", "/app/app.war"]
