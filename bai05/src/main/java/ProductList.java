import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProductList extends Stage {
    private Label labelDescription = new Label("Haha");
    private VBox vbox = new VBox();
    private Scene scene;
    public ProductList() {
        super();
        vbox.getChildren().addAll(labelDescription);
        scene = new Scene(vbox, 500, 800);
        this.setScene(scene);
    }
}
