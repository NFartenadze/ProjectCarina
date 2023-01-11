FROM maven:3.8.6-jdk-11
WORKDIR /carina-demo
COPY ./src /carina-demo/src
COPY pom.xml /carina-demo
RUN mvn clean test
CMD ["mvn","test","-Dsuite=${SUITE}"]
EXPOSE 3000