FROM java:8

ARG JAR_FILE=target/BloodService.jar

WORKDIR /opt/app

COPY ${WAR_FILE} app.war

ENTRYPOINT ["java","-war","app.war"]

