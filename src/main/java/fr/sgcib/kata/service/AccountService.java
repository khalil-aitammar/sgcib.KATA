package fr.sgcib.kata.service;

import fr.sgcib.kata.entities.Customer;
import fr.sgcib.kata.exeptions.AccountException;

public interface AccountService {

	
	public double withdrawAmount(Customer client,double amount) throws AccountException;
	
	public boolean verifyAccount(String name);
}
