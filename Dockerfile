#FROM openjdk:17
#EXPOSE 8080
#ADD target/springboot-image-repo.jar springboot-image-repo.jar
#ENTRYPOINT ["java", "-jar", "/springboot-image-repo.jar"]
FROM openjdk:11-jre-slim
COPY . /app
WORKDIR /app
RUN ./mvnw package
ENTRYPOINT ["java", "-jar", "target/springboot-application.jar"]
