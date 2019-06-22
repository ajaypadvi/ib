package level02.arrays.valueranges;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> output = new ArrayList<>();
        if (intervals == null || intervals.size() == 0) {
            return output;
        }

        //sort the list based on startIndex
        intervals.sort(Comparator.comparingInt(i -> i.start));

        int n = intervals.size();
        for (int i = 0; i < n; i++) {
            int startValue = intervals.get(i).start;
            int endValue = intervals.get(i).end;

            while (i + 1 < n && endValue >= intervals.get(i + 1).start) {
                endValue = Math.max(endValue, intervals.get(i + 1).end);
                i++;
            }
            output.add(new Interval(startValue, endValue));
        }
        System.out.println("After merge overlapping intervals ::" + output);
        return output;

    }

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return String.format("[%d,%d]", start, end);
        }
    }
}
