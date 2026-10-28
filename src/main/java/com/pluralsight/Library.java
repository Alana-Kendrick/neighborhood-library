package com.pluralsight;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
                new Book(716, "0-88208222-1", "Assata"),
                new Book(402, "978-0-316-12238-2", "The Statistical Probability of Love at First Sight"),
                new Book(746, "978-1503290563", "Pride and Prejudice"),
                new Book(648, "978-0812992946", "The Future"),
                new Book()
        };
    }
}
