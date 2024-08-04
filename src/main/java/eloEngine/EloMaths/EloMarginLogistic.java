package eloEngine.EloMaths;

import java.lang.Math;

public class EloMarginLogistic extends EloMargin {
    
    public double margin;
    public double marginAdj;

    public EloMarginLogistic(double m) {
        super(m);
        calculateMargin();
        // could we use dependency injection here? to stop init of margin outside
        // the constructor, to avoid null pointers?
    }

    @Override
    public void calculateMargin() {
        double pow = 1 - Math.pow(margin, 2);
        this.marginAdj = 1 / (1 + Math.exp(pow));
    }


    @Override
    public double getMarginAdj() {
        return this.marginAdj;
    }

}
