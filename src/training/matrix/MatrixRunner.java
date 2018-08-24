package training.matrix;

/**
 * Created by user on 22/11/2015.
 */
public class MatrixRunner {

    public static void main(String[] args) {
        Matrix matrix = MatrixFactory.createRandomizedMatrix(5, 5);
        Matrix matrix2 = MatrixFactory.createRandomizedMatrix(5, 5);
        System.out.println(matrix);
        System.out.println(matrix2);
        Matrix matrix3 = Summator.sum(matrix, matrix2);
        System.out.println(matrix3);
    }
}
