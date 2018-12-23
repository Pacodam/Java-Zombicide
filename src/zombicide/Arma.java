/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombicide;


public class Arma {
  
    private int daño = 1;
    private int distancia = 0;
    private TipoArma tipo = TipoArma.SARTEN;
    
  
    
   public Arma(){};
    
    public Arma(int daño, int distancia, TipoArma tipo){
        
        this.daño = daño;
        this.distancia = distancia;
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }
    
    //metodo para mostrar el grito de guerra al armarse el superviviente
    public void armarse(){
        System.out.println("!!!Al ataquerrlllll!!!");
    }
   
}
