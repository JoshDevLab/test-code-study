package com.example.testcodestudy;

public class InvalidOperatorException extends RuntimeException {

    public InvalidOperatorException(String message) {
        super(message);
    }

    public InvalidOperatorException() {
        super("Invalid Operator");
    }
}
