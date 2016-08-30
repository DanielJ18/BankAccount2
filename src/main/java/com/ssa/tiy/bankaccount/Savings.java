package com.ssa.tiy.bankaccount;

public class Savings extends Account{
    
    private double interestRate;
    
    public Savings(){
	super();
	interestRate = 0.015;
    }
    
    public double calcDepositInterest(int months)
    {
	double interest = (getInterestRate()) * months/12* getBalance();
	deposit(interest);	
	return interest;
    }
    
    

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    

}
