
import java.util.Random;

import com.sun.security.ntlm.Client;

import fr.sgcib.kata.entities.Customer;
import fr.sgcib.kata.service.AccountServiceImpl;

public class main {

	public static void main(String[] args) {
		
		
		// Access to account of Customer
				Customer customer = new Customer(00012143, "Pascal", 3200.40);
				
				AccountServiceImpl A = new AccountServiceImpl();
				A.verifyAccount("khalil");
				System.out.println(A.verifyAccount("pierre-jean"));
				
				
				if ((A.verifyAccount("pierre-jean"))){
					Random rand = new Random();
					Customer client = new Customer( rand.nextInt( Integer.MAX_VALUE ), "pierre-jean", 100);
					
				}
				// ouvrire un compte 
				  //verification du compte 
				    // affichage du nome et du manton 
					// affichage d'une erreur 
				
			   // effectuer operation retiré solde 
				    // teste sold 
					// affichage du reste 

	}

}
