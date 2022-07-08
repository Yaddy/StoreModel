package ConvenienceStore.Model;

import ConvenienceStore.Interface.IManager;

import ConvenienceStore.Enum.StaffRole;
public class Manager extends Person implements IManager {

private static Manager manager = new Manager("Daimler");

    StaffRole role = StaffRole.MANAGER;

    public Manager(String name) {
        super(name);
    }

    // this is utilized to implement the use of a singleton design pattern
    public static Manager getInstance() {
        return manager;
    }



    @Override
    public void enrollCashier(Cashier cashier) {
        if(cashier.getTestResult() >= 60) {
            System.out.println(cashier.name + ", you have been enrolled as a new Cashier for our store! ");
        }
        else if(cashier.getTestResult() < 60) {
            System.out.println(cashier.name + ", you did not pass your test, therefore you cannot be hired for the job! ");
        }
    }
}

