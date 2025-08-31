FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests
CMD ["java", "-Dserver.port=${PORT}", "-jar", "target/anime-list-0.0.1-SNAPSHOT.jar"]

