package com.designpatterns.behavioral.state.exercise_3;

import com.designpatterns.behavioral.state.exercise_3.tool.BrushTool;
import com.designpatterns.behavioral.state.exercise_3.tool.EraserTool;
import com.designpatterns.behavioral.state.exercise_3.tool.SelectionTool;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
