
package zombicide;


public class Horda {
    
 private int respawn = 3;
 
   
    public int getRespawn() {
        return respawn;
    }

    public void setRespawn(int respawn) {
        this.respawn = respawn;
    }
 
    
    //metodo que hace que el respawn de un zombie reste un paso para su siguiente ataque 
    public void camina(){
        this.respawn--;
    }
    
    //metodo que hace que despues de morder un zombie se reinicialice su respawn
    public void resetRespawn(){
        this.respawn = 3;
    }
    
}
