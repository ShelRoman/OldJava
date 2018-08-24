package training.matrix;

/**
 * Created by user on 22/11/2015.
 */
class Matrix {
    private int[][] value;

    Matrix(final int hor, final int vert) {
        value = new int[hor][vert];
    }

    public int getHorizontalSize() {
        return value.length;
    }

    public int getVerticalSize() {
        return value[0].length;
    }

    public int getElement(final int hor, final int vert) {
        return value[hor][vert];
    }

    public void setElement(final int toSet, final int hor, final int vert) {
        value[hor][vert] = toSet;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                result.append("[" + value[i][j] + "] ");
            }
            result.append("\n");
        }
        return result.toString();
    }

}
