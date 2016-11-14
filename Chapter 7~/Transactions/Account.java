//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw,
// and check the balance.
//*******************************************************
import java.util.*;

public class Account
{
    private double balance;
    private String name;
    private long acctNum;

    private double amtDeposits = 0;
    private double amtWithdrawals = 0;
    private int numDeposits = 0;
    private int numWithdrawals = 0;


  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public boolean withdraw(double amount)
  {
    if (balance >= amount)
	{
		balance -= amount;
    	numWithdrawals++;
    	amtWithdrawals+=amount;
    	return true;
	}
    else
       System.out.println("Insufficient funds");
       return false;

  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
    numDeposits++;
    amtDeposits+=amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }


  //----------------------------------------------
  // Prints account number, name, and balance
  //----------------------------------------------
  public void printSummary()
  {
      System.out.println("Account number: " + acctNum);
      System.out.println("Account owner: " + name);
      System.out.println("Account balance: " + balance);
  }

  //----------------------------------------------
  // Returns the total amount of deposits into this account.
  //----------------------------------------------
  public double getAmtDeposits()
  {
     return amtDeposits;
  }

  //----------------------------------------------
  // Returns the total amount of withdrawals from this account.
  //----------------------------------------------
  public double getAmtWithdrawals()
  {
     return amtWithdrawals;
  }

  public int getNumDeposits()
  {
     return numDeposits;
  }

  //----------------------------------------------
  // Returns the total amount of withdrawals from this account.
  //----------------------------------------------
  public int getNumWithdrawals()
  {
     return numWithdrawals;
  }

  //----------------------------------------------
  // Resets static counters for deposits and withdrawals to 0
  //----------------------------------------------
  public void resetCounters()
  {
     amtDeposits = 0;
     amtWithdrawals = 0;
     numDeposits = 0;
     numWithdrawals = 0;
  }

  public void transfer(Account acct, double amnt){
		if(withdraw(amnt))
			acct.deposit(amnt);
  }

}
