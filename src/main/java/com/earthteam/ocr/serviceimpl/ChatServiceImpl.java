package com.earthteam.ocr.serviceimpl;

import org.springframework.stereotype.Service;

import com.earthteam.ocr.domain.ChatMessage;
import com.earthteam.ocr.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService {
	private ChatMessage lastMessage = new ChatMessage();
	@Override
	public ChatMessage getLastMessage() {
		
		return lastMessage;
	}

	@Override
	public void save(ChatMessage message) {
		lastMessage = message;
	}

	@Override
	public void clear() {
		lastMessage.clear();
	}
}
