FROM openjdk:8-jdk-alpine
ADD ./target/taskcloud-service-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT exec /usr/bin/java -jar ./taskcloud-service-0.0.1-SNAPSHOT.jar
