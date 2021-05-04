package day4Homework3GameDemo.Concrate;

import day4Homework3GameDemo.Abstracts.CustomerCheckService;
import day4Homework3GameDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		if (customer.getId()==0  || customer.getNickName()=="") {
			return false;
		}else {
			return true;
		}
		
	}
		
		
		
		
	}
	

