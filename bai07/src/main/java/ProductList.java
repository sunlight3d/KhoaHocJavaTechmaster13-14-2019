import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.Optional;

public class ProductList extends Stage {
    private Label labelTitle = new Label("This is your products");
    private VBox vbox = new VBox();
    private Scene scene;
    private String name;
    //listview, tableview
    private TableView tableView = new TableView<Product>();

    private TableColumn columnProductId = new TableColumn("Product's Id");
    private TableColumn columnProductName = new TableColumn("product's name");
    private TableColumn columnNumberOfProducts = new TableColumn("Count");
    private Button btnAddNewProduct = new Button("Add new Product");
    //data
    private ObservableList<Product> products = FXCollections.observableArrayList(
        new Product(1, "iphone 5", 5),
            new Product(2, "iphone 6", 6),
            new Product(3, "iphone 7", 7)
    );
    private ContextMenu contextMenu = new ContextMenu();
    private MenuItem menuItemDelete = new MenuItem("Delete");
    private MenuItem menuItemProperties = new MenuItem("Properties");
    private Product selectedProduct;

    private void setupContextMenu() {
        contextMenu.getItems().addAll(menuItemDelete, menuItemProperties);
        menuItemDelete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("press Delete");
                showConfirmationDialog();
            }
        });
        menuItemProperties.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("press Properties");
                //show detail
                DetailProduct detailProduct = new DetailProduct();
                detailProduct.setAlwaysOnTop(true);
                detailProduct.showAndWait();
            }
        });
    }
    private void setupTableView() {
        columnProductId.setCellValueFactory(new PropertyValueFactory<>("productId"));
        columnProductName.setCellValueFactory(new PropertyValueFactory<>("productName"));
        columnNumberOfProducts.setCellValueFactory(new PropertyValueFactory<>("numberOfProducts"));

        tableView.getColumns().addAll(columnProductId, columnProductName,
                columnNumberOfProducts);
        tableView.setItems(products);
        setupContextMenu();
        tableView.setRowFactory(tv -> {
            final TableRow tableRow = new TableRow<>();
            tableRow.setOnMouseClicked(new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    selectedProduct = (Product)tableRow.getItem();
                    if(event.getButton() == MouseButton.SECONDARY) {
                        System.out.println("Press right button");
                        contextMenu.show(tableView, event.getScreenX(), event.getScreenY());
                    } else if(event.getClickCount() == 2) {
                        System.out.println("Double click mouse");
                    }
                }
            });
            return tableRow;
        });
    }
    //Google confirm popup javafx
    private void showConfirmationDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Delete a Product");
        alert.setContentText("Are you sure you want to delete this product?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
            products.remove(selectedProduct);
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
    public ProductList(String name) {
        super();
        this.name = name;
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(15);
        vbox.getChildren().addAll(labelTitle, tableView, btnAddNewProduct);
        //labelTitle.setText("Name is : "+this.name);
        vbox.setAlignment(Pos.TOP_CENTER);
        labelTitle.setFont(Font.font(20));
        setupTableView();
        scene = new Scene(vbox, 500, 800);
        this.setScene(scene);
    }
}
