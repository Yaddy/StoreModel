package ConvenienceStore.Model;

import ConvenienceStore.Interface.ICustomer;

public class Customer extends Person implements ICustomer {

    private String name;
    private int customerID;

    private String Address;

    private  Product productCart;

    public Customer(String customerName, int customerID, String productCart) {
        this.customerID = customerID;
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Product getProductCart() {
        return productCart;
    }

    public void setProductCart(Product productCart) {
        this.productCart = productCart;
    }

    public void purchaseProduct() {
        System.out.println(getName() + ", you just made a purchase for the following products: " + getProductCart());
    }
}

