package com.example.testcodestudy;

public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("Invalid input size");
    }
}
