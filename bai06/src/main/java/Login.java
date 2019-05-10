import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Stage {
    private VBox vbox = new VBox();
    private TextField textFieldName = new TextField();
    private PasswordField textFieldPassword = new PasswordField();
    private Button buttonLogin = new Button("Login");
    private Button buttonRegister = new Button("Register");
    private Label labelDescription = new Label();
    private HBox hbox = new HBox();
    private Scene scene;

    public Login(){
        super();
        this.setupUI();
    }

    public void setupUI() {
        textFieldName.setPadding(new Insets(10,10, 10,10));
        textFieldName.setPromptText("Enter your name");
        textFieldPassword.setPadding(new Insets(10,10, 10,10));
        textFieldPassword.setPromptText("Enter your password");
        buttonLogin.setMinHeight(50);
        buttonLogin.setMinWidth(120);
        buttonLogin.setFont(Font.font(24));

        buttonRegister.setMinHeight(50);
        buttonRegister.setMinWidth(120);
        buttonRegister.setFont(Font.font(24));

        buttonLogin.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String name = textFieldName.getText();
                String password = textFieldPassword.getText();
                labelDescription.setText("Name = "+name+",Pass= "+password);
                ProductList productList = new ProductList(name);
                productList.show();
                hide();
            }
        });

        hbox.getChildren().addAll(buttonLogin, buttonRegister);
        hbox.setSpacing(20);
        hbox.setAlignment(Pos.CENTER);

        labelDescription.setText("Chao ban");
        labelDescription.setFont(Font.font(25));
        vbox.getChildren().addAll(textFieldName, textFieldPassword, hbox, labelDescription);

        vbox.setSpacing(20);
        vbox.setPadding(new Insets(50,20,20,20));
        scene = new Scene(vbox, 480, 720);
        this.setScene(scene);
    }
}
