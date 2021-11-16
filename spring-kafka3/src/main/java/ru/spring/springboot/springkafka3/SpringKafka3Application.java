package ru.spring.springboot.springkafka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class SpringKafka3Application {

	@KafkaListener(topics="msg")
	public void msgListener(String msg){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringKafka3Application.class, args);
	}

}
