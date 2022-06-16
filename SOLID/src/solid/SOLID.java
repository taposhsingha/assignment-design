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
public class SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreateSportsEvent sports_event = new CreateSportsEvent();
        sports_event.createNewEvent();
        EventFeasibility event_decision = new EventFeasibility();
        event_decision.eventFeasibility();
    }
    
}
