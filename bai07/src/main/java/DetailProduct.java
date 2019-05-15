import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DetailProduct extends Stage {
    private Label labelName = new Label("Name:");
    private Label labelDescription = new Label("Description:");

    private TextField txtName = new TextField();
    private TextField txtDescription = new TextField();

    private Button btnSave = new Button("Save");
    private Button btnCancel = new Button("Cancel");

    private GridPane gridPane = new GridPane();
    private Scene scene;

    public DetailProduct(){
        super();
        this.setupUI();
    }

    public void setupUI() {
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10,10, 10, 10));
        gridPane.add(labelName, 0, 0);
        gridPane.add(txtName, 1,0);

        gridPane.add(labelDescription, 0, 1);
        gridPane.add(txtDescription, 1,1);

        gridPane.add(btnSave, 0, 2);
        gridPane.add(btnCancel, 1,2);

        gridPane.setAlignment(Pos.TOP_CENTER);

        scene = new Scene(gridPane, 300, 300);
        this.setScene(scene);
    }
}
