/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombicide;

import java.util.Random;


public class Unknown extends Zombie{
    
    Random rnd = new Random();
    
    private static int maxGolpeo = 0;
    
    public Unknown(int muere,int daño, int movimiento){
        super(muere,daño, movimiento);
    }

    public int getMaxGolpeo() {
        return maxGolpeo;
    }
    
    
    @Override
    public int calcularGolpeo(int bonificacion){
        int golpeo = super.calcularGolpeo(bonificacion) * this.getDaño();
        System.out.println("golpeo de unknown");
        if(golpeo > maxGolpeo){
            System.out.println("Nuevo record. El golpeo máximo es de " + golpeo + " puntos");
            maxGolpeo = golpeo;
        }
        return golpeo; 
    }
    
    public boolean zarpazo(){
        int aleatorio = rnd.nextInt(10) + 1;
        if(aleatorio > 7){ return true;}
        else {return false;}
    }
}
