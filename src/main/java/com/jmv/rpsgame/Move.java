package com.jmv.rpsgame;

import java.util.EnumMap;
import java.util.Map;


/**
 * It contains the definition of moves and possible outcomes
 */
public enum Move {

    ROCK, PAPER, SCISSORS;

    /**
     * Holds the moves a move beats
     */
    private static final Map<Move, Move> beats   = new EnumMap<>(Move.class);

    // init the beats
    static {
        beats.put(SCISSORS, PAPER);
        beats.put(ROCK, SCISSORS);
        beats.put(PAPER, ROCK);
    }

    /**
     * Returns the move this move beats
     * 
     * @param m The current move
     * @return The move this move beats
     */
    public static Move beats(final Move m) {
        return beats.get(m);
    }

}
