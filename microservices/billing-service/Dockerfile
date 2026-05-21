FROM gradle:8.14-jdk17 AS builder
WORKDIR /app
COPY . .
RUN ./gradlew :microservices:billing-service:bootWar --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/microservices/billing-service/build/libs/*.war app.war
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/app.war"]
