package com.sabinaber.berezinabot.application.service.impl;

import com.sabinaber.berezinabot.application.service.CommandService;
import com.sabinaber.berezinabot.domain.strategy.CommandStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CommandServiceImpl implements CommandService {
    private final Map<String, CommandStrategy> strategies = new HashMap<>();

    public CommandServiceImpl(List<CommandStrategy> strategyList) {
        for (CommandStrategy strategy : strategyList) {
            strategies.put(strategy.getCommand(), strategy);
        }
    }

    @Override
    public Set<String> getCommands() {
        return strategies.keySet();
    }
}
