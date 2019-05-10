public class Product {
    private Integer productId;
    private String productName;
    private Integer numberOfProducts;

    public Product(Integer productId, String productName, Integer numberOfProducts) {
        this.productId = productId;
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
