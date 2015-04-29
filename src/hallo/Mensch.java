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
public class Mensch extends Säugetier {

    public Mensch(String n, short a, String g) {
        super(n, a, g);
    
    }
    
        
    
  
    
    @Override
    public String printAll() {
        return Name+"#"+Alter+"#"+Geschlecht; 
    }

 


   

    
    
}
