package org.java.introduction;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(String itemName, int quantity, double price) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.setQuantity(quantity);
                item.setPrice(price);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayInventory() {
        for (Item item : items) {
            item.displayDetails();
        }
    }
}
