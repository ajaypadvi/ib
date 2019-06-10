package level02.arrays.spacerecycle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZerosTest {

    SetMatrixZeros setMatrixZeros;

    @Before
    public void before() {
        setMatrixZeros = new SetMatrixZeros();
    }

    @Test
    public void test1(){
        ArrayList<ArrayList<Integer>> matrix =new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,0,1)),
                new ArrayList<>(Arrays.asList(1,1,1)),
                new ArrayList<>(Arrays.asList(1,1,1))
        ));

        setMatrixZeros.setZeroes(matrix);
    }

    public void test2(){

    }
}
