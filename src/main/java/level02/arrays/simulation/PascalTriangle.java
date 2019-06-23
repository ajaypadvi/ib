package level02.arrays.simulation;

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        if (a == 0) {
            return answer;
        }
        answer.add(new ArrayList<>());
        answer.get(0).add(1);

        for (int i = 1; i < a; i++) {
            answer.add(new ArrayList<>());
            answer.get(i).add(1);

            for (int j = 0; j < answer.get(i - 1).size() - 1; j++) {
                answer.get(i).add(answer.get(i - 1).get(j) + answer.get(i - 1).get(j + 1));
            }
            answer.get(i).add(1);
        }
        // System.out.println(answer);
        return answer;
    }
}
