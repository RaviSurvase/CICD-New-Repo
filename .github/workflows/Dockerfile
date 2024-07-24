FROM openjdk:22
EXPOSE 8080
ADD target/springboot-image-repo.jar springboot-image-repo.jar
ENTRYPOINT["java","-jar","/springboot-image-repo.jar"]