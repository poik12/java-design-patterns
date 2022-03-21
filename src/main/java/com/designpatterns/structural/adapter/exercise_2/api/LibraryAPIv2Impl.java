package com.designpatterns.structural.adapter.exercise_2.api;

import java.time.LocalDate;

public class LibraryAPIv2Impl implements LibraryAPIv2 {

    @Override
    public int numberOfAvailableCopies(String bookTitle) {
        System.out.println("Check availability " + bookTitle);
        return 3;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Check date of return for " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOBirth) {
        System.out.println("Reserve " + bookTitle);
        return true;
    }
}
