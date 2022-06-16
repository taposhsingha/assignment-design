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
public class PrintCollectedTeamsInfo implements PrintCollectedTeamsInfoInterface{
    public void printCollectedOrganizerInfo(TeamPlayerInfo s, int x) {

            System.out.println("Team member name " + ": " + s.Name);
            System.out.println("Team member Contact " + ": " + s.Contact);
            System.out.println("Team member Fee " + ": " + s.Fee);

    }
    
}
