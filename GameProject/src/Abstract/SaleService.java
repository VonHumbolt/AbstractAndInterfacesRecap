package Abstract;

import Entities.Campagin;
import Entities.Member;

public interface SaleService {
	void saleGame(Member member);
	
	void saleWithCampagin(Campagin campagin, Member member);
}
