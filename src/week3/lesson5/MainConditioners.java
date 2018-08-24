package week3.lesson5;

public class MainConditioners {

	public static void main(String[] args) {
		BlockConditioners block1 = new BlockConditioners();
		for (int i = 0; i < 11; i++) {
			block1.addCond(new Conditioner());
		}
		
		block1.start();
	}

}
