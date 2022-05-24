package com.mycompany.app;

/**
 * Hello World!!
 */
public class App
{

    private final String message = "Hello World! Have a great day.";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
