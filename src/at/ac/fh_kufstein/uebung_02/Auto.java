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
public class Auto extends Fahrzeug implements Comparable {
    
    
  boolean Klimaanlage;
  short Airbags;
  
  
  
  void klimaanlageAn(){
      if(Klimaanlage == false){
          Klimaanlage = true;
      }
      else System.out.println("Klimmaanlage läuft bereits");
  }
  
   void klimaanlageAus(){
      if(Klimaanlage == true){
          Klimaanlage = false;
      }
      else System.out.println("Klimmaanlage ist bereits ausgeschaltet");
  }

    public boolean isKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags() {
        return Airbags;
    }

    public void setAirbags(short Airbags) {
        this.Airbags = Airbags;
    }

    public Auto(short Airbags, short Reifen, Color Farbe, short PS, short Tueren) {
        super(Reifen, Farbe, PS, Tueren);
        this.Klimaanlage = false;
        this.Airbags = Airbags;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+ getPS()+ " PS und fährt mit" + getGeschwindigkeit()+" km/h"; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int compareTo(Object o) {
       if(this.PS == ((Auto) o).getPS())
       return 0;
       else if((this.PS > ((Auto) o).getPS())) 
       return 1;
       else return -1;
       
    }
    
    



 

    
  
          
}
