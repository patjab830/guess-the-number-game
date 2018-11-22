package com.patjab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    @Autowired
    private Game game;
    private int guessCount = 10;

    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    @PostConstruct
    public void confirmConstructed() {
        log.info("Value of guessCount = {}", guessCount);
    }

    @Override
    public String getMainMessage() {
        return "main message";
    }

    @Override
    public String getResultMessage() {
        return "result message";
    }
}
