package eloEngine.EloMaths;

import eloEngine.EloMaths.EloMargin;

import java.lang.Math;

public class EloMarginLogistic implements EloMargin {
    
    public double m;
    public double margin;

    public EloMarginLogistic(double m) {
        this.m = m;
        calculateMargin();
        // could we use dependency injection here? to stop init of margin outside
        // the constructor, to avoid null pointers?
    }

    public void calculateMargin() {
        double pow = 1 - Math.pow(m, 2);
        this.margin = 1 / (1 + Math.exp(pow));
    }

    public double getMargin() {
        return this.margin;
    }

}
