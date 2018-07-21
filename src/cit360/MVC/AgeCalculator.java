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
    
    public static void main(String[] args){
   	
	AgeView view = new AgeView();
        AgeModel model = new AgeModel();
        AgeController controller = new AgeController(view,model);
	
	view.setVisible(true);
	}

}
