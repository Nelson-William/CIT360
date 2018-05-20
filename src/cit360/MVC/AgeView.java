/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author willnelson
 */


public class AgeView {
	
        public static void main(String[] args){
            //get input
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter date of birth (DD-MM-YYYY)");
            String dob=sc.next();
            
            //need getters and setters to access dob string outside of this class.
            
            System.out.println("You are currently "+currentAge" years old.");
        }

}