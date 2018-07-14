/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.Threading;

/**
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
	
	// synchronized makes these methods thread safe.
	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println("Balance after deposit: " + this.balance);
	}
	
	public synchronized void withdraw(double amount) {
		balance -= amount;
		System.out.println("Balance after withdrawal: " + this.balance);
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
