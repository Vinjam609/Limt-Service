package com.microservices.limitservice.limits;

public class LimitConfiguration {
	private int minimum;
	private int maximum;
	
	public LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getManinum() {
		return minimum;
	}
	public void setManinum(int maninum) {
		this.minimum = maninum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}
