package com.ssa.tiy.bankaccount;

public class Account {

    private int id;
    private String description;
    private double balance;
    static int count = 1;

    // Account account1 = new Account();
    // Account account2 = new Account();

    // constructors for class Account

    public Account() {
	this.balance = 0;
	this.id = count;
	count++;
    }

    
    public Account(String description) {
	this.description = description;
	this.id = count;
	count++;

    }

    public Account(int id, String description) {
	this.id = id;
	this.description = description;
	this.id = count;
	count++;

    }

    
    public String print()
    {
	String thisIsWhatIwantAndIwantItNow = "Account " + getId() + " balance is $" + getBalance();
	
	return thisIsWhatIwantAndIwantItNow;
    }

    // Transfer $$ method

    public double transferFrom(Account accountName, double transferAmount) {

	if (transferAmount <= accountName.getBalance()) {
	    accountName.withdraw(transferAmount);
	   return  this.deposit(transferAmount);
	    
	}
	
	else
//	    System.out.println("Insufficent funds. Enter the proper transfer amount.");
	return 0;

    }

    // method to perform deposit
    public double deposit(double depositAmount) {
	
	if (depositAmount >0)
	{
	// this.setBalance(this.getBalance () + depositAmount);
	//return this.getBalance;

	this.balance += depositAmount;

//	System.out.printf("Accout: %d, deposit: %.2f balance: %.2f\n", getId(), depositAmount, this.balance);
//	System.out.println("--------------------------------------------------");
	
	return this.balance;
	}
	
	else
	    
	{
//	    System.out.println("Deposit not valid");
	    return 0;
	}
    }
    
    
    

    // method to perform withdraw
    public double withdraw(double withdrawAmount) {

	if (this.balance - withdrawAmount < 0 && withdrawAmount >0) {

//	    System.out.println("Insufficent funds." + "\nYour withdrawal of: " + withdrawAmount + " NOT approved. "
//		    + "\nYour balance is: " + this.balance);
//	    System.out.println("--------------------------------------------------");
	    
	    return 0;
	    
	}

	else

	{
	    this.balance = this.balance - withdrawAmount;
//	    System.out.printf("Account: %d Withdrawal: %.2f  balance: %.2f\n", getId(), withdrawAmount, this.balance);
//
//	    System.out.println("--------------------------------------------------");
	    
	    return this.balance;
   

	}

    }

    // setters and getter for accountId, description and balance

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

}
