package fr.sgcib.kata.exeptions;

public class AccountException extends Exception{ 
	  public AccountException(){
		    System.out.println("Vous essayez de d�duire  un nombre n�gatif !");
		  }  
		}