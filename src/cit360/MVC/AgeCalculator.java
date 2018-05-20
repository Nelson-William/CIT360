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
public class AgeCalculator {
   	
	private AgeView theView;
	private AgeModel theModel;
	
	public AgeCalculator(AgeView theView, AgeModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
				
			new AgeView().setVisible(true);
	}

}
