package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Modified poll SCM for Jenkins from local project !");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
