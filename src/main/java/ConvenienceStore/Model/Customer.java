package ConvenienceStore.Model;

import ConvenienceStore.Interface.ICustomer;
import ConvenienceStore.Model.Product;

public class Customer extends Person implements ICustomer {

    private int customerID;

    private final Product product;

    public Customer(String name, int customerID, Product product ) {
        super(name);
        this.customerID = customerID;
        this.product = product;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    @Override
    public void purchaseProduct() {
        System.out.println( "Hello "+ getName() + " with ID: " + getCustomerID() +
                ", you just made a purchase for the following products: \n" +
                " Name: " + product.getName() +
                "\n ID: " + product.getProductID() +
                "\n Quantity: " + product.getQuantity() +
                "\n Price: " + product.getPrice());
    }

}

