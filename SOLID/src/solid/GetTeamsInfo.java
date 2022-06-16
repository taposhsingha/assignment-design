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
public class GetTeamsInfo extends HandleMemberInfo{

    Scanner scan = new Scanner(System.in);
    int total_fee = 0;
    public void collectMemberInfo(int numofteams, int playersperteam) {
        
        for (int i = 1; i <= numofteams; i++) {
            System.out.println("Enter Team " + i + " name:");
            InsertName sports_teams_name = new InsertName();
            String teamname = scan.nextLine();
            sports_teams_name.insertName(teamname);
            sports_teams_name.getName();
            for (int j = 1; j <= playersperteam; j++) {
                System.out.println("Insert name of player "+ j +" of team "+i+": ");
                name = scan.nextLine();
                System.out.println("Insert contact of player "+ j +" of team "+i+": ");
                contact = scan.nextLine();
                System.out.println("Insert fee of player "+ j +" of team "+i+": ");
                int fee = scan.nextInt();
                scan.nextLine();
                TeamPlayerInfo s1 = new TeamPlayerInfo(name, contact, fee);
                PrintCollectedTeamsInfo s = new PrintCollectedTeamsInfo();
                s.printCollectedOrganizerInfo(s1, playersperteam);
                total_fee = total_fee + s1.getFee();
            }
        }
        
        
        System.out.println("Total Collected Fee: " + total_fee);
        
    }
    public int getTotalFee(){
    return total_fee;
    }

}
