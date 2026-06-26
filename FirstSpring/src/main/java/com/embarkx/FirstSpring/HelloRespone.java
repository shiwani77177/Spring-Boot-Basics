package com.embarkx.FirstSpring;

public class HelloRespone {
    private String message;

    public HelloRespone(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
