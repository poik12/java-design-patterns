package com.designpatterns.behavioral.chain_of_responsibility.exercise_1.officer;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_1.message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public abstract void processMessage(Message message);

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }
}
