public class Product {
    public static Integer maxId = 0;
    private Integer productId;
    private String productName;
    private Integer numberOfProducts;
    public Product() {
        this.productId = Product.maxId++;
        productName = "";
        numberOfProducts = 0;
    }
    public Product(String productName, Integer numberOfProducts) {
        this.productId = Product.maxId++;
        this.productName = productName;
        this.numberOfProducts = numberOfProducts;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setNumberOfProducts(Integer numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
