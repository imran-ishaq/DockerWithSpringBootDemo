#Docker Image of Spring Boot

-This demo is just to create a docker image of springboot application.

-The process to Create a Spring boot project is same.

# Docker Requirements
- You must have install docker from Docker Hub according to OS i.e Windows,Mac
- Prepare Docker File

# DockerFile Constitution
-Primarily File name should be "Dockerfile" its predecided by docker
-1st of Dockerfile "FROM openjdk:8" Define the Image/lang/tool on which it runs
-2nd Line "ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
" simply tells that take jar from target dir and make it part of Dockerfile
-3rd line simply inform about the port exposed
-4th Line explain how to execute the jar file from EntryPoint.

#Docker Commands To Build Image and run that Image
-- #Build command
docker build -f Dockerfile -t docker-demo-springboot <Dockerfile location>

-"docker build" is the build method/indicator to the docker 
- -f is a param of file
-t  is for you to give tagname to your image
  <>Docker file location in your system
  
--#Run Image command
docker run -d -p 8085:8085 docker-demo-springboot
-  docker run is a method to start a container which take folllowing params
- -d means detached from console and run on background you can skip that
- -p 8085:8085 means that it will be pushed from dockers 8085 port your system 8085 port
last param is the name of image