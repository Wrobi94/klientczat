import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Client client;
    @Override
    public void start(Stage primaryStage) throws Exception{
        client = new Client(primaryStage);
    }

    @Override
    public void stop(){
        client.logout();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
