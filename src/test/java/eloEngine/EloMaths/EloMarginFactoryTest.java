package eloEngine.EloMaths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.Math;
import java.lang.reflect.InvocationTargetException;

class EloMarginFactoryTest{
    private double margin;
    private String squashingFunction;
    private String squashingFunction1;

    @BeforeEach
    void setUp() {
        margin = Math.random() * 1;
        squashingFunction = "logistic";
        squashingFunction1 = "algebraic";
    }

    @AfterEach
    void tearDown() {
      margin = 0;
    }

    @Test
    void executeValid() {
        try {
            EloMargin eloMargin = EloMarginFactory.createEloMargin(squashingFunction, margin);
            Assertions.assertTrue((eloMargin.getMarginAdj() < 1));
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
          e.printStackTrace();
          Assertions.fail("Exception thrown during instruction creation: " + e.getMessage());
      }

    }

    @Test
    void executeValidTwo() {
        try {
            EloMargin eloMargin = EloMarginFactory.createEloMargin(squashingFunction1, margin);
            Assertions.assertTrue(eloMargin.getClass() == EloMarginAlgebraic.class);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
          e.printStackTrace();
          Assertions.fail("Exception thrown during instruction creation: " + e.getMessage());
      }

    }

}