/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

import java.util.Scanner;

/**
 *
 * @author willnelson
 */


public class AgeView {
    
    private int firstNumber;
    private int secondNumber;
    
    
	
        public static void main(String[] args){
            //get input
            Scanner sc = new Scanner(System.in);
            System.out.println("What year were you born?");
            int firstNumber = sc.nextInt();
            System.out.println("What is the current year?");
            int secondNumber = sc.nextInt();
            
                  
        }
        public int getFirstNumber(){
            return firstNumber;
        }
        public int getSecondNumber(){
            return secondNumber;
        }
        void displayErrorMessage(String errorMessage){
            System.out.println("there was an error.");
        }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("This doesn't do anything yet.");
    }

}