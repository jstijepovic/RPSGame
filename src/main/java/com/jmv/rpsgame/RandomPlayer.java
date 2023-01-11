package com.jmv.rpsgame;

import java.util.Random;

/**
 * A player that always returns a random move
 */
public class RandomPlayer extends Player {
    /**
     * Caches all values of {@link Move} for the random generator
     */
    private static final Move[] moves   = Move.values();

    /**
     * The random number generator used; created once and then cached
     */
    private final Random generator;

    public RandomPlayer() {
        generator = new Random();
    }

    @Override
    public Move getNextMove() {
        return moves[generator.nextInt(moves.length)];
    }

}
