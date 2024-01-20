package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {
	
	@Bean
	public NewTopic dem() {
		return new NewTopic("mytopic", 3, (short)1);
	}

}
