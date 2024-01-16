public class RewardValue {
    private static final double RATE = 0.0035;
    private double cash;
    private double miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / RATE;
    }

    public RewardValue(String miles) {
        this.miles = Double.parseDouble(miles);
        this.cash = this.miles * RATE;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.miles;
    }
}