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
public class Fahrzeug {

    short Reifen;
    Color Farbe;
    short PS;
    short Tueren;
    boolean Gestartet;
    short Geschwindigkeit;
    public static int Anzahl;
    
    void starten(){
        Gestartet = true;
        
    }
    
    void stoppen(){
        Gestartet = false;
    }
    
    void beschleunigen(short geschwindigkeit){
        
        if(Gestartet == true ){
        Geschwindigkeit += geschwindigkeit;
        if (Geschwindigkeit > 250){
        Geschwindigkeit = 250;
        }
        }
        
    }
    
    void bremsen(short geschwindigkeit){
        if(Gestartet == true){
        Geschwindigkeit -= geschwindigkeit;
        if(Geschwindigkeit < 0){
            Geschwindigkeit = 0;
        }
        }
    }

    public short getReifen() {
        return Reifen;
    }

    public void setReifen(short Reifen) {
        this.Reifen = Reifen;
    }

    

   

    public short getPS() {
        return PS;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public short getTueren() {
        return Tueren;
    }

    public void setTueren(short Tueren) {
        this.Tueren = Tueren;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet) {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public static void setAnzahl(int Anzahl) {
        Fahrzeug.Anzahl = Anzahl;
    }

    public Color getFarbe() {
        return Farbe;
    }

    public void setFarbe(Color Farbe) {
        this.Farbe = Farbe;
    }

    public Fahrzeug(short Reifen, Color Farbe, short PS, short Tueren) {
        this.Reifen = Reifen;
        this.Farbe = Farbe;
        this.PS = PS;
        this.Tueren = Tueren;
        this.Gestartet = false;
        this.Geschwindigkeit = 0;
        Anzahl++;
    }
    
    
    
}
