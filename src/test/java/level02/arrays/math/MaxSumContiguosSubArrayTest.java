package level02.arrays.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumContiguosSubArrayTest {

    MaxSumContiguosSubArray maxSumContiguosSubArray;

    @Before
    public void before() {
        maxSumContiguosSubArray = new MaxSumContiguosSubArray();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        int output = maxSumContiguosSubArray.maxSubArray(input);
        assertEquals(6, output);
    }
}
