package level02.arrays.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAbsoluteDifferenceTest {

    MaximumAbsoluteDifference maximumAbsoluteDifference;

    @Before
    public void before() {
        maximumAbsoluteDifference = new MaximumAbsoluteDifference();
    }

    @Test
    public void test1() {
        int answer = maximumAbsoluteDifference.maxArr(new ArrayList<>(Arrays.asList(1, 3, -1)));
        assertEquals(5, answer);
    }

    //-70, -64, -6, -56, 64,
    //                         61, -57, 16, 48, -98
    @Test
    public void test2() {
        int answer = maximumAbsoluteDifference.maxArr(new ArrayList<>(Arrays.asList(-70, -64, -6, -56, 64, 61, -57,
                16, 48, -98)));
        assertEquals(167, answer);
    }

    @Test
    public void test3() {
        int answer = maximumAbsoluteDifference.maxArr(new ArrayList<>(Arrays.asList(2, 2, 2)));
        assertEquals(2, answer);
    }
}
