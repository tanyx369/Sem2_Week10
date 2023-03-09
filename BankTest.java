import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void showDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		assertEquals(100, acc.getBalance() , 10);
	}
	
	@Test
	public void Test() {
		int i = 3;
		int j = 3;
		assertTrue(i == j);
	}

}
