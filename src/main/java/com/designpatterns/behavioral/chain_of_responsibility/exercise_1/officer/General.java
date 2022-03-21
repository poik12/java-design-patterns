package com.designpatterns.behavioral.chain_of_responsibility.exercise_1.officer;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_1.message.Message;

public class General extends Officer {

    private static final int CODE = 30;
    private static final String NAME = "General";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL)
                && message.getCode() == CODE) {
            System.out.println(NAME + " has received the message: " + message.getContent());
        } else {
            System.out.println("Bad recipient of the message or bad message code.");
        }
    }
}
