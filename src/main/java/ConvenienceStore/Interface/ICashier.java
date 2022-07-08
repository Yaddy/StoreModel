package ConvenienceStore.Interface;

import ConvenienceStore.Model.Customer;

public interface ICashier {

    void sell();

    void dispenseReceipt(Customer customer );
}
