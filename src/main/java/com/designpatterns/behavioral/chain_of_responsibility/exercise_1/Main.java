package com.designpatterns.behavioral.chain_of_responsibility.exercise_1;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_1.message.Message;
import com.designpatterns.behavioral.chain_of_responsibility.exercise_1.officer.*;

public class Main {

    public static void main(String[] args) {

        Message messageForSergeant = new Message(OfficerRank.SERGEANT, 10, "Attack Sergeant!");
        Message messageForCaptain = new Message(OfficerRank.CAPTAIN, 20, "Attack Captain!");
        Message messageForGeneral = new Message(OfficerRank.GENERAL, 30, "Attack General!");

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(messageForGeneral);
        sergeant.processMessage(messageForCaptain);
        sergeant.processMessage(messageForSergeant);
    }

}
