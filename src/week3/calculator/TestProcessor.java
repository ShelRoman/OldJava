package week3.calculator;

public class TestProcessor extends AbstractProcessor {

	@Override
	public void inputChar(char c) {
		System.out.println("������� " + c);
		setResult(c - (int) ('0')/* getResult()+1 */);
	}
}
