package eloEngine.Main;

import eloEngine.EloMaths.EloActualOutcome;

public class Launcher {
    public double m = 130;
    public double margin = 0.7;
    public double x = 0.49;
    public String squashingFunction = "logistic";
    public static void main(String args[]) {

        EloActualOutcome eloActualOutcome = new EloActualOutcome(
            10.0,
            1.5,
            0.49,
            "algebraic"
            );

        eloActualOutcome.calculate();

        System.out.println("Actual Outcome: " + eloActualOutcome.getActualOutcome());
    }
}

