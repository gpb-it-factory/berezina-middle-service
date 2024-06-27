package com.sabinaber.berezinabot.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/execute")
public class RandomMessageController {

    private static final String[] MESSAGES = {
            "Hello, world!",
            "Welcome to the Mini-Bank!",
            "Have a great day!",
            "Your balance is updated.",
            "Transfer completed successfully."
    };

    @PostMapping("/execute")
    public ResponseEntity<String> getRandomMessage() {
        Random random = new Random();
        String randomMessage = MESSAGES[random.nextInt(MESSAGES.length)];
        return ResponseEntity.ok(randomMessage);
    }
}
