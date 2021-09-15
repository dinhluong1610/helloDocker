FROM openjdk:8
ADD target/DockerSpringBoot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DockerSpringBoot-0.0.1-SNAPSHOT.jar"