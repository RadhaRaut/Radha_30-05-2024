package com.InnerClasses;

public abstract class Department {

	private int deparatmentId;
	private String deparatmentName;
	
	public Department() {
	
	}

	public Department(int deparatmentId, String deparatmentName) {
		super();
		this.deparatmentId = deparatmentId;
		this.deparatmentName = deparatmentName;
	}

	public int getDeparatmentId() {
		return deparatmentId;
	}

	public void setDeparatmentId(int deparatmentId) {
		this.deparatmentId = deparatmentId;
	}

	public String getDeparatmentName() {
		return deparatmentName;
	}

	public void setDeparatmentName(String deparatmentName) {
		this.deparatmentName = deparatmentName;}
	
		
	public abstract void getDepartmentDetails();
	
	
}
