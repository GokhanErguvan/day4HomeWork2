package day4Homework3GameDemo.Concrate;

import day4Homework3GameDemo.Abstracts.SaleService;
import day4Homework3GameDemo.Entities.Customer;
import day4Homework3GameDemo.Entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void sale(Customer customer, Sale sale) {
		System.out.println(customer.getId()+" Numarali oyuncu "+sale.getGameName()+" Adli oyunu almistir.");
		
	}
	

}
