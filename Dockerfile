FROM openjdk:8-jre-alpine

WORKDIR /usr/src
COPY build/libs/lecture_idea.jar /usr/src/lecture_idea.jar

CMD ["java", "-cp","lecture_idea.jar","HelloWorld"]