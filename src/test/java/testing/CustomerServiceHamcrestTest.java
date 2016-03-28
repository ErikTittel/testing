package testing;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.sameInstance;

import org.junit.Before;
import org.junit.Test;

public class CustomerServiceHamcrestTest {

    private CustomerService service = new CustomerService();

    @Before
    public void setUp() {
        service.setRepo(new CustomerRepository());
    }

    @Test
    public void getCustomerCount() {
        service.saveCustomer(new Customer());
        service.saveCustomer(new Customer());

        int count = service.getCustomerCount();

        assertThat(count, is(2));
    }

    @Test
    public void getCustomer() {
        Customer customer = new Customer();
        String id = service.saveCustomer(customer);

        Customer retrievedCustomer = service.loadCustomer(id);

        assertThat(retrievedCustomer, sameInstance(customer));
    }
}