package com.jmv.rpsgame;

/**
 * A player that always returns a {@link Move#PAPER} move
 *
 */
public class PaperPlayer extends Player{

    @Override
    public Move getNextMove() {
        return Move.PAPER;
    }

}
