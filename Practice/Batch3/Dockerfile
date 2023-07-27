# Use the official Tomcat 9 image as the base image
FROM tomcat:9.0-jdk11-openjdk

# Copy the WAR file from your local machine to the Tomcat webapps directory
COPY ./StudentRec.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]
