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

    private static int numAccounts;


  //----------------------------------------------
  //Constructor -- initializes balance and owner; generates random
  //account number
  //----------------------------------------------
  public Account(double initBal, String owner)
  {
    balance = initBal;
    name = owner;
    acctNum = (int) (Math.random() * Integer.MAX_VALUE);
    numAccounts++;
  }
  public Account(double initBal, String owner)
  {
    balance = initBal;
    name = owner;
    acctNum = rndm.nextInt(256);
  }
  public Account(String owner)
  {
    balance = 0;
    name = owner;
    acctNum = rndm.nextInt(256);
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");

  }
  public void withdraw(double amount, double fee)
  {
    if (balance >= amount)
       balance -= amount+fee;
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  // Also deducts fee from account.
  //----------------------------------------------
  public void withdraw(double amount, double fee)
  {
    if (balance >= amount)
	{
	    balance -= amount;
	    balance -= fee;
	}
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
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
  // Return the number of accounts that currently exist
  //----------------------------------------------
    public static int getNumAccounts()
    {
	return numAccounts;
    }


  //----------------------------------------------
  // Returns a string containing the name, acct number, and balance.
  //----------------------------------------------

    public String toString()
    {
	return "Name: " + name +
	    "\nAcct #: " + acctNum +
	    "\nBalance: " + balance;
    }

  //----------------------------------------------
  // Close this account.
  //----------------------------------------------
    public void close()
    {
	name += " CLOSED";
	balance = 0;
	numAccounts--;
    }


  //----------------------------------------------
  // Create a new account whose balance is the sum of
  // the two given accounts, and close the given
  // accounts.
  //----------------------------------------------
    public static Account consolidate(Account acct1, Account acct2)
    {
	if (!acct1.name.equals(acct2.name))
	    {
		System.out.println("Sorry, accounts with different names cannot be consolidated.");
		return null;
	    }
	else if (acct1.acctNum == acct2.acctNum)
	    {
		System.out.println("Sorry, cannot consolidate an account with itself.");
		return null;
	    }
	else //go ahead and consolidate
	    {
		Account newAcct = new Account(acct1.balance+acct2.balance, acct1.name);
		acct1.close();
		acct2.close();
		return newAcct;
	    }
    }
}
