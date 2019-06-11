package level02.arrays.simulation;

import java.util.ArrayList;

public class SpiralOrderMatrix2 {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        if (A <= 0) {
            return output;
        }
        //populate two matrix values of output by all 0s
        for (int i = 0; i < A; i++) {
            output.add(new ArrayList<>(A));
            for (int j = 0; j < A; j++) {
                output.get(i).add(0);
            }
        }

        int top = 0;
        int bottom = A - 1;
        int left = 0;
        int right = A - 1;
        int i = 1;
        while (i <= A * A) {

            for (int k = left; k <= right; k++)
                output.get(top).set(k, i++);

            for (int k = top + 1; k <= bottom; k++)
                output.get(k).set(right, i++);

            for (int k = right - 1; k >= left; k--)
                output.get(bottom).set(k, i++);

            for (int k = bottom - 1; k >= top + 1; k--)
                output.get(k).set(left, i++);

            top++;
            right--;
            bottom--;
            left++;
        }
        return output;
    }

}
