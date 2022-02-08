FROM openjdk:8-jre-alpine

WORKDIR /usr/src
COPY lecture_idea.jar /usr/src/lecture_idea.jar
EXPOSE 5005

CMD ["java", "-cp","lecture_idea.jar","HelloWorld"]