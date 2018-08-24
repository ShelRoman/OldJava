package week5.lesson9;

@SuppressWarnings("unused")
public class EnumExmple {

	public static void main(String[] args) {
		MyEnum obj = MyEnum.Red;
		String s = obj.toString();
		MyEnum obj1 = MyEnum.valueOf(s);
		MyEnum[] vector = MyEnum.values();
		MyEnum.myMethod();

	}
}
