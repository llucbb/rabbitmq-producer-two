package org.llucbb.rabbitmqproducertwo;

import lombok.RequiredArgsConstructor;
import org.llucbb.rabbitmqmodeltwo.entity.DummyMessage;
import org.llucbb.rabbitmqproducertwo.producer.DummyProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class RabbitmqProducerTwoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProducerTwoApplication.class, args);
    }

    private final DummyProducer producer;

    @Override
    public void run(String... args) throws Exception {
        var dummyMessage = new DummyMessage("This is a test", 1);
        producer.sendDummy(dummyMessage);
    }

}
