### RabbitMQ producer

**Course:**

https://www.udemy.com/course/rabbitmq-java-spring-boot-for-system-integration

**Reference:**

https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/

https://spring.io/projects/spring-amqp

https://spring.io/guides/gs/messaging-rabbitmq/

https://www.rabbitmq.com/

**RabbitMQ docker server**

http://localhost:15672/

`docker run -d --restart always --name rabbitmq --hostname docker-rabbitmq -p 5672:5672 -p 15672:15672 -v /home/rabbitmq/docker/data:/var/lib/rabbitmq/mnesia rabbitmq:management`