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

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1, 1, 1, 1, 1, -1));
        int output = maxSumContiguosSubArray.maxSubArray(input);
        assertEquals(4, output);
    }

    @Test
    public void test3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1, 1, 1, 1, 1, -1));
        int output = maxSumContiguosSubArray.maxSubArray1(input);
        assertEquals(4, output);
    }


    @Test
    public void test4() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        int output = maxSumContiguosSubArray.maxSubArray1(input);
        assertEquals(6, output);
    }
}
