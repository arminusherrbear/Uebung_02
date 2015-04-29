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
public class Student extends Mensch {
    
    int Matrikelnummer;
    String Studiengang;
    
    public Student(String v, String n, short a,int m, String s){
        super(v,n,a);
        this.Matrikelnummer = m;
        this.Studiengang = s;
        
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um den Studenten "+Vorname+" "+Nachname+", "+Alter+" Jahre alt. "+Matrikelnummer+", "+Studiengang); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
            
}
