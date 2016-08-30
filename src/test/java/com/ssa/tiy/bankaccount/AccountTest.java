package com.ssa.tiy.bankaccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account account = new Account();
	Savings savings = new Savings();
	
	
	@Before
	public void setup(){
	    
	  //setting values for the test
		account.setId(1);
		account.setDescription("Savings1");  
		account.deposit(200);
		savings.deposit(5000);		
	}
	

    @Test
    public void testGetters() {
	
	assertEquals(1, account.getId());
	assertEquals("Savings1", account.getDescription());
    }
    
    @Test
    public void testDeposit() {
	

	//Test for deposit method 
	
	assertEquals("deposit",300, account.deposit(100),0);
	assertEquals("deposit",0, account.deposit(-100),0);
	
	
    }
    
    
    @Test
    public void testWithdrwal() {

	//Test for withdraw method	
	
	assertEquals("withdraw",100, account.withdraw(100),0);
	assertEquals("withdraw",0, account.withdraw(100),0);	
	
    }
    
    @Test
    public void testPrint() {
	
	//Test for print method
	assertEquals("","Account " + 1 + " balance is $" + 200.0, account.print());
    }
    
    @Test
    public void testTransfer() {
	
	assertEquals(100, new Account().transferFrom(account, 100),0);	
	
    }
    
    
    @Test
    public void testSavings()
    {
	//Test for calcDepositInterest in Savings class 
	assertEquals("",12.50, savings.calcDepositInterest(2),0);
	
	//test the interest on the new balance --> previous balance + 12.50
	assertEquals("",12.53125, savings.calcDepositInterest(2),0);	
	
	// not interest with 0 month
	assertEquals(0, savings.calcDepositInterest(0),0);
	
	
    }
    

}
