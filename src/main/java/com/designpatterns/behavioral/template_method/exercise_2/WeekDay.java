package com.designpatterns.behavioral.template_method.exercise_2;

public abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void wakeUp() {
        System.out.println("Wake up");
    }

    private void getReady() {
        System.out.println("Ready to go");
    }

    protected abstract int goToWork(TypeOfTransport transport);

    protected void summary(int time) {
        System.out.println("Road took: " + time + " minutes");
    }

    protected abstract void work();

    private void goHome() {
        System.out.println("Back Home");
    }

}
