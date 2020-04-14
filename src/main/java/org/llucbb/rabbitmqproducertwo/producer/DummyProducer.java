package org.llucbb.rabbitmqproducertwo.producer;

import lombok.RequiredArgsConstructor;
import org.llucbb.rabbitmqmodeltwo.entity.DummyMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DummyProducer {

    private final RabbitTemplate rabbitTemplate;

    public void sendDummy(DummyMessage message) {
        rabbitTemplate.convertAndSend("x.dummy", "", message);
    }

}
