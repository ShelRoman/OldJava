package training.taskchallenge;

import java.util.ArrayList;
import java.util.List;

public class MatrixMXN {
    List<Integer[]> tempList;
    private int[][] matrix;


    public MatrixMXN(int rows, int columns) {
        matrix = new int[rows][columns];
    }

    public void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 15));
            }
        }
        tempList = new ArrayList<>();
    }

    public void zerofy() {
        if (findZeros() == 0) {
            return;
        } else {
            int tempListCycles = tempList.size();
            int indexGen = 0;
            while (tempListCycles > 0) {
                int indexRow = tempList.get(indexGen)[0];
                int indexColumn = tempList.get(indexGen)[1];
                zerofyRows(indexRow);
                zerofyColumns(indexColumn);
                indexGen++;
                tempListCycles--;
            }
        }
    }

    private int findZeros() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    tempList.add(new Integer[]{i, j});
                }
            }
        }
        return tempList.size();
    }

    private void zerofyRows(int indexRow) {
        for (int i = 0; i < matrix[indexRow].length; i++) {
            matrix[indexRow][i] = 0;
        }
    }

    private void zerofyColumns(int indexColumn) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][indexColumn] = 0;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10) {
                    result.append(" ");
                }
                result.append(matrix[i][j] + " ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}



