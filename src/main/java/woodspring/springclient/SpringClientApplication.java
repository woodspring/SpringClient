package woodspring.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import woodspring.springclient.repository.CustomerRepository;
import woodspring.springclient.repository.RemoteCustomerRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringClientApplication {
	public static final String CUSTOMER_SERVICE_URL = "http://CUSTOMER-MICROSERVICE";

	public static void main(String[] args) {
		SpringApplication.run(SpringClientApplication.class, args);
	}
	
	@Bean
	public CustomerRepository customerRepository() {
		return new RemoteCustomerRepository( CUSTOMER_SERVICE_URL);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
