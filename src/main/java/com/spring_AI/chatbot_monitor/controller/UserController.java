package com.spring_AI.chatbot_monitor.controller;

import com.spring_AI.chatbot_monitor.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserDto> getUser(){

        UserDto userDto = new UserDto("12345", "ABC", "colombo");
        return ResponseEntity.ok(userDto);
    }
}
