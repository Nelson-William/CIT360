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
public class AgeController {
    private AgeView view;
    private AgeModel model;
    
    public AgeController(AgeView view, AgeModel model){
        this.view = view;
        this.model = model;
    }
    
    public void Calculator() {
        try{
            int firstNumber = view.getFirstNumber();
            int secondNumber = view.getSecondNumber();
        
            model.getCalculationValue();
    } catch(NumberFormatException ex){
        System.out.println(ex);
        view.displayErrorMessage("You Need to Enter Two Years.");
        }
    }
}
    
    
   