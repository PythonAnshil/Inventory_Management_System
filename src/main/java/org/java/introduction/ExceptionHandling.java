package org.java.introduction;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void handleException(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    public static void handleInputMismatchException(InputMismatchException e) {
        System.out.println("Input Mismatch Error: " + e.getMessage());
    }

    public static void handleNoSuchElementException(NoSuchElementException e) {
        System.out.println("No Such Element Error: " + e.getMessage());
    }

    public static void handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println("Illegal Argument Error: " + e.getMessage());
    }
}
