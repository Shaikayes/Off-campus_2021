FROM java:8

ARG java_file=target/student-service.jar

WORKDIR /opt/examples

EXPOSE 9090

COPY ${java_file} app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]