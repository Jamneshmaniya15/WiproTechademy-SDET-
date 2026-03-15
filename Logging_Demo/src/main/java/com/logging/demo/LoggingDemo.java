package com.logging.demo;

import com.logging.demo.LoginTest;

public class LoggingDemo {

    public static void main(String[] args) {
        // Create an object of your LoginTest class
        LoginTest test = new LoginTest();
        
        // Execute the method containing the loggers
        test.login();
        
        System.out.println("Execution finished. Check the console for log messages.");
    }
}