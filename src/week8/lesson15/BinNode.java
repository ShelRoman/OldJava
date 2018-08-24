package week8.lesson15;

public class BinNode {
	private int value;
	private BinNode left;
	private BinNode right;
	
	public BinNode(int value) {
		this.setValue(value);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public BinNode getLeft() {
		return left;
	}
	public void setLeft(BinNode left) {
		this.left = left;
	}
	public BinNode getRight() {
		return right;
	}
	public void setRight(BinNode right) {
		this.right = right;
	}
}
