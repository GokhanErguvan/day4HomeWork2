package day4Homework3GameDemo.Entities;

public class Customer {

	private int id;
	private String nickName;
	private int password;
	
	
	public Customer() {
		
	}
	

	
	public Customer(int id, String nickName, int password) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.password = password;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
