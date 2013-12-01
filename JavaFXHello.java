import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class JavaFXHello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 200, 100);
        root.getChildren().add(new Text(50, 50, "Hello from JavaFX."));
        stage.setScene(scene);
        stage.show();
    }
}
