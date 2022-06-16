/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Taposh
 */
public class TeamPlayerInfo implements TeamPlayerInfoInterface{

    String Name;
    String Contact;
    int Fee;
    Scanner scan = new Scanner(System.in);

    TeamPlayerInfo(String name, String contact, int fee) {
        this.Name = name;
        this.Fee = fee;
        this.Contact = contact;
    }
    
    public String getName() {
        return Name;
    }

    public String getContact() {
        return Contact;
    }

    public int getFee() {
        return Fee;
    }
    
    
    
}
