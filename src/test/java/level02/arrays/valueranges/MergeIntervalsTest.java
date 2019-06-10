package level02.arrays.valueranges;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervalsTest {

    MergeIntervals mergeIntervals;

    @Before
    public void before() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    public void test1() {
        ArrayList<MergeIntervals.Interval> inputIntervals = new ArrayList<>(Arrays.asList(new MergeIntervals.Interval(1, 3), new MergeIntervals.Interval(6, 9)));
        ArrayList<MergeIntervals.Interval> output = mergeIntervals.insert(inputIntervals, new MergeIntervals.Interval(2, 5));
        System.out.println(output);
    }

    @Test
    public void test2() {
        ArrayList<MergeIntervals.Interval> inputIntervals = new ArrayList<>(Arrays.asList(new MergeIntervals.Interval(1, 2), new MergeIntervals.Interval(3, 5), new MergeIntervals.Interval(6, 7), new MergeIntervals.Interval(8, 10), new MergeIntervals.Interval(12, 16)));
        ArrayList<MergeIntervals.Interval> output = mergeIntervals.insert(inputIntervals, new MergeIntervals.Interval(4, 9));
        System.out.println(output);
    }

    @Test
    public void test3() {
        ArrayList<MergeIntervals.Interval> inputIntervals = new ArrayList<>();
        ArrayList<MergeIntervals.Interval> output = mergeIntervals.insert(inputIntervals,
                new MergeIntervals.Interval(1, 1));
        System.out.println(output);
    }
}
