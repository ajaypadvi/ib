package level02.arrays.math;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        if (a == null || a.size() == 0) {
            return a;
        }

        boolean carry = false;
        for (int i = a.size() - 1; i > -1; i--) {
            int incremented = a.get(i);
            // You will only increment in following two scenarios
            //1. if the carry was set with increment operation
            //2. Increment in case of least significant bit which is the last digit of the number
            if (i == a.size() - 1 || carry) {
                incremented++;
            }
            if (incremented == 10) {
                // the case in which carry has to be set so that next iteration will take that into
                // account and use it for addition
                carry = true;
                a.set(i, 0);
            } else {
                carry = false;
                a.set(i, incremented);
            }
        }
        if (carry) {// if carry is still set after all iterations then you will need to add a new digit to be the
            // most significant digit set to 1
            a.add(0, 1);
        }

        System.out.println("after all op::" + a);
        // To handle the case when you have 0's at the starting of the number as I/P can have 0's at the start while
        // output should not contain any 0 and hence you need to remove those 0s
        ArrayList<Integer> finalList = new ArrayList<>();
        boolean firstNonZeroNumberEncountered = false;
        for (Integer number : a) {
            if (!firstNonZeroNumberEncountered && number.equals(0)) {
            } else {
                firstNonZeroNumberEncountered = true;
                finalList.add(number);
            }
        }
        return finalList;
    }
}
