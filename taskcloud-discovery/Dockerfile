FROM openjdk:8-jdk-alpine
ADD ./target/taskcloud-discovery-0.0.1-SNAPSHOT.jar .
EXPOSE 8761
ENTRYPOINT exec /usr/bin/java -jar ./taskcloud-discovery-0.0.1-SNAPSHOT.jar
