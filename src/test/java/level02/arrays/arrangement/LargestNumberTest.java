package level02.arrays.arrangement;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumberTest {

    LargestNumber largestNumber;

    @Before
    public void before() {
        largestNumber = new LargestNumber();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        String output = largestNumber.largestNumber(input);
        assertEquals("9534330", output);
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        String output = largestNumber.largestNumber(input);
        assertEquals("0", output);
    }

    @Test
    public void test4() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 9, 8, 3, 7));
        String output = largestNumber.largestNumber(input);
        assertEquals("98730", output);
    }

    @Test
    public void test3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 3, 4, 5));
        String output = largestNumber.largestNumber(input);
        assertEquals("54300", output);
    }

}
