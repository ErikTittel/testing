package testing;

import java.math.BigDecimal;

public class CustomerService {

    private CustomerRepository repo;

    public String saveCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Customer loadCustomer(String id) {
        return repo.load(id);
    }

    public int getCustomerCount() {
        return repo.size();
    }

    public BigDecimal calculateTaxes(Customer customer) {
        return bigAndComplicatedTaxCalculationAlgorithm(customer);
    }

    @SuppressWarnings("UnusedParameters")
    BigDecimal bigAndComplicatedTaxCalculationAlgorithm(Customer customer) {
        throw new RuntimeException("Calculation just needs to much time and resources");
    }

    public void setRepo(CustomerRepository repo) {
        this.repo = repo;
    }
}
