FROM gradle:8.14-jdk17 AS builder
WORKDIR /app
COPY . .
RUN ./gradlew :microservices:auth-service:bootWar --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
RUN apt-get update && apt-get install -y --no-install-recommends fonts-nanum && rm -rf /var/lib/apt/lists/*
COPY --from=builder /app/microservices/auth-service/build/libs/*.war app.war
EXPOSE 8586
ENTRYPOINT ["java", "-jar", "/app/app.war"]
