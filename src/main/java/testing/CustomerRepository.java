package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CustomerRepository {

    private Map<String, Customer> store = new HashMap<>();

    public String save(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        store.put(customer.getId(), customer);
        return customer.getId();
    }

    public Customer load(String id) {
        return store.get(id);
    }

    public int size() {
        return store.size();
    }
}
