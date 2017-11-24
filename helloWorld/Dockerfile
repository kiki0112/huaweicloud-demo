FROM java:8-jdk

WORKDIR /home/apps/
ADD target/helloWorld-0.0.1.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]