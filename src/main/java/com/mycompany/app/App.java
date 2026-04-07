package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I hate Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Some changes for pipeline from local project !");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
