FROM java:8-jdk-alpine
COPY ./build/libs/university-0.0.1.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch university-0.0.1.jar'
ENTRYPOINT ["java","-jar","university-0.0.1.jar"]