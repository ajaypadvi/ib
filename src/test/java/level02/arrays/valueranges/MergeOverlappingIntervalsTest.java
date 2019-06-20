package level02.arrays.valueranges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervalsTest {

    MergeOverlappingIntervals mergeOverlappingIntervals;

    @Before
    public void before() {
        mergeOverlappingIntervals = new MergeOverlappingIntervals();
    }

    @Test
    public void test() {
        //[1,3],[2,6],[8,10],[15,18]
        ArrayList<MergeOverlappingIntervals.Interval> intervals = new ArrayList<>(Arrays.asList(
                new MergeOverlappingIntervals.Interval(1, 3),
                new MergeOverlappingIntervals.Interval(2, 6),
                new MergeOverlappingIntervals.Interval(8, 10),
                new MergeOverlappingIntervals.Interval(15, 18)
        ));
        ArrayList<MergeOverlappingIntervals.Interval> output = mergeOverlappingIntervals.merge(intervals);
        ArrayList<MergeOverlappingIntervals.Interval> expected = new ArrayList<>(Arrays.asList(
                new MergeOverlappingIntervals.Interval(1, 6),
                new MergeOverlappingIntervals.Interval(8, 10),
                new MergeOverlappingIntervals.Interval(15, 18)
        ));
        assertEquals(expected.toString(), output.toString());
    }
}
