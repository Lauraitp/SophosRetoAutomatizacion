package com.sophos.challenge.exceptions;

public class TheProductIsIncorrect extends AssertionError {

    public static String INVALID_PRODUCT = "The product features are diferents than selected";

    TheProductIsIncorrect(String message) {
        super(message);
    }


}
