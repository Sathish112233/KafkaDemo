package com.kafka.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublish {
	
	@Autowired
	private KafkaTemplate<String, Object> temp;
	
	public void publishMsg(String msg) {
		for(int i=0;i<10000;i++) {
	CompletableFuture<SendResult<String, Object>>future= temp.send("mytopic", msg);
	future.whenComplete((result,ex)->{
		if(ex==null) {
			System.out.println(result.getProducerRecord()+" record metadata "+result.getRecordMetadata());
		}else {
			System.out.println("Exception occured "+ex);
		}
	});
	}
	}
}
