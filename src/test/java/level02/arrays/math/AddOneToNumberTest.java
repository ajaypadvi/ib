package level02.arrays.math;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AddOneToNumberTest {
    AddOneToNumber addOneToNumber;

    @Before
    public void before() {
        addOneToNumber = new AddOneToNumber();
    }

    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList result = addOneToNumber.plusOne(list);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 5)), result);
    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 9, 9, 9));
        ArrayList result = addOneToNumber.plusOne(list);
        assertEquals(new ArrayList<>(Arrays.asList(1, 0, 0, 0, 0)), result);
    }

    @Test
    public void test3() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        ArrayList result = addOneToNumber.plusOne(list);
        assertEquals(new ArrayList<>(Arrays.asList(1)), result);
    }

    @Test
    public void test4() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 1, 2, 3, 4));
        ArrayList result = addOneToNumber.plusOne(list);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 5)), result);
    }
}
