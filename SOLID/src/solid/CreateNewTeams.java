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
public class CreateNewTeams implements CreateNewTeamsInterface{
    Scanner scan = new Scanner(System.in);
    static int total_fee;
    
    public void createNewTeams(){
        System.out.println("Total number of teams:");
        int numofteams = scan.nextInt();
        scan.nextLine();
        System.out.println("How many players for each team");
        int playersperteam = scan.nextInt();
        scan.nextLine();
        GetTeamsInfo newteam = new GetTeamsInfo();
        newteam.collectMemberInfo(numofteams, playersperteam);
        total_fee = newteam.getTotalFee();
        
    }
    public static int getTotalFee(){
        return total_fee;
    }
    
}
