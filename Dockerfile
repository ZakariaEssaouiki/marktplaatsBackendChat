FROM openjdk:19
COPY target/marktplaatsChat-0.0.1-SNAPSHOT.jar marktplaatsChat.jar
ENTRYPOINT ["java","-jar","/marktplaatsChat.jar"]