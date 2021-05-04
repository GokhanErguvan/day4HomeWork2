package day4Homework3GameDemo.Entities;

public class Game {
	
	private int id;
	private String gameName;
	private String type;
	private int price;
	
	
	
	public Game() {
		
	}
	
	
	
	
	public Game(int id, String gameName, String type, int price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.type = type;
		this.price = price;
	}
	
	
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		price = price;
	}
	
	
	

}
