package com.sophos.challenge.exceptions;

@SuppressWarnings("serial")
public class GetApiRestException extends RuntimeException {

    public static String NOT_FOUND_RESPONSE_USER_ID_EXCEPTION = "The service noot found the id of user";
    public static String API_RESPONSE_ERROR_EXCEPTION = "Not found the service";

    public GetApiRestException(String message,Throwable testErrorException) {
        super(message,testErrorException);
    }

    public GetApiRestException(String message) {
        super(message);
    }

}
