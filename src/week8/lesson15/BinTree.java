package week8.lesson15;

public class BinTree {
	private BinNode top;

	public BinNode getTop() {
		return top;
	}

	public void setTop(BinNode top) {
		this.top = top;
	}
	
	public void add(int value) {
		if (this.getTop() == null) {
			this.setTop(new BinNode(value));
		} else {
			BinNode cursor = new BinNode(value);
			BinNode comparator = this.getTop();
			boolean runWhile = true;
			while (runWhile) {
				if (cursor.getValue() > comparator.getValue()) {
					if (comparator.getRight() == null) {
						comparator.setRight(cursor);
						runWhile = false;
						break;
					} else {
						comparator = comparator.getRight();
					}
				} else if (cursor.getValue() < comparator.getValue()) {
					if (comparator.getLeft() == null) {
						comparator.setLeft(cursor);
						runWhile = false;
						break;
					} else {
						comparator = comparator.getLeft();
					}
				} else if (comparator.getValue() == cursor.getValue()) {
					runWhile = false;
					System.out.println("Value is already in the tree");
					break;
				}
			}
		}
	}
	
	public int indexOf(int value) {
		int levelCount = 0;
		if (this.getTop() == null) {
			return -1;
		} else {
			BinNode cursor = this.getTop();
			boolean runWhile = true;
			while (runWhile) {
				if (value == cursor.getValue()) {
					return levelCount;
				} else if (value > cursor.getValue()) {
					if (cursor.getRight() == null) {
						return -1;
					} else {
						cursor = cursor.getRight();
						levelCount++;
					}
				} else if (value < cursor.getValue()) {
					if (cursor.getLeft() == null) {
						return -1;
					} else {
						cursor = cursor.getLeft();
						levelCount++;
					}
				}
			
			}
		}
		return levelCount;
	}
}
