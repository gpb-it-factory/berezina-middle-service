package com.sabinaber.berezinabot.domain.strategy.impl;

import com.sabinaber.berezinabot.domain.strategy.CommandStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRegistrationCommandStrategy implements CommandStrategy {

    private static final Logger logger = LoggerFactory.getLogger(UserRegistrationCommandStrategy.class);

    @Override
    public String getCommand() {
        return "/register";
    }

    @Override
    public void invoke(String commandData) {
        // Логика выполнения команды регистрации пользователя
        logger.info("User registration command executed with data: {}", commandData);
    }
}
