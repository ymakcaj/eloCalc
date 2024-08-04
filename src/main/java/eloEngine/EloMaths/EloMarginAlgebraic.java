package eloEngine.EloMaths;

import java.lang.Math;

public class EloMarginAlgebraic extends EloMargin {

    public double margin;
    public double marginAdj;

    public EloMarginAlgebraic(double margin) {
        super(margin);
        calculateMargin();
    }

    @Override
    public void calculateMargin() {
        this.marginAdj = 0.5 * (1 + (margin /(Math.sqrt(1 + Math.pow(margin, 2)))));
    }
    
    @Override
    public double getMarginAdj() {
        return this.marginAdj;
    }
}
