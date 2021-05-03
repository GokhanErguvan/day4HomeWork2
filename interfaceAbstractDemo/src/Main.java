import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new NeroCustomerManager();
		customerManager.save(new Customer(1600382,"Gokhan", "Erguvan",200,"swsd"));
		
		
			
	
		

	}

}
