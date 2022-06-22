package ConvenienceStore.Model;

import java.util.List;

public class Inventory {

    private List<Product> product;

    public Inventory(List<Product> product) {this.product = product; }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
