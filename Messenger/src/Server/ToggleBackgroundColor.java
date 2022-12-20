package Server;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ToggleBackgroundColor extends Application {
    private static final String[] COLORS = {"red", "yellow", "green", "blue", "purple","black","white"};
    private int colorIndex = 0;

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Change Background Colours");
        StackPane root = new StackPane();
        root.getChildren().add(button);
        button.setOnAction(event -> {
            if(colorIndex==COLORS.length-1)
            {
                colorIndex=0;
            }
            colorIndex = (colorIndex + 1);

            root.setStyle("-fx-background-color: " + COLORS[colorIndex]);
        });
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Toggle Background Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
