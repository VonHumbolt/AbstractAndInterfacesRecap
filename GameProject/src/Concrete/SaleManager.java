package Concrete;

import Abstract.SaleService;
import Entities.Campagin;
import Entities.Member;

public class SaleManager implements SaleService{

	@Override
	public void saleGame(Member member) {
		System.out.println(member.getUserName() + " bir oyunu sat��a ��kard�.");
	}

	@Override
	public void saleWithCampagin(Campagin campagin, Member member) {
		System.out.println(campagin.getCampaginName() + " isimli kampanya ba�lad�. "+ member.getUserName() 
		+"'�n oyunlar�n� �imdi %" + campagin.getDiscount() + " indirimli al�n.");
	}
	
}
