package level02.arrays.bucketingorsorting;

import java.util.ArrayList;
import java.util.Comparator;

public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        //  A Simple Solution is to use sorting. First sort the input array, then swap all adjacent elements.
        //  For example, let the input array be {3, 6, 5, 10, 7, 20}. After sorting, we get {3, 5, 6, 7, 10, 20}.
        //  After swapping adjacent elements, we get {5, 3, 7, 6, 20, 10}.
        //Sort
        a.sort(Comparator.naturalOrder());
        System.out.println("After Sort::" + a);
        int n = a.size();
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = a.get(i);
                a.set(i, a.get(i + 1));
                a.set(i + 1, temp);
            }
        }
        return a;
    }
}
