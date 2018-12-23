
package zombicide;


import java.util.ArrayList;
import java.util.Scanner;
import  metodos.metodos;


public class Zombicide {

    static Scanner input = new Scanner(System.in);
    
    public static ArrayList<Superviviente> supervivientes = new ArrayList<Superviviente>();
    public static ArrayList<Zombie> zombiesP1 = new ArrayList<Zombie>();
    public static ArrayList<Zombie> zombiesP2 = new ArrayList<Zombie>();
    public static ArrayList<Zombie> zombiesP3 = new ArrayList<Zombie>();
    
    public static boolean escurridizo = true; //se pone en false cuando se ha zafado una vez por planta
  
    
    public static void main(String[] args) {
                               
       int i = 0; 
       boolean empezar = true;    /*booleano que usamos para cuando se empieza nueva partida, luego pasa a false*/
       boolean finPartida = false; //booleano que indica que ha finalizado una partida, se usa en el menu
       boolean turnoSuperviviente = true; //empieza con este valor porque al principio atacan los supervivientes
       int planta = 1; //este valor indica la planta en la que estamos (la partida empieza en la 1 y termina en la 3)
       int opcion = 0;
      
          
      
      do{ 
          //empezar = true, nueva partida. Creamos supervivientes y zombies.
          if(empezar){
              
              supervivientes.clear();  //vaciamos arraylist en caso de reiniciar partida
              zombiesP1.clear();
              zombiesP2.clear();
              zombiesP3.clear();
              
              System.out.println("NUEVA PARTIDA. Creando supervivientes y zombies");
              //CREACIÓN DE SUPERVIVIENTES. CONSTRUCTOR RECIBIENDO NOMBRE
              Superviviente super1 = new Superviviente("John");
              Superviviente super2 = new Superviviente("Peter"); 
              Superviviente super3 = new Superviviente("Elektra");
              Superviviente super4 = new Superviviente("Tom Sawyer");
              Superviviente super5 = new Superviviente("Stella");
              //les damos skills
              super1.setSkill(Skills.RAPIDO);  
              super2.setSkill(Skills.BUSCADOR);
              super3.setSkill(Skills.ESCURRIDIZO);
              super4.setSkill(Skills.FORTACHON);
              super5.setSkill(Skills.AMBIDIESTRO);
              //les damos armas (super1 y super2 ya tienen sarten y katana respectivamente)
              super3.setArma(new Arma(1, 2, TipoArma.PISTOLA));
              super4.setArma(new Arma(1, 2, TipoArma.ESCOPETA));
              super5.setArma(new Arma(2, 1, TipoArma.HACHA));
              //los añadimos al arraylist supervivientes
              supervivientes.add(super1);
              supervivientes.add(super2);
              supervivientes.add(super3);
              supervivientes.add(super4);
              supervivientes.add(super5);
              
              //los zombies de la primera planta son todos caminantes
              for(i = 0; i < 8; i++){
                zombiesP1.add(new Caminante(1,1,1));  //MUERE, DAÑO, MOVIMIENTO
              }
              //en planta 2 hay 2 gordos y el resto caminantes
              for(i = 0; i < 8; i++){
                  if(i == 1 || i == 5){
                     zombiesP2.add(new Gordo(2,2,2));
                  }
                 else{
                     zombiesP2.add(new Caminante(1,1,1));
                 }
              }
            //en planta 3 hay 2 gordos, 1 unknown y el resto caminantes
            for(i = 0; i < 8; i++){
              if(i == 1 || i == 5){
                zombiesP3.add(new Gordo(2,2,2));
              }
              if(i == 3){
                zombiesP3.add(new Unknown(2,3,2));
              }
              else{
               zombiesP3.add(new Caminante(1,1,1));
             }
           }
            empezar = false;
            finPartida = false;
            planta = 1;
            turnoSuperviviente = true;
          }
          //una vez hemos creado los arraylist de los contendientes iniciamos partida
        if(!empezar){
          if(planta == 1 && !finPartida){ 
             System.out.println("\nEl combate de la planta 1: !!!Malditos caminantes!!!");
             
          }
          if(planta == 2 && !finPartida){ 
             System.out.println("\nEl combate de la planta 2: !!!La venganza de los gordos!!!");
          }
          if(planta == 3 && !finPartida){ 
             System.out.println("\nEl combate de la planta 3: !!!Hay un unknown en mi sopa!!!");
          }
          if(turnoSuperviviente && !zombiesP3.isEmpty()) System.out.println("Atacan los supervivientes");
          if(!turnoSuperviviente && !zombiesP3.isEmpty()) System.out.println("Atacan los zombies");
          
          //mostramos un menú con diferentes opciones
          System.out.println("\n1. Ver información actual de supervivientes y zombies");
          if(turnoSuperviviente && !finPartida){
            System.out.println("2. Iniciar ataque de supervivientes");
          }
          if(!turnoSuperviviente && !finPartida){
             System.out.println("3. Iniciar ataque de zombies");
          }
          System.out.println("4. Empezar nueva  partida");
          System.out.println("5. Salir de la partida");
          //System.out.println("planta "+planta);
          
          opcion = input.nextInt();
          
          
          switch(opcion){
              case 1:
                  metodos.estadoActual(planta,"todos"); //este método muestra en pantalla los datos de supervivientes y zombies
                  break;
              
              case 2:
                  
                  /*ronda de ataque de supervivientes. Recorremos el arraylist y si en una determinada posición
                  hay superviviente entonces ataca, en caso contrario es porque está muerto así que se pasa al siguiente */
                  if(planta == 1){
                    
                      for(Superviviente index: supervivientes){                  //recorremos arraylist supervivientes
                          System.out.println("Ataca "+ index.getNombre());
                          index.armarse();
                          for(int ataque = 1; ataque < 4; ataque++){         //tres ataques por superviviente
                                   if(!zombiesP1.isEmpty()){                     //... a menos que ya no queden zombies en la planta
                                     System.out.println("\nAtaque " +ataque);    //mostramos el numero de ataque
                                     metodos.atacaSuperviviente(index, planta);  //llamamos al método que calcula el resultado del ataque 
                                   } 
                               }
                      }
                      metodos.estadoActual(planta, "zombies");   
                      turnoSuperviviente = false;  //ponemos a false porque luego le toca tirar a zombies   
                      if(zombiesP1.isEmpty()){     //si el arraylist de la planta ya está vacío es que han pasado de nivel los supervivientes
                          System.out.println("Los supervivientes han limpiado la planta 1. Pasamos a la 2");
                          turnoSuperviviente = true;
                          planta = 2;
                          escurridizo = true;
                      }
                      
                  }    
                  else if(planta == 2){
                       
                       for(Superviviente index: supervivientes){
                           System.out.println("Ataca "+ index.getNombre());
                           index.armarse();
                            for(int ataque = 1; ataque < 4; ataque++){  
                              if(!zombiesP2.isEmpty()){
                                  System.out.println("\nAtaque " +ataque);  
                                  metodos.atacaSuperviviente(index, planta);   
                              } 
                            }
                       }
                      metodos.estadoActual(planta, "zombies");   
                      turnoSuperviviente = false;  //ponemos a false porque luego le toca tirar a zombies
                      if(zombiesP2.isEmpty()){ 
                          System.out.println("Los supervivientes han limpiado la planta 2. Pasamos a la 3");
                          turnoSuperviviente = true;
                          planta = 3;
                          escurridizo = true;
                      }
                  }
                  else if(planta == 3){
                      
                      for(Superviviente index: supervivientes){
                          System.out.println("Ataca "+ index.getNombre());
                          index.armarse();
                          System.out.println("\nATACA EL SUPERVIVIENTE "+ index.getNombre());
                          for(int ataque = 1; ataque < 4; ataque++){  
                             if(!zombiesP3.isEmpty()){
                                 System.out.println("\nAtaque " +ataque);  
                                 metodos.atacaSuperviviente(index, planta);   
                            } 
                          }
                      }
                      metodos.estadoActual(planta, "zombies");   
                      turnoSuperviviente = false;  //ponemos a false porque luego le toca tirar a zombies
                      if(zombiesP3.isEmpty()){ 
                          System.out.println("\nÉXITO.Los supervivientes han ganado la partida.");
                          turnoSuperviviente = true;
                          finPartida = true;
                          
                      }
                  }
                  break;
                  
                  
              case 3:
                  if(planta == 1){
                      
                     for(Zombie index: zombiesP1){
                         if(!supervivientes.isEmpty()){
                             System.out.println("\nAtaca zombie "+ index);
                             metodos.atacaZombie(index, planta);
                         } 
                     }
                     metodos.estadoActual(planta, "supervivientes");   
                  }
                  if(planta == 2){
                      
                     for(Zombie index: zombiesP2){
                         if(!supervivientes.isEmpty()){
                             System.out.println("\nAtaca zombie "+ index);
                             metodos.atacaZombie(index, planta);
                        }
                     }
                     metodos.estadoActual(planta, "supervivientes");  
                  }
                  if(planta == 3){
                      
                     for(Zombie index: zombiesP3){
                        if(!supervivientes.isEmpty()){
                           System.out.println("\nAtaca zombie "+ index);
                            if(index instanceof Unknown){
                              //PARA EJHECUTAR EL ZARPAZO
                                System.out.println("Es un unknown!!! Evaluando osible zarpazo...");
                              //ejemplo de polimorfismo: casteo a unknown para poder acceder al método zarpazo
                                Unknown z = (Unknown) index;
                                if(z.zarpazo()){
                                    System.out.println("Ha obtenido el zarpazo!!! Doble ataque...");
                                    metodos.atacaZombie(index,planta);
                                    metodos.atacaZombie(index,planta);
                                }
                                else{
                                    System.out.println("No ha obtenido el zarpazo!!! Ataque simple...");
                                    metodos.atacaZombie(index,planta);
                                } 
                            }
                            else{ 
                               metodos.atacaZombie(index, planta);
                            }
                     }
                     metodos.estadoActual(planta, "supervivientes");  
                    }
                  }
                  if(supervivientes.isEmpty()){
                      System.out.println("\nFRACASO. Todos los supervivientes han muerto");
                      finPartida = true;
                      
                  }else{
                      turnoSuperviviente = true;
                  }
                          
                  break;          
                 
              case 4:
                  empezar = true;
                  break;
                    
          
          }
        } 
      }while(opcion != 5);
     
      
      
        
       
      
      
    
    } 
}

       
      
      
    
    

