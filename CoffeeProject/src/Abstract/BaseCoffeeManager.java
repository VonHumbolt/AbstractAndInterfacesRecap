package Abstract;
import Entities.Customer;

public abstract class BaseCoffeeManager implements CustomerService {
	
	@Override 
	public void add(Customer customer) {
		System.out.println("Veritabanưna eklendi: "+ customer.getFirstName());
	}
	
}
