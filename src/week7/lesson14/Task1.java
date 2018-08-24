package week7.lesson14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Task1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("First application");
		stage.setScene(createScene());
		stage.show();
	}
	
	public Scene createScene() {
		return null;
	}
}
