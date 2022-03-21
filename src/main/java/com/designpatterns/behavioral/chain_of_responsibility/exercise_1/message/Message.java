package com.designpatterns.behavioral.chain_of_responsibility.exercise_1.message;

import com.designpatterns.behavioral.chain_of_responsibility.exercise_1.officer.OfficerRank;

public class Message {

    private OfficerRank officerRank;
    private int code;
    private String content;

    public Message(OfficerRank officerRank, int code, String content) {
        this.officerRank = officerRank;
        this.code = code;
        this.content = content;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }

    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }
}
