FROM openjdk:8
EXPOSE 8080
ADD target/ecommerce.jar ecommerce.jar
CMD ["java","-jar","ecommerce.jar"]