from openjdk:16
EXPOSE 8010
ADD ./target/helloworld-1.0.jar micro-helloworld.jar
ENTRYPOINT ["java", "-jar", "/micro-helloworld.jar"]