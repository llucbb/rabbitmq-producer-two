package org.llucbb.rabbitmqproducertwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.rabbitmqtwo.entity.DummyMessage;
import com.course.rabbitmqtwo.producer.DummyProducer;

@SpringBootApplication
public class RabbitmqProducerTwoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerTwoApplication.class, args);
	}

	@Autowired
	private DummyProducer producer;

	@Override
	public void run(String... args) throws Exception {
		var dummyMessage = new DummyMessage("This is a test", 1);
		producer.sendDummy(dummyMessage);
	}

}
