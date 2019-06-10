package level02.arrays.bucketing;

import java.util.ArrayList;
import java.util.Comparator;

public class NobleInteger {

    public int solve(ArrayList<Integer> A) {
        int nobleFound = -1;
        if (A == null | A.size() == 0) {
            return nobleFound;
        }
        int n = A.size();
        // Sort the Array
        A.sort(Comparator.naturalOrder());
        System.out.println("Sorted Array : " + A);
        for (int i = 0; i < n; i++) {
            while (i + 1 < n && A.get(i).equals(A.get(i + 1))) {// In case of duplicates, skip the duplicates and
                // always consider last available duplicate
                //eg 2,2,2,1 in this case consider the duplicate element 2 at 2nd index(zero based starting from 0)
                i++;
            }
            if (A.get(i) == Math.abs(n - i - 1)) {
                System.out.printf("Noble number found at %d = %d", i, A.get(i));
                nobleFound = 1;
                break;
            }
        }
        return nobleFound;
    }
}
