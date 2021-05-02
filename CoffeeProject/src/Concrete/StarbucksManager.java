package Concrete;
import Abstract.BaseCoffeeManager;
import Abstract.CheckCustomerService;
import Entities.Customer;

public class StarbucksManager extends BaseCoffeeManager {

	CheckCustomerService checkCustomerService;
	
	public StarbucksManager(CheckCustomerService checkCustomerService) {
		this.checkCustomerService = checkCustomerService;
	}
	
	
	@Override
	public void add(Customer customer) {
		if (this.checkCustomerService.IsCustomerReal(customer)) {
			super.add(customer);	
		} else {
			System.out.println("Böyle bir kullanýcý yok");
		}
		
	}
}
