package level02.arrays.math;

import java.util.ArrayList;

public class Flip {
    /**
     * Note what is the net change in number of 1s in string S when we flip bits of string S.
     * Say it has A 0s and B 1s. Eventually, there are B 0s and A 1s.
     * So, number of 1s increase by A - B. We want to choose a subarray which maximises this. Note, if we change 1s
     * to -1, then sum of values will give us A - B. Then, we have to find a subarray with maximum sum, which can be
     * done via Kadane’s Algorithm.
     *
     * @param A
     * @return
     */
    public ArrayList<Integer> flip(String A) {
        int[] ZeroOrOne = new int[A.length()]; // if zero then 1, if one then -1.
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0')
                ZeroOrOne[i] = 1;

            else
                ZeroOrOne[i] = -1;
        }

        int sum = 0, left = 0, right = 0, maxSum = -1;
        int leftAns = 0, rightAns = 0;

        for (int i = 0; i < A.length(); i++) {
            sum += ZeroOrOne[i];

            if (sum < 0) {
                left = i + 1;
                sum = 0;
            } else if (sum > maxSum) {
                leftAns = left;
                rightAns = i;
                maxSum = sum;
            }
        }

        if (maxSum <= 0) {
            return answer;
        } else {
            answer.add(leftAns + 1);
            answer.add(rightAns + 1);
        }

        System.out.println(answer);
        return answer;
    }

}
