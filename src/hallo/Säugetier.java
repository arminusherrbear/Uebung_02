/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallo;

/**
 *
 * @author admin
 */
public abstract class Säugetier {
    
    String Name;
    short Alter;
    String Geschlecht;
    
    public abstract String printAll();
    
    public Säugetier(String n, short a, String g){
    Alter=a;
    Geschlecht=g;
    Name=n;
    }

        
        
    
    
        
    
    
    

  
    
}
