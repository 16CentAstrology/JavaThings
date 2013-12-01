import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class JavaFXHello extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override public void start(Stage stage) {
		Label label = new Label("Hello from JavaFX...");
		Scene scene = new Scene(label);
		stage.setScene(scene);
		stage.show();
	}
}