package day4Homework3GameDemo.Adaptor;

import day4Homework3GameDemo.Abstracts.CustomerCheckService;
import day4Homework3GameDemo.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false;
	}

}
