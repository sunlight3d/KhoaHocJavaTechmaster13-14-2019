import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello ");
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        //login.setupUI();
        login.show();
    }
}
