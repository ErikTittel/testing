package testing;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.sameInstance;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceMockitoTest {

    @Mock
    CustomerRepository repo;

    @InjectMocks
    private CustomerService service;

    @Test
    public void saveCustomer() {
        Customer customer = new Customer();
        when(repo.save(customer)).thenReturn("1");

        String id = service.saveCustomer(customer);

        assertThat(id, is("1"));
    }

    @Test
    public void loadCustomer() {
        Customer customer = new Customer();
        when(repo.load("1")).thenReturn(customer);

        Customer loadedCustomer = service.loadCustomer("1");

        assertThat(loadedCustomer, sameInstance(customer));
    }
}
