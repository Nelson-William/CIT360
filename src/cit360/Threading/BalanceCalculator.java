/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.Threading;

/**Threading is a feature in Java that allows for multiple lines to be executed
 * at the same time.  Each part of a program is referred to as a thread.
 *
 * @author willnelson
 */
public class BalanceCalculator {
        
    private String account;    
    private double balance;
	
	
	public BalanceCalculator(String account, double startingBalance) {
		this.account = account;
		this.balance = startingBalance;
	}
	
	// synchronized in Java prevents multiple threads from running at the same time
	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println("Your new balance is: " + this.balance);
	}
	
	public synchronized void withdraw(double amount) {
		balance -= amount;
		System.out.println("Your remaining balance is: " + this.balance);
	}
        
        public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	public void printAccount() {
		System.out.println("Account number = " + account);
	}

	@Override
	public String toString() {
		return "Account Number: " + this.account + "\tAccount Balance: " + this.balance;
	}
    
}
