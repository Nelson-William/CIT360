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
public class Main {
    
        public static void main(String[] args) {
            final BalanceCalculator account = new BalanceCalculator("1234-5678-1234-5678", 1000.00);
            System.out.println(account.toString());
            
        
            // These are threads creating runnables
            Thread trThread1 = new Thread(new Runnable() {
            	@Override
            	public void run() {				
            		account.deposit(150);
            		account.withdraw(25);
            	}
            });

            Thread trThread2 = new Thread(new Runnable() {
		@Override
		public void run() {
			account.deposit(225);
			account.withdraw(75.75);
		}
            });		
		
		
	trThread1.start();
	trThread2.start();
    
}
