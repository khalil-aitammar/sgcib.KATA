package fr.sgcib.kata.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.omg.CORBA.SystemException;

import fr.sgcib.kata.entities.Customer;

public class AccountServiceImpl implements AccountService{

	public double withdrawAmount(double amount) {
	
		return amount;
	}

	public boolean verifyAccount(String name) {
		try{
			InputStream flux=new FileInputStream("data.txt"); 
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				System.out.println(ligne);
				
				if (ligne.equals(name)){
					Random rand = new Random();
					Customer client = new Customer( rand.nextInt( Integer.MAX_VALUE ), ligne, 100);
				}
				
				return (ligne.equals(name)) ? true : false;
				
			}
			buff.close(); 
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}
		return false;
	}
	
	public double withdrawAmount1(Customer client,double amount) {
		try{
		return client.getAccountAmount()-10;
		}
		catch (Exception e){
			System.out.println(e.toString());
			}
		return amount;
	}

	public double withdrawAmount(Customer client, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	

}
