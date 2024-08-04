package eloEngine.EloMaths;

public class EloScore {

    public double k;
    public double startingScore;
    public double newScore;
    public double actualOutcome;
    public double expectedOutcome;


    public EloScore(double k, double startingScore, double actualOutcome, double expectedOutcome) {
        this.k = k;
        this.startingScore = startingScore;
        this.actualOutcome = actualOutcome;
        this.expectedOutcome = expectedOutcome;
    }


    public double calculate() {
        this.newScore = startingScore + k * (actualOutcome - expectedOutcome);
        return this.newScore;
    }
    
}
