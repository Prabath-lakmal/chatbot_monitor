package com.spring_AI.chatbot_monitor.controller;

import com.spring_AI.chatbot_monitor.dto.AiResponse;
import com.spring_AI.chatbot_monitor.service.AiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ResponseEntity<AiResponse> askFromAi(@RequestParam("query") String query){

        AiResponse aiResponse = aiService.askAi(query);
        return ResponseEntity.ok(aiResponse);
    }
}
