package ConvenienceStore.Model;


import ConvenienceStore.Enum.CashierDuty;
import ConvenienceStore.Interface.ICashier;

public class Cashier extends Person implements ICashier {

    private CashierDuty duty;
    private int testResult;

    private  Product product;
    private Customer customer;


    public Cashier(String name,CashierDuty duty, int testResult) {
        super(name);
        this.duty = duty;
        this.testResult = testResult;
    }

    public CashierDuty getDuty() {
        return duty;
    }

    public void setDuty(CashierDuty duty) {
        this.duty = duty;
    }

    public int getTestResult() {
        return testResult;
    }

    public void setTestResult(int testResult) {
        this.testResult = testResult;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void sell() {
        System.out.println("Dear" + customer.getName() + "you are about to purchase:" + product.getName() +"\n Price:" +
                product.getPrice() +"\n Quantity: " + product.getPrice());
    }


    @Override
    public void dispenseReceipt(Customer customer) {
        System.out.println("This is your receipt.");
    }
}

