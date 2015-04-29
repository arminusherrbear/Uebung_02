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
public class Aufruf2 {
    
    
    public static void main(String[]args){
        
        Mensch m = new Mensch("Armin","Hotter",(short)21);
        m.Status();
        m = new Student("Nimra","Rettoh",(short)12,14106533,"Web Dings und Dongs");
        m.Status();
    }
}
