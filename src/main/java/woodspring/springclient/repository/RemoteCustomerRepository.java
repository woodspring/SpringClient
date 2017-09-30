package woodspring.springclient.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import woodspring.springclient.entity.Customer;

public class RemoteCustomerRepository implements CustomerRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteCustomerRepository(String serviceUrl_) {
		this.serviceUrl = serviceUrl_.startsWith("http://") ? serviceUrl_
															: "http://"+serviceUrl_;
	}

	@Override
	public List<Customer> getCustomerList() {
		 Customer[] customers = restTemplate.getForObject( serviceUrl+"/springCustomer/customers", Customer[].class);
		return Arrays.asList( customers);
	}

	@Override
	public Customer getCustomer(Integer id) {
		return restTemplate.getForObject( serviceUrl + "/springCustomer/customer/{id}",
				Customer.class, id);
	}

}
