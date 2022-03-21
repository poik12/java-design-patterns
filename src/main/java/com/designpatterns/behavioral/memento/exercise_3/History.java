package com.designpatterns.behavioral.memento.exercise_3;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }

}
