/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

/**
 *
 * Sandbox
 */
public class WageMain {
    public static void main(String[] args) {
		
		// Each object part of the MVC is instantiated here
		WageModel model = new WageModel();
		WageView view = new WageView(model);
		WageController controller = new WageController(model,view);
		
		view.setVisible(true);

	}
    
}
