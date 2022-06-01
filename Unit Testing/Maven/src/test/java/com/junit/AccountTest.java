package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AccountTest {

    public AccountTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testAcctNo() throws InsufficientFundsException {
        Account instance = new Account();
        int id = 1;
        int number = instance.getAcctNo();
        assertEquals(id, number);       
    }

    @Test
    public void testBalance() throws InsufficientFundsException {
        Account instance = new Account();
        int expResult = 1;
        int result = instance.getBalance();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testWithdraw() throws InsufficientFundsException {
        int amount = 0;
        Account instance = new Account ();
        instance.withdraw(amount);
        int balance = instance.getBalance();
        assertEquals(-amount, balance);
    }
    

    

    

    

    private void assertEquals(int amount, int balance) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testDeposit() throws InsufficientFundsException {
        int amount = 1;
        Account instance = new Account ();
        instance.deposit(amount);
        int balance = instance.getBalance();
        assertEquals(amount, balance);
    }
}