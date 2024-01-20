package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "mytopic",groupId = "mykafkademo_1")
	public void consume(String msg) {
		System.out.println("Consumer Message updated in Consume : "+msg);
	}
	
	@KafkaListener(topics = "mytopic",groupId = "mykafkademo_1")
	public void consume1(String msg) {
		System.out.println("Consumer Message updated in Consume1 : "+msg);
	}
	
	@KafkaListener(topics = "mytopic",groupId = "mykafkademo_1")
	public void consume2(String msg) {
		System.out.println("Consumer Message updated in Consume2 : "+msg);
	}
}
