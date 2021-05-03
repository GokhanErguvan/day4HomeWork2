package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	
	private CustomerCheckService customerCheckService;
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
		
	}
	
	
	
	@Override
	public void save(Customer customer) {
		
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else
		{
		 throw new ArithmeticException("Not a valid person");
		}
	}
	
	
	
}
