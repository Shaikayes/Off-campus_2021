FROM tomcat:9.0-alpine

ARG java_file=target/blood-bank-service.war

WORKDIR /opt/app

EXPOSE 8080

COPY ${java_file}   /usr/local/tomcat/webapps/

ENTRYPOINT [ "catalina.sh", "run" ]