package level02.arrays.spacerecycle;

import java.util.ArrayList;

public class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        if (a == null || a.size() == 0) {
            return;
        }
        int m = a.size();
        int n = a.get(0).size();

        //initialize two arrays for rows and columns each to keep the record of zeroes encountered
        ArrayList<Integer> rowZeros = new ArrayList<>(m);
        ArrayList<Integer> columnZeros = new ArrayList<>(n);

        for (int i = 0; i < m; i++) {
            rowZeros.add(0);
        }

        for (int j = 0; j < n; j++) {
            columnZeros.add(0);
        }

        // populate row and columns zeros arrays as we encountered any zero while traversing through the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a.get(i).get(j) == 0) {
                    rowZeros.set(i, 1);
                    columnZeros.set(j, 1);
                }
            }
        }

        //set all columns of row as zero
        for (int i = 0; i < rowZeros.size(); i++) {
            if (rowZeros.get(i) == 1) {
                for (int column = 0; column < n; column++) {
                    a.get(i).set(column, 0);
                }
            }
        }

        //Set all rows of column zero
        for (int j = 0; j < columnZeros.size(); j++) {
            if (columnZeros.get(j) == 1) {
                for (int row = 0; row < m; row++) {
                    a.get(row).set(j, 0);
                }
            }
        }

        System.out.println("Final Matrix::");
        a.forEach(System.out::println);
    }
}
