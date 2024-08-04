package eloEngine.EloMaths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.Math;


class EloActualOutcomeTest{
    public double m;
    public double margin;
    public double x;
    public double actualOutcome;
    public String squashingFunction;

    @BeforeEach
    void setUp() {
        m = 130;
        margin = Math.random() * 1;
        x = 0.49;
        squashingFunction = "logistic";
    }

    @AfterEach
    void tearDown() {
        m = 0;
        margin = 0;
        x = 0;
        actualOutcome = 0;
        squashingFunction = null;
    }

    @Test
    void executeValid() {
        EloActualOutcome eloActualOutcome = new EloActualOutcome(m, margin, x, squashingFunction);
        eloActualOutcome.calculate();
        Assertions.assertTrue((eloActualOutcome.getActualOutcome() > 0));

    }

}