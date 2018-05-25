package fr.sgcib.kata.entities;

public class Customer {
	private int ID;
	private String name;
	private double accountAmount;
	
	
	public Customer(int i, String j, double d) {
		this.ID = i;
		this.name = j;
		this.accountAmount= d;
	}

	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccountAmount() {
		return accountAmount;
	}
	public void setAccount(double account) {
		this.accountAmount = account;
	}
	
	

	

}
