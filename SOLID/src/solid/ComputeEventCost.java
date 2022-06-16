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
public class ComputeEventCost implements ComputeEventCostInterface{

    Scanner scan = new Scanner(System.in);
    int total_expense = 0;
    int total_fee=0;

    public void collectCostInfo() {
        System.out.println("Sports decoration cost: ");
        int decoration = scan.nextInt();
        scan.nextLine();
        System.out.println("Sports accessories cost: ");
        int accessories = scan.nextInt();
        scan.nextLine();
        System.out.println("Sports rewards cost: ");
        int rewards = scan.nextInt();
        scan.nextLine();
        System.out.println("Sports management cost: ");
        int managecost = scan.nextInt();
        scan.nextLine();
        total_expense = decoration + accessories + rewards + managecost;
        System.out.println("Total event expense: " + total_expense);
        total_fee= CreateNewTeams.getTotalFee();
        
    }

    public int getTotalExpense() {
        return total_expense;
    }
    public int getTotalFee(){
        return total_fee;
    }
    

}
