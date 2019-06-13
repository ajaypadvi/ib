package level02.arrays.bucketingorsorting;

import java.util.Comparator;
import java.util.List;

/**
 * There are three solutions posted here
 */
public class FindDuplicateInArray {
    /**
     * 1st one is using bucketing in order to determine whether that element has already appeared in the list while
     * sequentially iterating over it.
     *
     * @param a
     * @return
     */
    // DO NOT MODIFY THE LIST
    public int repeatedNumber1(final List<Integer> a) {
        int duplicate = -1;
        if (a == null || a.size() == 0) {
            return duplicate;
        }

        int n = a.size();
        int[] cache = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (cache[a.get(i) + 1] == 1) {// if its already set that means its duplicate
                duplicate = a.get(i);
                break;
            } else {
                cache[a.get(i) + 1] = 1;
            }
        }

        return duplicate;
    }

    /**
     * Second solution is from interview bit, which involves sorting of list first and then checking every element with
     * the next consecutive element to see it its same and repeated. pretty simple and straight forward.. isn't it?
     *
     * @param a
     * @return
     */

    // DO NOT MODIFY THE LIST
    public int repeatedNumber2(final List<Integer> a) {
        int duplicate = -1;
        if (a == null || a.size() == 0) {
            return duplicate;
        }
        a.sort(Comparator.naturalOrder());
        int n = a.size();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && a.get(i).equals(a.get(i + 1))) {
                duplicate = a.get(i);
                break;
            }
        }
        return duplicate;
    }

    /**
     * Third Solution of the problem is taken from this video as below which worked only in case of non final immutable
     * list as it involves doing mutable operations on the list
     * <p>
     * This uses no additional space and also sorting is not required, Hence thi smethod of finding duplicate in an
     * array is the most efficient method for finding dups
     *
     * This will give an error
     * Exception in thread "main" java.lang.UnsupportedOperationException: Read only list. Mutations not allowed!
     * @param a
     * @return
     */

    // DO NOT MODIFY THE LIST
    public int repeatedNumber3(final List<Integer> a) {
        int duplicate = -1;
        if (a == null | a.size() == 0) {
            return duplicate;
        }
        int n = a.size();
        for (int i = 0; i < n; i++) {
            int number = Math.abs(a.get(i));
            if (a.get(number) < 0) {
                duplicate = number;
            } else {
                a.set(number, -a.get(number));
            }
        }

        return duplicate;
    }
}


