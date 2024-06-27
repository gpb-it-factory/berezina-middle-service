package com.sabinaber.berezinabot.config;

import com.sabinaber.berezinabot.domain.strategy.CommandStrategy;
import com.sabinaber.berezinabot.domain.strategy.impl.PingCommandStrategy;
import com.sabinaber.berezinabot.domain.strategy.impl.UserRegistrationCommandStrategy;
import com.sabinaber.berezinabot.application.service.impl.CommandServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CommandConfig {

    @Bean
    public CommandServiceImpl commandService(List<CommandStrategy> strategyList) {
        return new CommandServiceImpl(strategyList);
    }

    @Bean
    public CommandStrategy pingCommandStrategy() {
        return new PingCommandStrategy();
    }

    @Bean
    public CommandStrategy userRegistrationCommandStrategy() {
        return new UserRegistrationCommandStrategy();
    }
}

