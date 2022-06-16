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
public class CreateSportsEvent implements CreateSportsEventInterface{
    Scanner scan = new Scanner(System.in);
    @Override
    public void createNewEvent(){
        System.out.println("Enter sports event name:");
        InsertName sports_event_name = new InsertName();
        String eventname = scan.nextLine();
        sports_event_name.insertName(eventname);
        sports_event_name.getName();
        GetNewOrganizers organizers = new GetNewOrganizers();
        organizers.getNewOrganizers();
    }
    
}
