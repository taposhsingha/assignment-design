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
public class CollectOrganizerInfo implements CollectOrganizerInterface{

    Scanner scan = new Scanner(System.in);

    public void selectNewOrganizer(int x) {
        for(int i=1;i<=x;i++){
            System.out.println("Insert name of organizer "+i+": ");
            String name = scan.nextLine();
            System.out.println("Insert title of organizer "+i+": ");
            String title = scan.nextLine();
            System.out.println("Insert contact of organizer "+i+": ");
            String contact = scan.nextLine();
            OrganizerInfo s1 = new OrganizerInfo(name, contact, title);
            PrintCollectedOrganizerInfo s = new PrintCollectedOrganizerInfo();
            s.printCollectedOrganizerInfo(s1, x);
            
        }
        CreateNewTeams a= new CreateNewTeams();
            a.createNewTeams();
    }
}
