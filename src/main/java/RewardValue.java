public class RewardValue {
    private static final double RATE = 0.0035;
    private double cash;
    private int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = this.miles * RATE;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.miles;
    }
}