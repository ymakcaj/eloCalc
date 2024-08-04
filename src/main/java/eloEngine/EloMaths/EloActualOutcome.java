package eloEngine.EloMaths;

import java.lang.reflect.InvocationTargetException;
import java.lang.Math;

public class EloActualOutcome {
    
    public double m;
    public double margin;
    public double x;
    public double actualOutcome;
    public String squashingFunction;
    public EloMargin eloMargin;


    public EloActualOutcome(double m, double margin, double x, String squashingFunction) {
        this.m = m;
        this.margin = margin;
        this.x = x;
        this.squashingFunction = squashingFunction;
        // again, can probably use dep inj here
    }


    public void getEloMargin(String squashingFunction, double margin) {
        try {
            this.eloMargin = EloMarginFactory.createEloMargin(squashingFunction, margin);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create EloMargin", e);
        }
    }

    public void calculate() {
        getEloMargin(squashingFunction, margin);
        this.actualOutcome = x + 0.5 - Math.pow(x, (1+(eloMargin.getMarginAdj()/m)));
    }

    public double getActualOutcome() {
        return this.actualOutcome;
    }


}
