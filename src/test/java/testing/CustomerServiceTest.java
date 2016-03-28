package testing;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

/**
 * @author Erik
 */
public class CustomerServiceTest {

    private CustomerService service = new CustomerService();

    @Test
    public void getCustomerCount() {
        service.saveCustomer(new Customer());
        service.saveCustomer(new Customer());

        int count = service.getCustomerCount();

        assertThat(count, is(2));
    }
}