package ConvenienceStore.Interface;

import ConvenienceStore.Model.Customer;

public interface ICashier {

    void sell(Customer customer);

    void dispenseReceipt(Customer customer );
}
