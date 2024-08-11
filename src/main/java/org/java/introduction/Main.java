package org.java.introduction;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addItem(inventory, scanner);
                        break;
                    case 2:
                        updateItem(inventory, scanner);
                        break;
                    case 3:
                        inventory.displayInventory();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                ExceptionHandling.handleInputMismatchException(e);
                scanner.next(); // clear the invalid input
            } catch (Exception e) {
                ExceptionHandling.handleException(e);
            }
        }
    }

    private static void addItem(Inventory inventory, Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        if (InputValidator.validateQuantity(quantity) && InputValidator.validatePrice(price)) {
            inventory.addItem(new Item(name, quantity, price));
        } else {
            System.out.println("Invalid input values for quantity or price.");
        }
    }

    private static void updateItem(Inventory inventory, Scanner scanner) {
        System.out.print("Enter name of the item to update: ");
        String name = scanner.next();
        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();

        if (InputValidator.validateQuantity(quantity) && InputValidator.validatePrice(price)) {
            inventory.updateItem(name, quantity, price);
        } else {
            System.out.println("Invalid input values for quantity or price.");
        }
    }
}
