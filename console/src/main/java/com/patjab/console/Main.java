package com.patjab.console;

import com.patjab.AppConfig;
import com.patjab.Game;
import com.patjab.MessageGenerator;
import com.patjab.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

//    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create the context (container)
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get number generator bean from context
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        String mainMsg = messageGenerator.getMainMessage();
        String resultMsg = messageGenerator.getResultMessage();

        log.info(mainMsg);
        log.info(resultMsg);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number = {}", number);

        // get game bean from context (container)
        Game game = context.getBean(Game.class);

//        game.reset();

        // close context (container)
        context.close();
    }

}
