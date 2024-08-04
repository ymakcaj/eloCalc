package eloEngine.EloMaths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.Math;


class EloMarginAlgebraicTest{
    private double margin;

    @BeforeEach
    void setUp() {
        margin = Math.random() * 1;
    }

    @AfterEach
    void tearDown() {
      margin = 0;
    }

    @Test
    void executeValid() {
        EloMarginAlgebraic eloMarginAlEloMarginAlgebraic = new EloMarginAlgebraic(margin);
        Assertions.assertTrue((eloMarginAlEloMarginAlgebraic.getMarginAdj() < 1));

    }

}