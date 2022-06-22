package ConvenienceStore.Model;

import ConvenienceStore.Interface.IManager;

import java.util.ArrayList;

public class Manager extends Person implements IManager {

private static Manager manager = new Manager();


    private Manager() {
        super();
    }
    // this is utilized to implement the use of a singleton design pattern
    public static Manager getInstance() {
        if(manager == null) {
            manager = new Manager();
        }
        return manager;
    }



    @Override
    public void enrollCashier(Cashier cashier) {
        System.out.println("A new Manager has been added successfully! ");
    }
}

