package Calc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CalcGraph extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Badass calculator");
		stage.setScene(createScene());
		stage.show();
	}
	
	public Scene createScene() {
		GridPane grid = new GridPane();
		int row = 1;
		int column = 1;
		for (int i = 0; i < TestProcessor.buttons.length; i++) {
			grid.add(new Button(TestProcessor.buttons[i]), row, column);
			if (row == 4) {
				column++;
				row = 0;
			}
			row++;
		}
		Scene scene = new Scene(grid, 500, 600);
		return scene;
	}

}
