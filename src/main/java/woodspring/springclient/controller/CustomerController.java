package woodspring.springclient.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import woodspring.springclient.entity.Customer;
import woodspring.springclient.errorexception.SpringError;
import woodspring.springclient.repository.CustomerRepository;



@RestController
@RequestMapping("SpringClient")
public class CustomerController {
	public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(path="/customerList", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> customerList( Model model) {
		//public String customerList( Model model) {
		//model.addAttribute("customers", customerRepository.getCustomerList());
		//return "customerList";
        List<Customer> custList = customerRepository.getCustomerList();
        Gson gson = new Gson();
        // convert your list to json
        String jsonCartList = gson.toJson( custList);
        // print your generated json
        System.out.println("jsonCartList: " + jsonCartList);
        return new ResponseEntity<Object>(jsonCartList, HttpStatus.OK);
		
	}

//	@RequestMapping("customerDetails/{id}")
//	public String customerDetails(@RequestParam("id")Integer id, Model model) {
//		model.addAttribute("customer", customerRepository.getCustomer(id));
//		return "customerDetails";
//	}
	@RequestMapping(path="/customer/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> customerDetails(@PathVariable("id") String id ) {
        logger.info("Fetching Custoemr with id {}", id);
        Customer customer = customerRepository.getCustomer(Integer.valueOf(id) );
        if ( customer == null) {
            logger.error("Custoemr with id {} not found.", id);
            return new ResponseEntity(new SpringError("User with id " + id + " not found"), HttpStatus.NOT_FOUND);
        }
        Gson gson = new Gson();
        // convert your list to json
        String jsonCustomer = gson.toJson( customer);
        System.out.println("jsonCustomer: " + jsonCustomer);
        return new ResponseEntity<String>(jsonCustomer, HttpStatus.OK);
    }
}
