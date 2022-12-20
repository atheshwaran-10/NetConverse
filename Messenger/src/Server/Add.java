package Server;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Add extends Application{
    public static void main(String[] args){
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        Label l1 = new Label("Enter number 1: ");
        Label l2 = new Label("Enter number 2: ");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        GridPane root = new GridPane();
        //(column,row)
        root.add(l1,0,0);
        root.add(t1,1,0);
        root.add(l2,0,1);
        root.add(t2, 1, 1);
        Button b1 = new Button("Add");
        Button b2 = new Button("Subtract");
        Button b3 = new Button("Multiple");
        Button b4 = new Button("Divide");
        root.add(b1, 0, 2);
        root.add(b2, 0, 3);
        root.add(b3, 0, 4);
        root.add(b4, 0, 5);
        Label l3 = new Label("");
        root.add(l3,0,8);
        //abstract generic class
        EventHandler<ActionEvent> e = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l3.setText("Sum is "+Integer.toString(a+b));
            }
        };
        EventHandler<ActionEvent> e1 = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l3.setText("Subtract is "+Integer.toString(a-b));
            }
        };
        EventHandler<ActionEvent> e2 = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l3.setText("Multiple is "+Integer.toString(a*b));
            }
        };
        EventHandler<ActionEvent> e3 = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l3.setText("Dividend is "+Integer.toString(a/b));
            }
        };
        b1.setOnAction(e);
        b2.setOnAction(e1);
        b3.setOnAction(e2);
        b4.setOnAction(e3);
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }
}