package level02.arrays.math;

import java.util.ArrayList;

public class MinSteps {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        if ((A == null || A.size() == 0) || (B == null || B.size() == 0)) {
            return steps;
        }
        if (A.size() != B.size()) {
            return steps;
        }
        for (int i = 0; i < A.size() - 1; i++) {
            int xSteps = Math.abs(A.get(i) - A.get(i + 1));
            int ySteps = Math.abs(B.get(i) - B.get(i + 1));
            steps += Math.max(xSteps, ySteps);
        }
        return steps;
    }
}
