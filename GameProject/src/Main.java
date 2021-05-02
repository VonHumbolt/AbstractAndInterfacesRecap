import java.util.Date;

import Adapters.EdevletServiceAdapter;
import Concrete.CampaginManager;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Campagin;
import Entities.Member;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Campagin campagin = new Campagin(1, "Black Friday", 20);
		Sale sale = new Sale(1, 200);
		Member member = new Member(1, "darkNight", "Mehmet", "Çevik", "1234", "123123241", new Date(1992, 3, 4));
		
		MemberManager memberManager = new MemberManager(new EdevletServiceAdapter());
		CampaginManager campaginManager = new CampaginManager();
		SaleManager saleManager = new SaleManager();
		
		memberManager.add(member);
		
		campaginManager.update(campagin);
		
		saleManager.saleWithCampagin(campagin, member);
	}

}
