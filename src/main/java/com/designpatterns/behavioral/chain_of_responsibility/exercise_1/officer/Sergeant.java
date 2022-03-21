package com.designpatterns.behavioral.chain_of_responsibility.exercise_1.officer;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_1.message.Message;

public class Sergeant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sergeant";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANT)
                && message.getCode() == CODE) {
            System.out.println(NAME + " has received the message: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
