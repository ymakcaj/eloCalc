package eloEngine.EloMaths;

import eloEngine.EloMaths.EloMarginLogistic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.Math;


class EloMarginLogisticTest{
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
        EloMarginLogistic eloMarginLogistic = new EloMarginLogistic(m);
        Assertions.assertTrue((eloMarginLogistic.getMargin() < 1));

    }

}