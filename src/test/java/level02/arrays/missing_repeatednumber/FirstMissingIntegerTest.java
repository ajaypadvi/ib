package level02.arrays.missing_repeatednumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingIntegerTest {

    FirstMissingInteger firstMissingInteger;

    @Before
    public void before() {
        firstMissingInteger = new FirstMissingInteger();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 0));
        int output = firstMissingInteger.firstMissingPositive(input);
        assertEquals(3, output);
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, -1, 1));
        int output = firstMissingInteger.firstMissingPositive(input);
        assertEquals(2, output);
    }

    @Test
    public void test3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-8, -7, -6));
        int output = firstMissingInteger.firstMissingPositive(input);
        assertEquals(1, output);
    }
}
