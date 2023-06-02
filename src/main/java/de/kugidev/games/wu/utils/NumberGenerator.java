package de.kugidev.games.wu.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    private static final Logger logger = LoggerFactory.getLogger(NumberGenerator.class);

    public static List<Integer> generateNumbers(int start, int end) {
        List<Integer> numbers = new ArrayList<>();

        if (start > end) {
            logger.error("Invalid range: Start value is greater than end value");
            return numbers;
        }

        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}

