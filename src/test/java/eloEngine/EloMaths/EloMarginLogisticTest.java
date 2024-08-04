package eloEngine.EloMaths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.Math;


class EloMarginLogisticTest{
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
        EloMarginLogistic eloMarginLogistic = new EloMarginLogistic(margin);
        Assertions.assertTrue((eloMarginLogistic.getMarginAdj() < 1));

    }

}