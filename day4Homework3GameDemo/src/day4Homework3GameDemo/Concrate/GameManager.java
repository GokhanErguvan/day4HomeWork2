package day4Homework3GameDemo.Concrate;

import day4Homework3GameDemo.Abstracts.GameService;
import day4Homework3GameDemo.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void newPrice(Game game) {
		System.out.println(game.getGameName()+"Adli oyunun fiyatý güncellenmistir");
		
	}

	@Override
	public void newName(Game game) {
		System.out.println(game.getId()+"Numarali oyunun ismi güncellenmistir");
		
	}

	
	
}
