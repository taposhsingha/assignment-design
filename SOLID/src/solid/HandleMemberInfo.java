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
public abstract class HandleMemberInfo {
    String name;
    String contact;
    abstract void collectMemberInfo(int numofteams, int playersperteam);
}
