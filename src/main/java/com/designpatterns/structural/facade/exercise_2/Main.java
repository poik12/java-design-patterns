package com.designpatterns.structural.facade.exercise_2;

import com.designpatterns.structural.facade.exercise_2.bank.AtmMachineFacade;

public class Main {

    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

    }

}
