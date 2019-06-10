package level02.arrays.simulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubarrayTest {

    MaxNonNegativeSubarray maxNonNegativeSubarray;

    @Before
    public void before() {
        maxNonNegativeSubarray = new MaxNonNegativeSubarray();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3));
        ArrayList<Integer> output = maxNonNegativeSubarray.maxset(input);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 5)), output);
    }
}
