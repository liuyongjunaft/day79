FROM openjdk:8
COPY ./jar/*.jar /app.jar
RUN chmod +x  app.jar
CMD ["java","-jar","app.jar"]