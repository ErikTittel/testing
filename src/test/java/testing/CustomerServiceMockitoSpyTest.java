package testing;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.doReturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceMockitoSpyTest {

    @Spy
    private CustomerService service;

    @Test
    public void calculateTaxes() {
        Customer customer = new Customer();
        doReturn(new BigDecimal("1.23")).when(service).bigAndComplicatedTaxCalculationAlgorithm(customer);

        BigDecimal taxes = service.calculateTaxes(customer);

        assertThat(taxes, is(new BigDecimal("1.23")));
    }
}
