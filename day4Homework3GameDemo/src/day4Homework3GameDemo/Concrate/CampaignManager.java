package day4Homework3GameDemo.Concrate;

import day4Homework3GameDemo.Abstracts.CampaignService;
import day4Homework3GameDemo.Entities.Campaign;
import day4Homework3GameDemo.Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void newDiscount(Campaign campaign, Game game) {
		System.out.println(campaign.getCampaignName()+" adl� indirim "+game.getGameName()+" Adl� oyuna uygulandi ");
		
	}

	@Override
	public void newUpdate(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+"Adli oyunun kampanya bilgileri g�ncellendi");
		
		
	}

	

	
}
