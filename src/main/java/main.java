
import java.util.Random;

import com.sun.security.ntlm.Client;

import fr.sgcib.kata.entities.Customer;
import fr.sgcib.kata.exeptions.AccountException;
import fr.sgcib.kata.service.AccountServiceImpl;

public class main {

	public static void main(String[] args) {
		
		
		// Access to accountService
				AccountServiceImpl A = new AccountServiceImpl();
				
			
				// verification account
				if ((A.verifyAccount("pierre-jean"))){
					Random rand = new Random();
					Customer client = new Customer( rand.nextInt( Integer.MAX_VALUE ), "pierre-jean", 100);
				
					try {
						System.out.println("le solde restant  "+A.withdrawAmount(client, 10));
					} catch (AccountException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					System.out.println("compte bancaire introuvable");
				}
			

	}

}
