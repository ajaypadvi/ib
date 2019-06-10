package level02.arrays.missing_repeatednumber;

import java.util.ArrayList;
import java.util.Comparator;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> a) {
        int output = Integer.MIN_VALUE;
        if (a == null || a.size() == 0) {
            return output;
        }
        a.sort(Comparator.naturalOrder());
        int n = a.size();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > 0) {
                if (a.get(i) == count) {
                    count++;
                } else {
                    output = count;
                    break;
                }
            }
        }
        if (output == Integer.MIN_VALUE) {
            return count;
        } else {
            return output;
        }
    }
}
