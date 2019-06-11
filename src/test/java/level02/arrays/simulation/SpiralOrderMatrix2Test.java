package level02.arrays.simulation;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SpiralOrderMatrix2Test {
    SpiralOrderMatrix2 spiralOrderMatrix2;

    @Before
    public void before() {
        spiralOrderMatrix2 = new SpiralOrderMatrix2();
    }

    @Test
    public void test1() {
        ArrayList<ArrayList<Integer>> output = spiralOrderMatrix2.generateMatrix(3);
        for (ArrayList<Integer> row : output) {
            System.out.println(row);
        }
    }
}
