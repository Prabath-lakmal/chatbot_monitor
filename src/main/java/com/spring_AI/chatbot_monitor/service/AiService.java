package com.spring_AI.chatbot_monitor.service;

import com.spring_AI.chatbot_monitor.dto.AiResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public AiResponse askAi(String query){

        String responseFromAi = chatClient.prompt(query).call().content();
        return new AiResponse(responseFromAi, true);
    }
}
