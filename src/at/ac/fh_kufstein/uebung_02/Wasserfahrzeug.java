/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_02;

/**
 *
 * @author admin
 */
public class Wasserfahrzeug extends Fahrzeug{
 
    
    double Tiefgang;
    short Schrauben;
    double Ladung;
    
    
       public Wasserfahrzeug(double Tiefgang, short Schrauben, double Ladung, short Reifen, Color Farbe, short PS, short Tueren) {
        super(Reifen, Farbe, PS, Tueren);
        this.Tiefgang = Tiefgang;
        this.Schrauben = Schrauben;
        this.Ladung = Ladung;
    }
    
    
    void entladen() throws InterruptedException{
    
    Ladung = 0;
    
    Thread.sleep(5000);
        //statt navigieren
    
   
    
    }

    public double getTiefgang() {
        return Tiefgang;
    }

    public void setTiefgang(double Tiefgang) {
        this.Tiefgang = Tiefgang;
    }

    public short getSchrauben() {
        return Schrauben;
    }

    public void setSchrauben(short Schrauben) {
        this.Schrauben = Schrauben;
    }

    public double getLadung() {
        return Ladung;
    }

    public void setLadung(double Ladung) {
        this.Ladung = Ladung;
    }
    
     @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat "+ getPS()+ "PS und einen Tiefgang von " + getTiefgang()+" m"; //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}
