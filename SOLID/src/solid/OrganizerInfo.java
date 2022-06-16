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
public class OrganizerInfo implements OrganizerInfoInterface{

    String Name;
    String Contact;
    String Title;

    OrganizerInfo(String name, String contact, String title) {
        this.Name = name;
        this.Title = title;
        this.Contact = contact;
    }

    public String getName() {
        return Name;
    }

    public String getContact() {
        return Contact;
    }

    public String getTitle() {
        return Title;
    }
}
