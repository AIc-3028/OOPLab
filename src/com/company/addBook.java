package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addBook {

    public static void runaddBook() {

        Scanner in = new Scanner(System.in);
        List<LibraryItem> libraryItems = new ArrayList<>();

        System.out.println("Books Title?");
        String title = in.nextLine();

        System.out.println("Books Author?");
        String author = in.nextLine();

        System.out.println("Books Description?");
        String description = in.nextLine();

        System.out.println("Can it be Loaned out?");
        boolean loanedOut = in.nextBoolean();

        System.out.println("Books Id?");
        long libraryId = in.nextLong();


        LibraryItem newBook = new Book(author, libraryId, title, description, loanedOut);
        libraryItems.add(newBook);

            for (LibraryItem Item1 : libraryItems) {
                System.out.printf("Author: %s%n" +
                                "Title: %s%n" +
                                "Description: %s%n" +
                                "ID: %d%n%n", Item1.getAuthor(),
                        Item1.getTitle(),
                        Item1.getDescription(),
                        Item1.getLibraryId());
            }

            System.out.println("Data Successfully appended into file"); }

//        ask.runask();

    }
