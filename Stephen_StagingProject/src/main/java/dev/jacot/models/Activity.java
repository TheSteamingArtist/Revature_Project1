package dev.jacot.models;

public class Activity 
{
	private int id;
	
	private String typeOfActivity;
	
	private int improvid;
	
	public Activity() {
		
	}
	
	public Activity(int id, String typeOfActivity, int improvid)
	{
		super();
		
		this.id = id;
		
		this.typeOfActivity = typeOfActivity;
		
		this.improvid = improvid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfActivity() {
		return typeOfActivity;
	}

	public void setTypeOfActivity(String typeOfActivity) {
		this.typeOfActivity = typeOfActivity;
	}

	public int getImprovid() {
		return improvid;
	}

	public void setImprovid(int improvid) {
		this.improvid = improvid;
	}

	@Override
	public String toString() 
	{
		return "Activity [id=" + id + ", typeOfActivity=" + typeOfActivity + ", improvid=" + improvid + "]";
	}
	
	
	
	

}
