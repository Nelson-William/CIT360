/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

/**
 *
 * @author willnelson
 */
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

public class AgeModel {
    /*The purpose of the Model is to house the functions needed to use the data.*/
	
	private int currentAge;
        //Simple Age Calculator
        public void doCalc(int firstNumber, int secondNumber){
            currentAge = secondNumber - firstNumber;
        }
        public int getCalculationValue(){
            return currentAge;
        }
        
	/*  Specific Age Calculator
	    public static void main(String[] args){
            //Convert to Java date format
            SimpleDateFormat sdf1=new SimpleDateFormat("dd-mm-yyyy");
            Date ndob=sdf1.parse(dob);
            
            //Get current date
            Date sysdate = new Date();
            
            //Date calculator
            long ms=System.currentTimeMillis()-ndob.getTime();
            long currentAge=(long)((long)ms/(1000.0*60*24*365));
            }
*/
}