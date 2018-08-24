package training.matrix;

/**
 * Created by user on 22/11/2015.
 */
public class Summator {

    public static Matrix sum(final Matrix matrixA, final Matrix matrixB) {
        Matrix result = new Matrix(matrixA.getHorizontalSize(),matrixA.getVerticalSize());
        for (int i = 0; i < result.getHorizontalSize(); i++) {
            for (int j = 0; j < result.getVerticalSize(); j++) {
                result.setElement((matrixA.getElement(i,j)+ matrixB.getElement(i,j)), i, j);
            }
        }
        return result;
    }
}
