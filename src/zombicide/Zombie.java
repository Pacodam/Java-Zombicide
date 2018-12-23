
package zombicide;

import java.util.Random;


public class Zombie {
    
    Random rnd = new Random();
    
    private int muere;
    private int daño;
    private int movimiento;
    private int base = 10;
    private Horda horda = new Horda();
    
    public Zombie(){}
    
    public Zombie(int muere, int daño, int movimiento){
        this.muere = muere;
        this.daño = daño;
        this.movimiento = movimiento;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public Horda getHorda() {
        return horda;
    }

    public void setHorda(Horda horda) {
        this.horda = horda;
    }

    public int getMuere() {
        return muere;
    }

    public void setMuere(int muere) {
        this.muere = muere;
    }
    

   public int calcularGolpeo(int bonificacion){
       //base * skills + aleatorio
       int aleatorio = rnd.nextInt(10)+1;    //random.nextInt(max - min + 1) + min
       return this.base * bonificacion + aleatorio;
   }
    
    
}
