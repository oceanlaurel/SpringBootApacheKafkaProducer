package com.javainuse.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javainuse.service.ApplicationConstant;
//import com.netsurfingzone.dto.Student;


public class KafkaConsumer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

	//@KafkaListener(groupId = ApplicationConstant.GROUP_ID_JSON, topics = ApplicationConstant.TOPIC_NAME, containerFactory = ApplicationConstant.KAFKA_LISTENER_CONTAINER_FACTORY)
	@KafkaListener(id = "demo", topics = "TutorialTopic2")
	public void receivedMessage(String message) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(message);
		logger.info("Json message received using Kafka listener " + jsonString);
		System.out.println("Json message received using Kafka listener " + jsonString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
