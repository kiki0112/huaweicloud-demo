FROM openjdk:8-jre-alpine

WORKDIR /home/apps/
ADD target/helloWorld-0.0.1.jar .
ADD target/lib ./lib
ADD start.sh .

ENV ak="ak"
ENV sk="sk"

ENTRYPOINT ["sh", "/home/apps/start.sh"]