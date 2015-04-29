/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

/**
 *
 * @author admin
 */
public class Mensch {
    
    String Vorname;
    String Nachname;
    short Alter;
    
    public Mensch(String v, String n, short a){
        this.Vorname = v;
        this.Nachname = n;
        this.Alter = a;
        
    }
    
    public void Status(){
        System.out.println("Es handelt sich um den Menschen "+Vorname+" "+Nachname+", "+Alter+" Jahre alt.");
    }
    
}
