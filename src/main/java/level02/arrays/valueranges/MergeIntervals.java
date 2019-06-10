package level02.arrays.valueranges;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> output = new ArrayList<>();
        if (intervals == null ||  newInterval == null) {
            return output;
        }
        //Insert new Interval to intervals array
        intervals.add(newInterval);

        //Sort intervals based on the first value
        intervals.sort(Comparator.comparingInt(i -> i.start));

        int n = intervals.size();
        int startValue, endValue;
        for (int i = 0; i < n; i++) {
            startValue = intervals.get(i).start;
            endValue = intervals.get(i).end;
            while (i + 1 < n && endValue >= intervals.get(i + 1).start) {
                endValue = Math.max(endValue, intervals.get(i + 1).end);
                i++;
            }
            output.add(new Interval(startValue, endValue));
        }
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