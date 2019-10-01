package pkg2120180201.sk02.pboti20192020.pkg3.pkg4.pkg02;

public class SK02PBOTI201920203402 {

  
    public static void main(String[] args) {
       sepeda sepeda_ku= new sepeda();
       sepeda_ku.pedal=2;
       sepeda_ku.roda=4;
      
       System.out.println(sepeda_ku.nama);
       System.out.println(sepeda_ku.pedal);
       System.out.println(sepeda_ku.rem);
       System.out.println(sepeda_ku.roda);
       
       sepeda_ku.berjalan();
       sepeda_ku.berhenti();
       sepeda_ku.belok();
      
    }
    
}
