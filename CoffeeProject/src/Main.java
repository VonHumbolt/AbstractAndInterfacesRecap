import java.util.Date;

import Abstract.BaseCoffeeManager;
import Adapters.MernisServiceAdapter;
import Concrete.CheckCustomerManager;
import Concrete.StarbucksManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCoffeeManager customerManager = new StarbucksManager(new MernisServiceAdapter());

		Customer customer = new Customer(1, "Kaan", "Kaplan", "152462385", new Date(1997,2,2));
		
		customerManager.add(customer);
		
	}

}
