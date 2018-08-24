package training.taskchallenge;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        MatrixMXN matrix1 = new MatrixMXN(8, 8);
        matrix1.fillMatrix();
        System.out.println(matrix1);
        matrix1.zerofy();
        System.out.println(matrix1);
    }
}
