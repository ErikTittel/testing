package testing;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public void saveCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getCustomerCount() {
        return customers.size();
    }
}
