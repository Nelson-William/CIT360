/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;


/**
 *
 * Sandbox
 */
public class WageView extends JFrame {
    // Sets up JFrame text fields of specific sizes
	private JTextField wage = new JTextField(6);
	private JTextField hours = new JTextField(4);
	private JTextField salary = new JTextField(10);
	private JButton convert = new JButton("Convert");
	
	private WageModel viewModel;
	
	
	// Constructor
	WageView(WageModel model){
		
		// Initializing variables.
		wage.setText("24.45");
		hours.setText("40");
		salary.setEditable(false);
		
		// Layout out the components
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Please enter your hourly wage and the number of hours worked per week."));
		panel.add(new JLabel("Wage:"));
		panel.add(wage);
		panel.add(new JLabel("Hours:"));
		panel.add(hours);
		panel.add(convert);
		panel.add(new JLabel("Salary:"));
		panel.add(salary);
		
		// Finalizing the layout
		this.setContentPane(panel);
		this.pack();
		
		this.setTitle("Wage to Salary Converter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
    String getWage() {
        return wage.getText();
    }
    
    String getHours() {
        return hours.getText();
    }    
    
    void setSalary(String finalSalary) {
        salary.setText(finalSalary);
    }
	
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    // This method is used to set a listener on the JButton
    void addConvertListener(ActionListener conv) {
        convert.addActionListener(conv);
    }
    
}
