package dev.jacot.models;

public class Setting 
{
	
	private int id;
	
	private String place;
	
	private int improvPi;
	
	public Setting()
	{
		
	}
	
	public Setting(int id, String place, int improvPi)
	{
		this.id = id;
		
		this.place = place;
		
		this.improvPi = improvPi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getImprovPi() {
		return improvPi;
	}

	public void setImprovPi(int improvPi) {
		this.improvPi = improvPi;
	}

	@Override
	public String toString() {
		return "Setting [id=" + id + ", place=" + place + ", improvPi=" + improvPi + "]";
	}
	
	
	

}
