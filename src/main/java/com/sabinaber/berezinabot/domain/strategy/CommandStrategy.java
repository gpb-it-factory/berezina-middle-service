package com.sabinaber.berezinabot.domain.strategy;

public interface CommandStrategy {
    String getCommand();
    void invoke(String commandData);
}
