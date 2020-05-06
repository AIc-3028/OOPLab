package com.company;

import com.company.Inventory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Book myBook = new Book("Dr. Suess",
                1,
                "Green Eggs and Ham",
                "lorem ipsum",
                false);

        Book myOtherBook = new Book("David Foster Wallace",
                2,
                "Infinite Jest",
                "lorem ipsum",
                false);


        Inventory ourInventory = new Inventory();

//        ArrayList<LibraryItem> libraryItems = ourInventory.getLibraryItems();

        ourInventory.addItem(myBook);
        ourInventory.addItem(myOtherBook);

        for (LibraryItem Item1 : ourInventory.getLibraryItems()) {
            System.out.printf("Author: %s%n" +
                            "Title: %s%n" +
                            "Description: %s%n" +
                            "ID: %d%n%n", Item1.getAuthor(),
                    Item1.getTitle(),
                    Item1.getDescription(),
                    Item1.getLibraryId());
        }
        addBook.runaddBook();
    }
}