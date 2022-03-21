package com.designpatterns.structural.adapter.exercise_2;

import com.designpatterns.structural.adapter.exercise_2.api.LibraryAPI;
import com.designpatterns.structural.adapter.exercise_2.api.LibraryAPIv2;
import com.designpatterns.structural.adapter.exercise_2.api.LibraryAPIv2Impl;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private final User user;
    private final LibraryAPIv2 libraryAPIv2;

    public APIAdapter(LibraryAPIv2Impl libraryAPIv2, User user) {
        this.user = user;
        this.libraryAPIv2 = libraryAPIv2;
    }


    @Override
    public boolean isAvailable(String title) {
        return libraryAPIv2.numberOfAvailableCopies(title)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(
                bookTitle,
                user.getFirstName(),
                user.getLastName(),
                user.getDateOfBirth()
        );
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(
                bookTitle,
                user.getFirstName(),
                user.getLastName(),
                user.getDateOfBirth()
        );
    }
}
