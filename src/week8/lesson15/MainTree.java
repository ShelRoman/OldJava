package week8.lesson15;

public class MainTree {

	public static void main(String[] args) {
		BinTree tree1 = new BinTree();
		for (int i = 0; i < 100; i++) {
			tree1.add( (int) (100 * Math.random()));
			i++;
		}
		System.out.println(tree1.indexOf(23));
	}

}
