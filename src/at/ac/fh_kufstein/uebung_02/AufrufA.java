/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02;

import static at.ac.fh_kufstein.uebung_02.Color.black;
import static at.ac.fh_kufstein.uebung_02.Color.blue;
import static at.ac.fh_kufstein.uebung_02.Color.silver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin
 */
public class AufrufA {
    public static void main(String[]args){
        
        Auto bmw = new Auto((short) 4, (short)4,silver, (short)220, (short)5);
        Auto audi = new Auto((short)8, (short)4, black, (short)180, (short)5);
        Auto audi1 = new Auto((short)8, (short)4, blue, (short)300, (short)5);
        Auto audi2 = new Auto((short)8, (short)4, silver, (short)260, (short)5);
        Auto audi3 = new Auto((short)8, (short)4, blue, (short)200, (short)5);
        Auto audi4 = new Auto((short)8, (short)4, blue, (short)190, (short)5);
        
        List<Auto> liste = new ArrayList();
        liste.add(bmw);
        liste.add(audi);
        liste.add(audi1);
        liste.add(audi2);
        liste.add(audi3);
        
        Collections.sort(liste);
        
        for(Auto a : liste){
            System.out.println(a);
        }
        
    }
}
