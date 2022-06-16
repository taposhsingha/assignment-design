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
public class PrintCollectedOrganizerInfo implements PrintCollectedOrganizerInfoInterface{

    public void printCollectedOrganizerInfo(OrganizerInfo s, int x) {
        
            System.out.println("Event organizer name "  + ": " + s.Name);
            System.out.println("Event organizer Title "  + ": " + s.Title);
            System.out.println("Event organizer ContactNo. "  + ": " + s.Contact);

    }

}
