package com.jmv.rpsgame;

/**
 * An enum encapsulating the results of one move which also holds the strings needed for
 * generating the output
 */
public enum Result {

    A_WINS("Player A wins "), B_WINS("Player B wins "), TIE("Tie: ");

    private final String  output;

    Result(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }
}
