package Concrete;

import Abstract.SaleService;
import Entities.Campagin;
import Entities.Member;

public class SaleManager implements SaleService{

	@Override
	public void saleGame(Member member) {
		System.out.println(member.getUserName() + " bir oyunu satýþa çýkardý.");
	}

	@Override
	public void saleWithCampagin(Campagin campagin, Member member) {
		System.out.println(campagin.getCampaginName() + " isimli kampanya baþladý. "+ member.getUserName() 
		+"'ýn oyunlarýný þimdi %" + campagin.getDiscount() + " indirimli alýn.");
	}
	
}
