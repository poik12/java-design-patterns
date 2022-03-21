package com.designpatterns.structural.facade.exercise_2.bank;

public class AtmMachineFacade {

    private AtmMachine atmMachine;
    private BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    public void withdrawMoney() {
        atmMachine.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {
            atmMachine.withdrawCash();
        }
    }
}
