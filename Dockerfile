FROM java:8
VOLUME /tmp
ADD boot-docker.jar /boot-docker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/boot-docker.jar"]