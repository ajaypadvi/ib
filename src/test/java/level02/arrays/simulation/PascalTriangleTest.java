package level02.arrays.simulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class PascalTriangleTest {

    PascalTriangle pascalTriangle;

    @Before
    public void before() {
        pascalTriangle = new PascalTriangle();
    }

    @Test
    public void test1() {
        ArrayList<ArrayList<Integer>> answer = pascalTriangle.generate(5);
        assertEquals(answer.size(), 5);
    }
}
