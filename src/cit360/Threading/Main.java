/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.Threading;

import java.util.concurrent.Executors;

/**
 *
 * @author willnelson
 */
public class Main {
    
        public static void main(String[] args) {
            final BalanceCalculator account = new BalanceCalculator("8675309", 1000.00);
            System.out.println(account.toString());
            
        
            Thread testThreadOne = new Thread(new Runnable() {
            	@Override
            	public void run() {				
            		account.deposit(10);
            		account.withdraw(35);
            	}
            });

            Thread testThreadTwo = new Thread(new Runnable() {
		@Override
		public void run() {
			account.deposit(12);
			account.withdraw(65);
		}
            });		
		
		
	testThreadOne.start();
	testThreadTwo.start();
    
        }
        
       // public static void timeout(){
            
}