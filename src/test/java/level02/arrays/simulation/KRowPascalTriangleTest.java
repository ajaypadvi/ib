package level02.arrays.simulation;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class KRowPascalTriangleTest {

    KRowPascalTriangle kRowPascalTriangle;

    @Before
    public void before() {
        kRowPascalTriangle = new KRowPascalTriangle();
    }

    @Test
    public void test1() {
        ArrayList<Integer> answer = kRowPascalTriangle.getRow(4);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 4, 6, 4, 1)), answer);
    }

    @Test
    public void test2() {
        ArrayList<Integer> answer = kRowPascalTriangle.getRow1(4);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 4, 6, 4, 1)), answer);
    }
}
