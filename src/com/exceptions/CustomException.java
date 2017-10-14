package com.exceptions;

public class CustomException extends RuntimeException {

    public CustomException(String message) {
        this(message, (Throwable)null);
    }

    public CustomException(Throwable throwable) {
        this((String)null, throwable);
    }

    public CustomException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
