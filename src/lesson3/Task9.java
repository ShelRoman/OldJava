package lesson3;

public class Task9 {
	public static void main(String[] args) {
		int[] vector = new int[6];
		for(int i = 0; i < vector.length; i++){
			vector[i] = (int)(20 * Math.random());
		}
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
	    }
	    vector[5] = 10;
	}
}
//done