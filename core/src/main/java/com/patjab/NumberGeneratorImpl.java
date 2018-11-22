package com.patjab;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

//@Component("numberGenerator")
public class NumberGeneratorImpl implements NumberGenerator {

    // == fields ==
    private final Random random = new Random();

    @Autowired
    private int maxNumber = 100;


    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
