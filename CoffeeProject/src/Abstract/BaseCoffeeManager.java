package Abstract;
import Entities.Customer;

public abstract class BaseCoffeeManager implements CustomerService {
	
	@Override 
	public void add(Customer customer) {
		System.out.println("Veritaban�na eklendi: "+ customer.getFirstName());
	}
	
}
