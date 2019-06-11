package level02.arrays.math;

import java.util.List;

public class MaxSumContiguosSubArray {

    public int maxSubArray(final List<Integer> a) {
        int max = a.get(0);
        int newSum = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            //The changing condition for dynamic programming is "We should ignore the sum of the previous n-1 elements if nth element is greater than the sum.
            newSum = Math.max(newSum + a.get(i), a.get(i));
            max = Math.max(newSum, max);
            System.out.printf("New Sum = %d, Max Sum=%d\n", newSum, max);
        }
        return max;
    }
}
