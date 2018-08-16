package implementation;

public class Checkout {
    private static int runningTotal = 0;

    public void add(int count, int price) {
        runningTotal += (count * price);
    }

    public static int total() {
        return runningTotal;
    }
}