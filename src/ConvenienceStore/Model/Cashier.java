package ConvenienceStore.Model;


import ConvenienceStore.Enum.CashierDuty;
import ConvenienceStore.Interface.ICashier;

public class Cashier extends Person implements ICashier {

    private CashierDuty duty;
    private String name;
    private int testResult;


    public Cashier(CashierDuty duty, String name, int testResult) {
        this.duty = duty;
        this.name = name;
        this.testResult = testResult;
    }

    public CashierDuty getDuty() {
        return duty;
    }

    public void setDuty(CashierDuty duty) {
        this.duty = duty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestResult() {
        return testResult;
    }

    public void setTestResult(int testResult) {
        this.testResult = testResult;
    }




    @Override
    public void sell(Customer customer) {
        System.out.println("Dear" + customer + "your order has been processed successfully!");
    }

    @Override
    public void dispenseReceipt(Customer customer) {
        System.out.println("This is your receipt.");
    }
}

