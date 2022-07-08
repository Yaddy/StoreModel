package ConvenienceStore;


import ConvenienceStore.Enum.CashierDuty;
import ConvenienceStore.Enum.StaffRole;
import ConvenienceStore.Model.Cashier;
import ConvenienceStore.Model.Customer;
import ConvenienceStore.Model.Manager;
import ConvenienceStore.Model.Product;


public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Brian",1234, new Product("Bread", 202, 4, 300));
        Manager manager = Manager.getInstance();
        Cashier cashier = new Cashier("Favor",CashierDuty.HIRED,50);
        manager.enrollCashier(cashier);
        customer1.purchaseProduct();

    }



    }




