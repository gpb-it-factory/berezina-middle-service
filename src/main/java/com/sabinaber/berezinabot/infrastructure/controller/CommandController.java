package com.sabinaber.berezinabot.infrastructure.controller;

import com.sabinaber.berezinabot.application.service.CommandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/commands")
public class CommandController {
    private final CommandService commandService;

    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    @GetMapping
    public ResponseEntity<Set<String>> getCommands() {
        Set<String> commands = commandService.getCommands();
        return ResponseEntity.ok(commands);
    }
}
