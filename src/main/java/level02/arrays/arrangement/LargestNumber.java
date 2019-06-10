package level02.arrays.arrangement;

import java.util.List;

public class LargestNumber {
    // DO NOT MODIFY THE LIST
    public String largestNumber(final List<Integer> a) {
        String output = "";
        a.sort((X, Y) -> {
            StringBuilder XY = new StringBuilder().append(X).append(Y);
            StringBuilder YX = new StringBuilder().append(Y).append(X);
            return YX.toString().compareTo(XY.toString());
        });

        boolean foundFirstPositiveInteger = false;
        for (int i = 0; i < a.size(); i++) {
            if (!foundFirstPositiveInteger && a.get(i) > 0) {
                foundFirstPositiveInteger = true;
            }
            output += a.get(i);
        }

        return !foundFirstPositiveInteger ? "0" : output;
    }
}
