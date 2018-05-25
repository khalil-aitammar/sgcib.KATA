package frsgcib.kata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.sgcib.kata.service.AccountServiceImpl;

public class test {

	@Test
public void testNomValid (){	
	// Access to accountService
			AccountServiceImpl A = new AccountServiceImpl();
			boolean result = A.verifyAccount("pierre-jean");
			assertEquals(result, true);
			
}
	@Test
public void testNominvalid (){	
	// Access to accountService
			AccountServiceImpl A = new AccountServiceImpl();
			boolean result = A.verifyAccount("pierre");
			assertEquals(result, false);
			
}
	
	
	
}
