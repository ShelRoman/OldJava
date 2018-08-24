package week5.lesson9;

public enum MyEnum {
	Red, Black, White;

	
	
	public static void myMethod() {
		System.out.println("myMethod");
	}
	
	public static boolean isExist(String s) {
		MyEnum[] vector = MyEnum.values();
		for (int i = 0; i < vector.length; i++) {
			if (String.valueOf(vector[i]).equals(s)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		myMethod();
	}
}