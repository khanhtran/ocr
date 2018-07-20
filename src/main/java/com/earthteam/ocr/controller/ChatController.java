package com.earthteam.ocr.controller;

import org.springframework.stereotype.Controller;

import com.earthteam.ocr.domain.ChatMessage;
import com.earthteam.ocr.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@Controller
public class ChatController {
	@Autowired
	ChatService chatService;

	/**
	 * WebSocket Handler to add one stock
	 */
	@MessageMapping("/send")
	@SendTo("/topic/chat")
	public ChatMessage addMessage(ChatMessage message) throws Exception {
		chatService.save(message);
		return message;
	}
}