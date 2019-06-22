package level02.arrays.math;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

    public int maxArr(ArrayList<Integer> A) {

        int answer = -1;
        if (A == null || A.size() == 0) {
            return answer;
        }

        int n = A.size();
        int max1 = Integer.MIN_VALUE,
                min1 = Integer.MAX_VALUE,
                max2 = Integer.MIN_VALUE,
                min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, A.get(i) + i);
            min1 = Math.min(min1, A.get(i) + i);
            max2 = Math.max(max2, A.get(i) - i);
            min2 = Math.min(min2, A.get(i) - i);
        }
        answer = Math.max(max1 - min1, max2 - min2);
        return answer;
    }
}
