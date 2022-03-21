package com.designpatterns.structural.adapter.exercise_2.api;

import java.time.LocalDate;

public interface LibraryAPI {
    boolean isAvailable(String title);

    LocalDate dueDate(String bookTitle, String pesel);

    boolean reserve(String bookTitle, String pesel);
}
