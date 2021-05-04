package day4Homework3GameDemo.Entities;

public class Campaign {

	private int id;
	private String campaignName;
	private String campaignDeadline;
	private int discount;
	
	
	public Campaign() {
		
	}

	
	public Campaign(int id, String campaignName, String campaignDeadline, int discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDeadline = campaignDeadline;
		this.discount = discount;
		
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDeadline() {
		return campaignDeadline;
	}
	public int getDiscount() {
		return discount;
	}
	
	
	
	
	
	
}
