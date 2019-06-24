package level02.arrays.simulation;

import java.util.ArrayList;
import java.util.Collections;

public class AntiDiagonals {
    /**
     * Please refer to this vdo link to get more understanding of how to solve this problems
     * https://www.youtube.com/watch?v=T8ErAYobcbc
     *
     * @param a
     * @return
     */
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        if (a == null || a.size() == 0) {
            return answer;
        }
        int m = a.size(); //Number of rows
        int n = a.get(0).size(); //Number of columns
        int i, j;
        for (int k = 0; k <= m - 1; k++) {
            i = k;
            j = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while (i >= 0) {
                list.add(a.get(i).get(j));
                i--;
                j++;
            }
            Collections.reverse(list);
            answer.add(list);
        }

        for (int k = 1; k < n; k++) {
            i = m - 1;
            j = k;
            ArrayList<Integer> list = new ArrayList<>();
            while (j < n) {
                list.add(a.get(i).get(j));
                i--;
                j++;
            }
            Collections.reverse(list);
            answer.add(list);
        }
        return answer;
    }
}
