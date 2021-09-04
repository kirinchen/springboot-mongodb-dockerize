FROM kirinddt/gradle-graalvm:latest AS build
 
COPY . /app
WORKDIR /app

RUN gradle :bootJar --refresh-dependencies 

FROM ghcr.io/graalvm/graalvm-ce:java11-20.3.1

# EXPOSE 8080
EXPOSE 8080 

RUN mkdir /app


COPY --from=build /app/build/libs/mongodbdemo-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app/spring-boot-application.jar"]


