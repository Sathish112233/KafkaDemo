package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaPublish;

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaPublish pub;
	
	@GetMapping("/publishMsg/{msg}")
	public String sendMsg(@PathVariable String msg) {
		
			pub.publishMsg(msg);
		
		
		return msg+" successfully msg added to topic";
	}
	

}
