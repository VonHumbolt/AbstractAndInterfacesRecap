package Adapters;

import java.util.Calendar;

import Abstract.UserValidationService;
import Entities.Member;

public class EdevletServiceAdapter implements UserValidationService{

	@Override
	public boolean isUserReal(Member member) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(currentYear - member.getBornYear().getYear() >= 18) {
			return true;
		}
	
		return false;
		
	}

}
