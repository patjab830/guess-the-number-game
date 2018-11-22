package com.patjab.config;

import com.patjab.Game;
import com.patjab.GameImpl;
import com.patjab.MessageGeneratorImpl;
import com.patjab.NumberGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
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
