package training.matrix;

/**
 * Created by user on 22/11/2015.
 */
public class MatrixFactory {

    public static Matrix createRandomizedMatrix(final int hor, final int vert) {
        Matrix result = new Matrix(hor, vert);
        for (int i = 0; i < hor; i++) {
            for (int j = 0; j < vert; j++) {
                result.setElement((int)(Math.random() *100), i, j);
            }
        }
        return result;
}
}
