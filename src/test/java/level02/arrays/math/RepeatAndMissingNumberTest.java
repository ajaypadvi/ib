package level02.arrays.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAndMissingNumberTest {

    RepeatAndMissingNumber repeatAndMissingNumber;

    @Before
    public void before() {
        repeatAndMissingNumber = new RepeatAndMissingNumber();
    }

    @Test
    public void test() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 2, 5, 3));
        ArrayList<Integer> output = repeatAndMissingNumber.repeatedNumber(input);
        assertEquals(new ArrayList<>(Arrays.asList(3, 4)), output);
    }

}
