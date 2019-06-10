package level02.arrays.math;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MinStepsTest {

    private MinSteps minSteps;

    @Before
    public void before() {
        minSteps = new MinSteps();
    }

    @Test
    public void test1() {
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(0, 1, 1));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
        int steps = minSteps.coverPoints(first, second);
        assertEquals(2, steps);
    }

    @Test
    public void test2() {
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(0, -1, -2, -3));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(-1, -2, -2, -3));
        int steps = minSteps.coverPoints(first, second);
        assertEquals(3, steps);
    }
}
