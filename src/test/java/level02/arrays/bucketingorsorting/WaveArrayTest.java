package level02.arrays.bucketingorsorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class WaveArrayTest {

    WaveArray waveArray;

    @Before
    public void before() {
        waveArray = new WaveArray();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> output = waveArray.wave(input);
        assertEquals(new ArrayList<>(Arrays.asList(2, 1, 4, 3)), output);
    }

    //5, 1, 3, 2, 4
    //1,2,3,4,5 After Sorting
    //2,1,4,3,5 //Expected
    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 3, 2, 4));
        ArrayList<Integer> output = waveArray.wave(input);
        assertEquals(new ArrayList<>(Arrays.asList(2, 1, 4, 3, 5)), output);
    }
}
