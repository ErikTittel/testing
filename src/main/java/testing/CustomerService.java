package testing;

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


    public void setRepo(CustomerRepository repo) {
        this.repo = repo;
    }
}
