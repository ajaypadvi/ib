package level02.arrays.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FlipTest {

    Flip flip;

    @Before
    public void before() {
        flip = new Flip();
    }

    @Test
    public void test1() {
        ArrayList<Integer> output = flip.flip("010");
        assertEquals(new ArrayList<>(Arrays.asList(1, 1)), output);
    }

//    @Test
//    public void test2() {
//        ArrayList<Integer> output = flip.flip("111");
//        assertEquals(new ArrayList<>(), output);
//    }

}
