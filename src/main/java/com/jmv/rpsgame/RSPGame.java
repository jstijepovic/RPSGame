package com.jmv.rpsgame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.Map;

/**
 * A starting point of rock-scissor-paper game
 *
 */
public class RSPGame {

    private static final int  NUMBER_OF_GAMES = 100;

    private static final Logger logger          = LoggerFactory.getLogger(RSPGame.class);

    public static void main(final String[] args) {

        final PaperPlayer playerA = new PaperPlayer();
        final RandomPlayer blayerB = new RandomPlayer();
        
        final Map<Result, Integer> results = new EnumMap<>(Result.class);

        initResults(results);
        playGame(playerA, blayerB, results);
        printResults(results);
    }

    /**
     * Initialize the {@code results} map with 0 values
     * 
     * @param results the inialized results map
     */
    public static void initResults(final Map<Result, Integer> results) {
        for (final Result r : Result.values()) {
            results.put(r, 0);
        }
    }

    /**
     * Plays {#NUMBER_OF_GAMES} rounds of the game     *
     * @param playerA
     * @param blayerB
     * @param results The results are stored here
     */
    public static void playGame(final PaperPlayer playerA, final RandomPlayer blayerB, final Map<Result, Integer> results) {
        for (int i = 0; i < NUMBER_OF_GAMES; i++ ) {
            playOneRoundOfTheGame(playerA, blayerB, results);
        }
    }

    /**
     * Plays one round of the game     *
     * @param playerA A player
     * @param blayerB B player
     * @param results The results are stored here
     *
     */
    private static void playOneRoundOfTheGame(final Player playerA, final Player blayerB, final Map<Result, Integer> results) {
        final Move moveA = playerA.getNextMove();
        final Move moveB = blayerB.getNextMove();
        final Result result = evaluateMoves(moveA, moveB);
        logger.debug("A: {}, B: {}. result: {}", moveA, moveB, result);
        results.put(result, results.get(result) + 1);
    }

    /**
     * Evaluates one round of the game
     * 
     * @param moveA The move of one player
     * @param moveB The move of another player
     * @return The {@link Result}
     */
    static Result evaluateMoves(final Move moveA, final Move moveB) {
        final Result result;
        if (Move.beats(moveA) == moveB) {
            result = Result.A_WINS;
        }
        else {
            if (Move.beats(moveB) == moveA) {
                result = Result.B_WINS;
            }
            else {
                result = Result.TIE;
            }
        }
        return result;
    }

    /**
     * Prints the results
     * 
     * @param results - The results
     */
    public static void printResults(final Map<Result, Integer> results) {
        for (final Result r : Result.values()) {
            System.out.printf("%s %d of %d games%n", r.getOutput(), results.get(r), NUMBER_OF_GAMES);
        }
    }

}
