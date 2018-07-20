package com.earthteam.ocr.service;

import com.earthteam.ocr.domain.ChatMessage;


public interface ChatService {
	public ChatMessage getLastMessage();
	public void save(ChatMessage message);
	public void clear();
}
