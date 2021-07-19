FROM java:8

WORKDIR /app
COPY . /app

ADD ./target/tour-service.jar tour-service.jar
ENTRYPOINT ["java","-jar","tour-service.jar"]