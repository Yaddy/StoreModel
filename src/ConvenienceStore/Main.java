package ConvenienceStore;


import ConvenienceStore.Enum.CashierDuty;
import ConvenienceStore.Model.Cashier;
import ConvenienceStore.Model.Customer;
import ConvenienceStore.Model.Manager;
import ConvenienceStore.Model.Product;

import java.util.ArrayList;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        Product product = new Product("Bread", 202, 4, 300);
        Cashier cashier = new Cashier(CashierDuty.HIRED, "Drew", 80);
        Customer customer = new Customer("Trent", 123, "Bread");
        customer.setName("Trent");

        System.out.println(customer.getProductCart());

        customer.purchaseProduct();
    }



    }




