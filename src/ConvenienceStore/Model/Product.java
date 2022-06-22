package ConvenienceStore.Model;


public class Product {
    private String productName;
    private int productID;

    private int quantity;

    private float Price;


    public Product(String productName, int productID, int quantity, float price) {
        this.productName = productName;
        this.productID = productID;
        this.quantity = quantity;
        Price = price;


    }

    public int getProductID() { return productID; }

    public void setProductID() { this.productID = productID; }

    public String getName() { return productName; }

    public void setName() { this.productName = productName; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public float getPrice() { return Price; }

    public void setPrice(float price) { Price = price; }

}
