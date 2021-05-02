package Concrete;

import Abstract.CampaginService;
import Entities.Campagin;

public class CampaginManager implements CampaginService{

	@Override
	public void add(Campagin campagin) {
		System.out.println( campagin.getCampaginName() 
				+ " isimli kampanya ba�lad�.�imdi oyunlar %" 
				+ campagin.getDiscount() + " indirimli!");
	}

	@Override
	public void delete(Campagin campagin) {
		System.out.println(campagin.getCampaginName() + " isimli kampanya silindi");
		
	}

	@Override
	public void update(Campagin campagin) {
		System.out.println("Kampanya g�ncellendi.");
		
	}
	
}
