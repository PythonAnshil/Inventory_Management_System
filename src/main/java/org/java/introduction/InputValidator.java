package org.java.introduction;


public class InputValidator {
    public static boolean validateQuantity(int quantity) {
        return quantity >= 0;
    }

    public static boolean validatePrice(double price) {
        return price >= 0;
    }
}
