/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Taposh
 */
public class EventFeasibility {
    public void eventFeasibility(){
        int moneygap=0;
        ComputeEventCost a = new ComputeEventCost();
        a.collectCostInfo();
        
        if(a.getTotalExpense()>a.getTotalFee()){
            moneygap = a.getTotalExpense()-a.getTotalFee();
            System.out.println("This sports event is not feasible financially! You need "+moneygap+" to organize this event!");
        } else{
            moneygap = a.getTotalFee()-a.getTotalExpense();
            System.out.println("This sports event is feasible financially! You have "+moneygap+" remaining!");
        }
    }
    
}
