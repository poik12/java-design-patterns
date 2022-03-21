package com.designpatterns.structural.adapter.exercise_2.api;

import java.time.LocalDate;

public class LibraryAPIImpl implements LibraryAPI{
    @Override
    public boolean isAvailable(String bookTitle) {
        System.out.println("Check availability " + bookTitle);
        return true;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Check date of return for " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Reserve " + bookTitle);
        return true;
    }
}
