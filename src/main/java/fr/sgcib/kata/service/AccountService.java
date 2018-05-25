package fr.sgcib.kata.service;

import fr.sgcib.kata.entities.Customer;

public interface AccountService {

	
	public double withdrawAmount(Customer client,double amount);
	
	public boolean verifyAccount(String name);
}
