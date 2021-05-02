package Concrete;

import Abstract.CheckCustomerService;
import Entities.Customer;

public class CheckCustomerManager implements CheckCustomerService{

	@Override
	public boolean IsCustomerReal(Customer customer) {
		
		return false;
	}

}
