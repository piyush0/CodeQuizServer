package com.codingblocks.codequiz.models;

/**
 * Created by piyush0 on 27/12/16.
 */
public class Option {
    String answer;
    Boolean correct;

    public Option(String answer, Boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }
}
