package day4Homework3GameDemo;

import day4Homework3GameDemo.Concrate.CampaignManager;
import day4Homework3GameDemo.Concrate.GameManager;
import day4Homework3GameDemo.Concrate.SaleManager;
import day4Homework3GameDemo.Entities.Campaign;
import day4Homework3GameDemo.Entities.Customer;
import day4Homework3GameDemo.Entities.Game;
import day4Homework3GameDemo.Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		Customer customer= new Customer(1, "xDeSon", 1234);
		
		
		Game game =new Game(2, "CsGO", "FPS",77 );
		
		Campaign campaign = new Campaign(3,"Summer Sale", "10.06.2021", 30);
		

		Sale sale = new Sale();
		sale.setGameName("CsGo");
		sale.setId(4);
		sale.setPrice(60);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(customer, sale);
		System.out.println(saleManager);
		
		
		
		CampaignManager campaignManager = new CampaignManager();

		campaignManager.newDiscount(campaign, game);
		campaignManager.newUpdate(campaign, game);
		System.out.println();
		
		
		System.out.println(campaignManager);
		
	
		GameManager gameManager= new GameManager();
		gameManager.newPrice(game);
		System.out.println(gameManager);
		
		
		
		
		
		
		
		
		
	}

}
