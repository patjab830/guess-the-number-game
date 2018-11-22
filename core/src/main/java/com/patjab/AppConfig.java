package com.patjab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.patjab")
public class AppConfig {

    @Bean
    public Game game() {
        return new GameImpl();
    }

    @Bean
    public NumberGeneratorImpl numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public MessageGeneratorImpl messageGenerator() {
        return new MessageGeneratorImpl();
    }
}
