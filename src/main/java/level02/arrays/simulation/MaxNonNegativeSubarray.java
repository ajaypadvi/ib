package level02.arrays.simulation;

import java.util.ArrayList;

public class MaxNonNegativeSubarray {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> maxSubarray = new ArrayList<>();
        long maxSum = 0;
        if (a == null | a.size() == 0) {
            return maxSubarray;
        }

        ArrayList<Integer> currentSubarray = new ArrayList<>();
        long currentSum = 0;

        int n = a.size();
        for (int i = 0; i < n; i++) {
            if (a.get(i) >= 0) { //If positive, then add to the calculation of finding max sub array - non negative
                currentSum += a.get(i);
                currentSubarray.add(a.get(i));

                if (maxSum < currentSum || (maxSum == currentSum) && maxSubarray.size() < currentSubarray.size()) {
                    //populate maxsum and maxsubarray in following two cases
                    //1. When current sum is greater than max sum
                    //2. When current sum is equal to max sum but size of the current subarray is greater than that
                    // of max subarray
                    maxSum = currentSum;
                    maxSubarray = new ArrayList<>(currentSubarray);
                }
            } else { // If negative then you need to clear all cache as new calculations for finding non negative
                // subarray needs to be restarted
                currentSum = 0;
                currentSubarray.clear();
            }
        }
        return maxSubarray;
    }
}
