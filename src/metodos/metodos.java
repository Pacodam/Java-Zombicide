/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


import zombicide.*;
import java.util.Random;




public class metodos {
    
    static Random rnd = new Random();
    static int alSize = 0;  //el valor alSize será el valor del cual generar aleatorio de a qué zombi atacar
                     // se debe actualizar cada vez que un zombie es elmiinado
   
    public static void estadoActual(int planta, String mostrar){
        
        
     if(mostrar.equals("zombies") || mostrar.equals("todos")){
        String[] tipoZombie = null;
        int[] muereZombie = null;
        int[] danoZombie = null;
        int[] movZombie = null;
        int respawnZombie[] = null;
        
        int i = 0;
        if(planta == 1){
           tipoZombie = new String[Zombicide.zombiesP1.size()];
           muereZombie = new int[Zombicide.zombiesP1.size()];
           danoZombie = new int[Zombicide.zombiesP1.size()];
           movZombie = new int[Zombicide.zombiesP1.size()];
           respawnZombie = new int[Zombicide.zombiesP1.size()];
        
           for(Zombie index: Zombicide.zombiesP1){
              tipoZombie[i] = claseZombie(index.getClass());
              muereZombie[i] = index.getMuere();
              danoZombie[i] = index.getDaño();
              movZombie[i] = index.getMovimiento();
              respawnZombie[i] = index.getHorda().getRespawn();
              i++;
           }
        }
        if(planta == 2){
           tipoZombie = new String[Zombicide.zombiesP2.size()];
           muereZombie = new int[Zombicide.zombiesP2.size()];
           danoZombie = new int[Zombicide.zombiesP2.size()];
           movZombie = new int[Zombicide.zombiesP2.size()];
           respawnZombie = new int[Zombicide.zombiesP2.size()];
        
           for(Zombie index: Zombicide.zombiesP2){
              tipoZombie[i] = claseZombie(index.getClass());
              muereZombie[i] = index.getMuere();
              danoZombie[i] = index.getDaño();
              movZombie[i] = index.getMovimiento();
              respawnZombie[i] = index.getHorda().getRespawn();
              i++;
           }
        }
        if(planta == 3){
           tipoZombie = new String[Zombicide.zombiesP3.size()];
           muereZombie = new int[Zombicide.zombiesP3.size()];
           danoZombie = new int[Zombicide.zombiesP3.size()];
           movZombie = new int[Zombicide.zombiesP3.size()];
           respawnZombie = new int[Zombicide.zombiesP3.size()];
        
           for(Zombie index: Zombicide.zombiesP3){
              tipoZombie[i] = claseZombie(index.getClass());
              muereZombie[i] = index.getMuere();
              danoZombie[i] = index.getDaño();
              movZombie[i] = index.getMovimiento();
              respawnZombie[i] = index.getHorda().getRespawn();
              i++;
           }
        }
        System.out.println("Datos de los zombies");
        
        System.out.print("\nTipo  ");
        System.out.print(" | ");
        for(i = 0; i < tipoZombie.length; i++){
           System.out.print(tipoZombie[i] + " | ");
         }
        
        System.out.print("\nVida   ");
        System.out.print("|  ");
        for(i = 0; i < tipoZombie.length; i++){
           System.out.print(muereZombie[i] + "  |  ");
        }
        
        System.out.print("\nDaño   ");
        System.out.print("|  ");
        for(i = 0; i < tipoZombie.length; i++){
           System.out.print(danoZombie[i] + "  |  ");
        }
        System.out.print("\nMovim  ");
        System.out.print("|  ");
        for(i = 0; i < tipoZombie.length; i++){
           System.out.print(movZombie[i] + "  |  ");
        }
         System.out.print("\nRespawn");
         System.out.print("|  ");
         for(i = 0; i < tipoZombie.length; i++){
           System.out.print(respawnZombie[i] + "  |  ");
        }
     }
     if(mostrar.equals("supervivientes") || mostrar.equals("todos")){
        
        System.out.println("\n");
        System.out.println("Datos de los supervivientes");
        String[] nombresSup = new String[Zombicide.supervivientes.size()];
        int vidasSup[] = new int[Zombicide.supervivientes.size()];
        int nivelSup[] = new int[Zombicide.supervivientes.size()];
        Skills skillSup[] = new Skills[Zombicide.supervivientes.size()];
        TipoArma tipoArma[] = new TipoArma[Zombicide.supervivientes.size()];
        int danoArma[] = new int[Zombicide.supervivientes.size()];
        int distanciaArma[] = new int[Zombicide.supervivientes.size()];
       
        int i = 0;
        for(Superviviente index: Zombicide.supervivientes){
            nombresSup[i] = index.getNombre();
            vidasSup[i] = index.getVidas();
            nivelSup[i] = index.getNivel();
            skillSup[i] = index.getSkill();
            tipoArma[i] = index.getArma().getTipo();
            danoArma[i] = index.getArma().getDaño();
            distanciaArma[i] = index.getArma().getDistancia();
            i++;
        }
        System.out.print("\nNombre  ");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
           System.out.print(nombresSup[i] + "  |  ");
         }
        System.out.print("\nvidas   ");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
           System.out.print(vidasSup[i] + "  |  ");
         }
        System.out.print("\nnivel   ");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
            System.out.print(nivelSup[i] + "  |  ");
        }
        System.out.print("\nskill   ");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
            System.out.print(skillSup[i] + "  |  ");
        }
        System.out.print("\ntipoArma");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
            System.out.print(tipoArma[i] + "  |  ");
        }
        System.out.print("\ndanoArma");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
            System.out.print(danoArma[i] + "  |  ");
        }
        System.out.print("\ndistArma");
        System.out.print("|  ");
        for(i = 0; i < nombresSup.length; i++){
            System.out.print(distanciaArma[i] + "  |  ");
        }
        System.out.println("\n");
    }
    }
    
    public static String claseZombie(Object clase){
        
        
        String tipo = clase.toString();
        if(tipo.equals("class zombicide.Caminante")){
            tipo = "CAM";
        }
        if(tipo.equals("class zombicide.Gordo")){
            tipo = "GOR";
        }
        if(tipo.equals("class zombicide.Unknown")){
            tipo = "UNK";
       }
       return tipo;
    }
    
                          //METODOS DE ATAQUE DE SUPERVIVIENTES
    
public static void atacaSuperviviente(Superviviente index, int planta){
    
        Zombie atacado = atacado(planta);                         //obtenemos a quien se ataca
        System.out.println("Ataque a zombie "+ atacado);
        int muere = atacado.getMuere();    
        int ataque = index.getArma().getDaño();
        if(ataque < muere){
            System.out.println("Arma ineficiente. Su dano es "+ataque+" y debe ser "+muere+" minimo\n");
        }
        else{
          System.out.println("Puede atacar. Generando aleatorio..");
          int muereOvive  = rnd.nextInt(2); 
          System.out.println("Aleatorio es:"+muereOvive);
         if(muereOvive == 0){
             System.out.println("El zombie ha escapado!!!.\n");
         }
         if(muereOvive == 1){
             int nivel = index.getNivel();
             index.setNivel(nivel+1);       //al superviviente que mata un zombie le damos un punto de nivel
             System.out.println("El zombie ha sido eliminado!!!.\n");
             
             if(planta == 1){
                  Zombicide.zombiesP1.remove(atacado);  
             }
             if(planta == 2){
                  Zombicide.zombiesP2.remove(atacado);
             }
             if(planta == 3){
                  Zombicide.zombiesP3.remove(atacado);    
             }
         }
     }
    
} 
//método que recibe el número de planta y devuelve el indice del zombie que recibirá el ataque
public static Zombie atacado(int planta){
     int numZombies = 0;
        Zombie atacado = null;
        if(planta == 1){ 
            numZombies = Zombicide.zombiesP1.size();
             int z  = rnd.nextInt(numZombies);      //se genera el aleatorio de a qué zombie atacar
             atacado = Zombicide.zombiesP1.get(z);  //se obtiene el index de ese zombie
        }
        if(planta == 2){ 
            numZombies = Zombicide.zombiesP2.size(); 
            int z  = rnd.nextInt(numZombies);      //se genera el aleatorio de a qué zombie atacar
            atacado = Zombicide.zombiesP2.get(z);  //se obtiene el index de ese zombie
        }
        if(planta == 3){ 
            numZombies = Zombicide.zombiesP3.size(); 
            int z  = rnd.nextInt(numZombies);      //se genera el aleatorio de a qué zombie atacar
            atacado = Zombicide.zombiesP3.get(z);  //se obtiene el index de ese zombie
        }
                 
       return atacado;
}

                         //MÉTODOS DE ATAQUES DE ZOMBIES

public static void atacaZombie(Zombie index, int planta){
     
    Superviviente atacado = atacadoS();
    int ataqueZ = index.getDaño();
       System.out.println("ataque zombie "+ index.getDaño());
    int vidaS = atacado.getVidas();
       System.out.println("vidas superviviente "+ atacado.getVidas());
    if(atacado.getSkill() == Skills.ESCURRIDIZO && Zombicide.escurridizo){
        System.out.println("El superviviente escurridizo logra escapar");
        Zombicide.escurridizo = false;
    }
    else{
        int descontar = vidaS - ataqueZ;
        if(descontar <= 0){
            System.out.println("Ha muerto el superviviente " + atacado.getNombre());
            Zombicide.supervivientes.remove(atacado);
        }
        else{
            atacado.setVidas(descontar);
            System.out.println("El superviviente "+atacado.getNombre()+" tiene ahora "+atacado.getVidas()+ " vidas");
        }
        //si el zombie ha mejorado la marca de su tipo de zombie se muestra un mensaje
        int puntos = golpeo(atacado, index);
        System.out.println("El zombie ha conseguido "+ puntos + " puntos de golpeo");
        
        
    }
    
}   
//método que devuelve el indice del superviviente que será atacado
public static Superviviente atacadoS(){
    Superviviente atacado = null;
    int numSuperv = Zombicide.supervivientes.size();
    int s = rnd.nextInt(numSuperv);
    atacado = Zombicide.supervivientes.get(s);
    return atacado;
    
}

public static int golpeo(Superviviente s, Zombie z){
    
    int bonificacion = 0;
    
    if(s.getSkill() == Skills.AMBIDIESTRO){ bonificacion = 8; }
    if(s.getSkill() == Skills.BUSCADOR){ bonificacion = 3; }
    if(s.getSkill() == Skills.ESCURRIDIZO){ bonificacion = 9; }
    if(s.getSkill() == Skills.FORTACHON){ bonificacion = 7; }
    if(s.getSkill() == Skills.RAPIDO){ bonificacion = 5; }
    
    return z.calcularGolpeo(bonificacion);
    
}



}
