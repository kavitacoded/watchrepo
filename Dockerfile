FROM openjdk:17
COPY target/tourist.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","tourist.jar"]

