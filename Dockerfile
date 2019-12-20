# Start with a base image containing Java runtime
FROM tomcat:8.0.20-jre8

# Add Maintainer Info
LABEL maintainer="bitsevn@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

RUN mkdir /usr/local/tomcat/webapps

COPY target/greeter-service-war-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/app.war

# Make port 8081 available to the world outside this container
EXPOSE 8081

CMD ["catalina.sh","run"]