package Adapters;

import java.rmi.RemoteException;

import Abstract.CheckCustomerService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckCustomerService{

	@Override
	public boolean IsCustomerReal(Customer customer) {
	
		boolean result = false;
		
		KPSPublicSoap kpsPublic = new KPSPublicSoapProxy();
		try {
			result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBornYear().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	
		return result;
	}
	
	
	
	
}
