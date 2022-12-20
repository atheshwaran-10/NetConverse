package Server;
import Server.Server;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import static javafx.application.Application.launch;

public class Server_1 extends Application
{
    private static ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();
    public void start(Stage primaryStage) throws Exception
    {
            Label l1=new Label("Waiting for clients...");
            StackPane root = new StackPane();
            root.getChildren().add(l1);
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setTitle(" Server Application");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket;
        Socket socket;
        serverSocket = new ServerSocket(8889);
        launch(args);
        socket = serverSocket.accept();
        System.out.println("Connected");
        ClientHandler clientThread = new ClientHandler(socket,clients);
        clients.add(clientThread);
        clientThread.start();

    }
}
