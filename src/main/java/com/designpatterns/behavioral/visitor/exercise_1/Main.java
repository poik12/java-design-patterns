package com.designpatterns.behavioral.visitor.exercise_1;

import com.designpatterns.behavioral.visitor.exercise_1.activity.Activity;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Squash;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Treadmill;
import com.designpatterns.behavioral.visitor.exercise_1.activity.Weights;
import com.designpatterns.behavioral.visitor.exercise_1.visitor.Visitor;
import com.designpatterns.behavioral.visitor.exercise_1.visitor.VisitorCaloriesBurnedImpl;
import com.designpatterns.behavioral.visitor.exercise_1.visitor.VisitorPriceImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        Visitor visitor = new VisitorCaloriesBurnedImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("-------------------------");
        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));

        System.out.println("-------------------------");

        Visitor visitor2 = new VisitorPriceImpl();
        activityList.forEach(activity -> activity.accept(visitor2));


    }

}
