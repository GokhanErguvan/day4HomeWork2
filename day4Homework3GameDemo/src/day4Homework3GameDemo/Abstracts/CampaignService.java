package day4Homework3GameDemo.Abstracts;

import day4Homework3GameDemo.Entities.Campaign;
import day4Homework3GameDemo.Entities.Game;

public interface CampaignService {
	
	void newDiscount(Campaign campaign, Game game);
	
	void newUpdate(Campaign campaign,Game game);

}
