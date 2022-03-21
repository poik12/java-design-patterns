package com.designpatterns.structural.adapter.exercise_2;

import com.designpatterns.structural.adapter.exercise_2.api.LibraryAPI;
import com.designpatterns.structural.adapter.exercise_2.api.LibraryAPIImpl;
import com.designpatterns.structural.adapter.exercise_2.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {

        LibraryAPI api = new LibraryAPIImpl();
        User user = new User("Jan", "Kowalski", "9999999");

        BookConnector connector = new BookConnector(user, api);
        connector.checkAvailability("Harry Potter and Prisoner of Azkaban");


        LibraryAPIv2Impl libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connectorForAdapter = new BookConnector(user, apiAdapter);
        connectorForAdapter.checkAvailability("Harry Potter and Prisoner of Azkaban");
    }

}
