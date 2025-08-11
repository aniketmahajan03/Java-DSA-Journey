import java.util.*;

public class FractionalKnapsack {

    public static void main(String args[]) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        // Create an array of ratios (value/weight)
        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; // index
            ratio[i][1] = val[i] / (double) weight[i]; // value/weight ratio
        }

        // Sort based on the ratio in descending order
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        int capacity = W;
        double finalVal = 0; // Use double for final value, since fractions are involved.

        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0]; // Item index
            if (capacity >= weight[idx]) {
                // Take whole item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // Take fractional part
                finalVal += ratio[i][1] * capacity;
                break; // The knapsack is full now.
            }
        }

        System.out.println("Final value = " + finalVal);
    }
}
