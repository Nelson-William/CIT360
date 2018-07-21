/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

import java.awt.event.*;

/**
 *
 * Sandbox
 */
public class WageController {
    private WageModel controlModel;
	private WageView ControlView;
	
	// Constructor
	WageController(WageModel model,WageView view){
		controlModel = model;
		ControlView = view;
		
		// Adding a listener to the JButton in the view
        view.addConvertListener(new ConvertListener());
		
	}
	
	// This gets the input from the JTextFields
	// It then parses the String into doubles
	// The values are sent to the Model and the salary is retrieved, 
	// which is converted back into a String
	class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String wageInput = "";
            String hoursInput = "";
            try {
            	wageInput = ControlView.getWage();
            	hoursInput = ControlView.getHours();
            	
            	double wageReceived = Double.parseDouble(wageInput);
            	double hoursWorked = Double.parseDouble(hoursInput);
            	
            	controlModel.convertWageToSalary(wageReceived,hoursWorked);
            	String stringSalary = Double.toString(controlModel.getSalary());
                ControlView.setSalary(stringSalary);
                
            } catch (NumberFormatException nfex) {
            	ControlView.showError("Please enter numbers only");
            }
        }
	}
    
}
