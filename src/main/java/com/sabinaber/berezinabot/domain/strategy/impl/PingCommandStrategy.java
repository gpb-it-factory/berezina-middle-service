package com.sabinaber.berezinabot.domain.strategy.impl;

import com.sabinaber.berezinabot.domain.strategy.CommandStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PingCommandStrategy implements CommandStrategy {

    private static final Logger logger = LoggerFactory.getLogger(PingCommandStrategy.class);

    @Override
    public String getCommand() {
        return "/ping";
    }

    @Override
    public void invoke(String commandData) {
        // Логика выполнения команды ping
        logger.info("Ping command executed with data: {}", commandData);
    }
}

