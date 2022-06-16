/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.Scanner;

/**
 *
 * @author Taposh
 */
public class GetNewOrganizers {
    Scanner scan = new Scanner(System.in);
    public void getNewOrganizers(){
        System.out.println("How many organizers for the event:");
        int x = scan.nextInt();
        scan.nextLine();
        CollectOrganizerInfo sports_team = new CollectOrganizerInfo();
        sports_team.selectNewOrganizer(x);
    }
    
}
