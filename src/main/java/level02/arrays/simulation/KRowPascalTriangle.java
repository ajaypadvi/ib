package level02.arrays.simulation;

import java.util.ArrayList;

public class KRowPascalTriangle {
    /**
     * Below is the solution which runs in O(n^2)
     * <p>
     * As per the HInt in interview bit section
     * Did you account for base cases like numRows = 0, numRows = 1 ?
     * Take a look at how we can approach this problem.
     * Notice that the first and last numbers in each row ( for row >= 2 ) are 1 and 1.
     * For all the other numbers:
     * num at position i = number at position i in prev row + number at position (i + 1) in previous row.
     * Also, notice that for a row, you only need the value in the previous rows.
     * The values in i-2 row do not matter.
     * As such, all you need is to maintain 2 vectors and alternate between them.
     *
     * @param a
     * @return
     */
    public ArrayList<Integer> getRow(int a) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (a == 0) {
            return answer;
        }

        ArrayList<Integer> prev;
        ArrayList<Integer> current = null;

        prev = new ArrayList<>();
        prev.add(1);

        for (int i = 1; i <= a; i++) {
            current = new ArrayList<>();
            current.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                current.add(prev.get(j) + prev.get(j + 1));
            }
            current.add(1);
            prev = current;
        }
        System.out.println(a + " th row of pascal triangle is " + current);
        answer = current;
        return answer;
    }

    //Below is more optimum solution which runs in O(n)
    //time complexity using the formula
    //Formula is (a+1-i)*result.get(i-1)/i
    public ArrayList<Integer> getRow1(int a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(1);
        for(int i=1; i<=a; i++){
            int num = (a+1-i)*result.get(i-1)/i;
            result.add(num);
        }
        return result;
    }

}
