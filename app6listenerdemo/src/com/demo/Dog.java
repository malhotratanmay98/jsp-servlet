package com.demo;
//in real life you can take jdbc connection object , because whole application need that.
public class Dog {

	private String dogName;
	
	

	public Dog(String dogName) {
		
		this.dogName = dogName;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + "]";
	}
	
	
}
