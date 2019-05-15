import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class DetailProduct extends Stage {
    private String type = "insert";//insert/update
    private Product selectedProduct;

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
        //Update UI
        txtName.setText(selectedProduct.getProductName());
        txtNumberOfProducts.setText(selectedProduct.getNumberOfProducts().toString());
    }

    public void setType(String type) {
        this.type = type;
        if(type.equals("insert")) {
            btnSave.setText("Add");
            selectedProduct = new Product();
        } else if(type.equals("update")) {
            btnSave.setText("Save");
        }
    }

    public String getType() {
        return type;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    private Label labelTitle = new Label("Your detail product");

    private Label labelName = new Label("Name:");
    private Label labelNumberOfProducts = new Label("Number of products:");

    private TextField txtName = new TextField();
    private TextField txtNumberOfProducts = new TextField();

    private Button btnSave = new Button("Save");
    private Button btnCancel = new Button("Cancel");

    private VBox vBox = new VBox();
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

        gridPane.add(labelNumberOfProducts, 0, 1);
        gridPane.add(txtNumberOfProducts, 1,1);

        gridPane.add(btnSave, 0, 2);
        gridPane.add(btnCancel, 1,2);

        gridPane.setAlignment(Pos.TOP_CENTER);
        labelTitle.setPadding(new Insets(10,10,10,20));
        vBox.getChildren().addAll(labelTitle, gridPane);
        scene = new Scene(vBox, 300, 300);
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DetailProduct.this.close();
            }
        });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String updatedProductName = txtName.getText();
                Integer updatedNumberOfProducts = Integer.valueOf(txtNumberOfProducts.getText());
                selectedProduct.setProductName(updatedProductName);
                selectedProduct.setNumberOfProducts(updatedNumberOfProducts);
                DetailProduct.this.close();
            }
        });

        this.setScene(scene);
    }
}
