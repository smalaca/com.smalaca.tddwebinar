package com.smalaca.tddwebiner;

import static java.lang.String.valueOf;

class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    String play(int numberToRecognize) {
        String result = "";

        if (canBeDividedByThree(numberToRecognize)) {
            result += FIZZ;
        }

        if (canBeDividedByFive(numberToRecognize)) {
            result += BUZZ;
        }

        return result.isEmpty() ? valueOf(numberToRecognize) : result;
    }

    private boolean canBeDividedByFive(int numberToRecognize) {
        return numberToRecognize % 5 == 0;
    }

    private boolean canBeDividedByThree(int numberToRecognize) {
        return numberToRecognize % 3 == 0;
    }
}
