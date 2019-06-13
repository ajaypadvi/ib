package level02.arrays.bucketingorsorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateInArrayTest {
    FindDuplicateInArray findDuplicateInArray;

    @Before
    public void before() {
        findDuplicateInArray = new FindDuplicateInArray();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 1, 4, 1));
        int duplicate = findDuplicateInArray.repeatedNumber1(input);
        assertEquals(4, duplicate);
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 1, 4, 1));
        int duplicate = findDuplicateInArray.repeatedNumber2(input);
        assertEquals(1, duplicate);
    }

    @Test
    public void test3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 1, 4, 1));
        int duplicate = findDuplicateInArray.repeatedNumber3(input);
        assertEquals(1, duplicate);
    }


}
