package com.sophos.challenge.exceptions;

public class UserInvalidResponse extends AssertionError {

    public static String INVALID_USER_NAME = "The user first name was not the expected";

    UserInvalidResponse(String message) {
        super(message);
    }


}
