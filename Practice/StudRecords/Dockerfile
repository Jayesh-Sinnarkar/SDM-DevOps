#Use Official Open JDK Image as a parent Image
FROM openjdk:latest

#Set the working directory to /app
WORKDIR /app

#Copy the current directory contents into the container at /app
COPY . /app

#Compile the Java code
#RUN java -jar StudRecord.jar

#Run the program when the container starts
CMD ["java", "-jar", "StudRecord.jar"]