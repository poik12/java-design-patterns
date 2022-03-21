package com.designpatterns.structural.facade.exercise_2.bank;

class AtmMachine {

    void checkBalance() {
        System.out.println("Current balance: 50%");
    }

    void enterPin() {
        System.out.println("PIN entered");
    }

    void withdrawCash() {
        System.out.println("Cash withdraw successfully");
    }

}
