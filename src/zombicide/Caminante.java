
package zombicide;


public class Caminante extends Zombie {
    
    private static int maxGolpeo = 0;

    public Caminante(int muere, int daño, int movimiento) {
        super(muere, daño, movimiento);
    }
    

    @Override
    public int calcularGolpeo(int bonificacion){
        int golpeo = super.calcularGolpeo(bonificacion) + 5;
        System.out.println("golpeo de caminante");
        if(golpeo > maxGolpeo){
            System.out.println("Nuevo record. El golpeo máximo es de " + golpeo + " puntos");
            maxGolpeo = golpeo;
        }
        return golpeo; 
    }
}
