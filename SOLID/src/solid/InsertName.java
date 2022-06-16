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
public class InsertName implements InsertNameInterface{

    String Name;

    public void insertName(String name) {
        this.Name = name;
    }

    public void getName() {
        System.out.println(Name);
    }

}
