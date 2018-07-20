package com.earthteam.ocr.scheduler;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.earthteam.ocr.domain.ChatMessage;
import com.earthteam.ocr.service.ChatService;

@Component
public class ChatScheduler {

	@Autowired
	private ChatService chatService;

	@Autowired
	private SimpMessagingTemplate template;

	/**
	 * Invoked after bean creation is complete, this method will schedule
	 * updatePriceAndBroacast every 1 second
	 */
	@PostConstruct
	@Scheduled(fixedDelay = 1000)
	private void broadcast() {
		ChatMessage lastMessage = chatService.getLastMessage();
		chatService.clear();
		this.template.convertAndSend("/topic/chat", lastMessage);
	}

}
