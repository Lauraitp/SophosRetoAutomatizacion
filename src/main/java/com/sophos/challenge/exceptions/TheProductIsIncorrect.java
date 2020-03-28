package com.sophos.challenge.exceptions;

@SuppressWarnings("serial")
public class TheProductIsIncorrect extends AssertionError {

	/**
	 * Exception cuando no encuentre los mismo criterios que el producto seleccionado
	 */
    public static String INVALID_PRODUCT = "The product features are diferents than selected";

    TheProductIsIncorrect(String message) {
        super(message);
    }


}
