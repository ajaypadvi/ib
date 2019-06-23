package level02.arrays.bucketing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletWithSumBetweenGivenRangeTest {
    TripletWithSumBetweenGivenRange tripletWithSumBetweenGivenRange;

    @Before
    public void before() {
        tripletWithSumBetweenGivenRange = new TripletWithSumBetweenGivenRange();
    }

    @Test
    public void test1() {
        int exists = tripletWithSumBetweenGivenRange.solve(new ArrayList<>(Arrays.asList(
                "0.6", "0.7", "0.8", "1.2", "0.4"
        )));
        assertEquals(1, exists);
    }
}
