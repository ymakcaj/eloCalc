package eloEngine.EloMaths;

public abstract class EloMargin {
    public double margin;

    public EloMargin(double margin) {
        this.margin = margin;
    }

    public abstract void calculateMargin();

    public abstract double getMarginAdj();
}
