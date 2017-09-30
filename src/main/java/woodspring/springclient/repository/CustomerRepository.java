package woodspring.springclient.repository;

import java.util.List;

import woodspring.springclient.entity.Customer;

public interface CustomerRepository {
	List<Customer> getCustomerList();
	Customer getCustomer(Integer id);

}
