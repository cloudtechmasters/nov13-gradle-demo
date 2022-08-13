FROM openjdk:11
COPY build/libs/nov13-gradle-demo-project-0.0.1-SNAPSHOT.jar nov13-gradle-demo-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","nov13-gradle-demo-project-0.0.1-SNAPSHOT.jar"]
