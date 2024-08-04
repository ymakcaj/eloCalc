package eloEngine.EloMaths;

import eloEngine.EloMaths.EloMargin;

import java.lang.Math;

public class EloMarginAlgebraic implements EloMargin {

    public double m;
    public double margin;

    public EloMarginAlgebraic(double m) {
        this.m = m;
        calculateMargin();
    }

    public void calculateMargin() {
        this.margin = 0.5 * (1 + (m /(Math.sqrt(1 + Math.pow(m, 2)))));
    }
    
    public double getMargin() {
        return this.margin;
    }
}
