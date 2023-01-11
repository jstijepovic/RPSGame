package com.jmv.rpsgame;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RSPGameTest {

    /**
     * Test method for
     * {@link RSPGame#evaluateMoves(Move, Move)}
     * .
     */
    @Test
    public void testEvaluateMoves() {
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.PAPER)).isEqualTo(Result.TIE);
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.PAPER)).isNotEqualTo(Result.A_WINS);
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.PAPER)).isNotEqualTo(Result.B_WINS);

        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.ROCK)).isEqualTo(Result.A_WINS);
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.ROCK)).isNotEqualTo(Result.B_WINS);
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.ROCK)).isNotEqualTo(Result.TIE);

        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.SCISSORS)).isEqualTo(Result.B_WINS);
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.SCISSORS)).isNotEqualTo(Result.A_WINS);
        assertThat(RSPGame.evaluateMoves(Move.PAPER, Move.SCISSORS)).isNotEqualTo(Result.TIE);
    }


}