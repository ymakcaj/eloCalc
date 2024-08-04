package eloEngine.EloMaths;

import eloEngine.EloMaths.EloMarginAlgebraic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.Math;


class EloMarginAlgebraicTest{
    private double m;

    @BeforeEach
    void setUp() {
        m = Math.random() * 1;
    }

    @AfterEach
    void tearDown() {
      m = 0;
    }

    @Test
    void executeValid() {
        EloMarginAlgebraic eloMarginAlEloMarginAlgebraic = new EloMarginAlgebraic(m);
        Assertions.assertTrue((eloMarginAlEloMarginAlgebraic.getMargin() < 1));

    }

}