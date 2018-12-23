
package zombicide;




public class Superviviente {
    private int vidas = 3;   
    private int nivel = 0;
    private String nombre;
    private Skills skill = Skills.RAPIDO;
    private Arma arma = new Arma(1, 1, TipoArma.SARTEN);
    
    
    public Superviviente(String nombre){
        this.nombre = nombre;
    }     
  
    public Superviviente(int vidas, int nivel,String nombre, Skills skill, Arma arma){
        this.vidas = vidas;
        this.nivel = nivel;
        this.nombre = nombre;
        this.skill = skill;
        this.arma = arma;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
        switch(skill){
           case RAPIDO:
                this.arma.setDaño(2);
                break;
           case BUSCADOR:
                this.arma.setTipo(TipoArma.KATANA);
                this.arma.setDaño(2);
                this.arma.setDistancia(1);
                break;
           case FORTACHON:
                this.setVidas(this.getVidas()+1);
                break;
           
        }
          
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public boolean tieneArma(){
        if(this.arma != null){
            return true;
        }
        else return false;
    }
    
    public void deleteArma(){
        this.arma = null;
    }
    public void armarse(){
        this.arma.armarse();
    }
    
}
