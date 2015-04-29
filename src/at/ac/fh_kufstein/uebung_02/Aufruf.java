/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02;

import static at.ac.fh_kufstein.uebung_02.Color.*;

/**
 *
 * @author admin
 */
public class Aufruf {
    
    public static void main(String[]args){
        
        Auto bmw = new Auto((short) 4, (short)4,silver, (short)220, (short)5);
    
    
        Auto audi = new Auto((short)8, (short)4, black, (short)180, (short)5);
   
    
    Wasserfahrzeug titanic = new Wasserfahrzeug(10.54, (short)3, 100000, (short)0, blue, (short)51000, (short)0);
    
   
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);
    
    }
}
