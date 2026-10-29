package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
                new Book(716, "0-88208222-1", "Assata"),
                new Book(402, "978-0-316-12238-2", "The Statistical Probability of Love at First Sight"),
                new Book(746, "978-1503290563", "Pride and Prejudice"),
                new Book(648, "978-0812992946", "The Future"),
                new Book(984, "978-0451519849", "1984")
        };

        // Home menu. Expected input is an int
        int input;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Show available books\n 2. Show checked out books\n 3. Exit app");
            input = scanner.nextInt();
        } while (input != 3);

        availableBooks(books);
    }

    public static void availableBooks (Book[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available books:");

        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.printf("Title: %s\n ID: %d\n ISBN: %s\n", book.getTitle(), book.getId(), book.getIsbn());
            }
        }

        System.out.print("Enter the title of the book you want to check out or enter x to return to the home screen.");
        String input = scanner.nextLine();
        if (!input.equals("x")) {

        }
    }
}