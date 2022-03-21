package com.designpatterns.structural.adapter.exercise_2.api;

import java.time.LocalDate;

public interface LibraryAPIv2 {

    int numberOfAvailableCopies(String bookTitle);

    LocalDate dueDate(String bookName, String firstName, String lastName, LocalDate dateOfBirth);

    boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOBirth);
}
