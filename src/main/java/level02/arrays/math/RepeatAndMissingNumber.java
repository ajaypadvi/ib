package level02.arrays.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatAndMissingNumber {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int repeat = -1;
        int missing = -1;
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(repeat, missing));
        if (A == null || A.size() == 0) {
            return output;
        }
        int n = A.size();

        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (count[A.get(i)] == 1) {
                //duplicate-repeat
                repeat = A.get(i);
            } else {
                count[A.get(i)] = 1;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 1) {
                //missing number
                missing = i;
            }
        }

        output.set(0, repeat);
        output.set(1, missing);
        return output;
    }
}
