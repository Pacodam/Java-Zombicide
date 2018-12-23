/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombicide;

/**
 *
 * @author alu2017454
 */
public class Gordo extends Zombie {
    
    private static int maxGolpeo = 0;
    
    public Gordo(int muere,int daño, int movimiento){
        super(muere, daño, movimiento);
        
    }

    @Override
    public int calcularGolpeo(int bonificacion){
        int golpeo = super.calcularGolpeo(bonificacion) + 2 * this.getMovimiento();
        System.out.println("golpeo de gordo");
        if(golpeo > maxGolpeo){
            System.out.println("Nuevo record. El golpeo máximo es de " + golpeo + " puntos");
            maxGolpeo = golpeo;
        }
        return golpeo; 
    }
    
    
    
}
