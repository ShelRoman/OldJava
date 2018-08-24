package Calc;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainCalc extends Application {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		AbstractProcessor processor = new TestProcessor();
		Calc calc = new Calc(processor);
		calc.inSymv('-');
		calc.inSymv('1');
		calc.inSymv('2');
		calc.inSymv('-');
		calc.inSymv('-');
		calc.inSymv('4');
		calc.inSymv('5');
		calc.inSymv('=');
		CalcGraph graph = new CalcGraph();
		graph.launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}