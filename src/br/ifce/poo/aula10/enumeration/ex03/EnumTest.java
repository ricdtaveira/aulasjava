package br.ifce.poo.aula10.enumeration.ex03;

import java.util.EnumSet;

public class EnumTest {

    public static void main(String args[]) {
        System.out.println("All books:\n");

        // print all books in enum Book
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());
        }

        System.out.println("\nDisplay a range of enum constants:\n");

        // print first four books
        for (Book book : EnumSet.range(Book.JHTP6, Book.CPPHTP4)) {
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    } // end main
} // end class EnumTest
