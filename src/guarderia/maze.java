/*

//creando arraylist
import java.util.ArrayList;
import java.util.Scanner;
import  metodos.metodos;


public class Zombicide {

    static Scanner input = new Scanner(System.in);
    
    public static ArrayList<Superviviente> supervivientes = new ArrayList<Superviviente>();
    public static ArrayList<Zombie> zombiesP1 = new ArrayList<Zombie>();
    public static ArrayList<Zombie> zombiesP2 = new ArrayList<Zombie>();
    public static ArrayList<Zombie> zombiesP3 = new ArrayList<Zombie>();

Superviviente super1 = new Superviviente("John");
  super1.setSkill(Skills.RAPIDO);  
 super3.setArma(new Arma(1, 2, TipoArma.PISTOLA));
 supervivientes.add(super1);

  zombiesP2.add(new Gordo(2,2,2));

//creando arrays
import java.util.Random;
 static Random rnd = new Random();

 String[] tipoZombie = null; //inicio sin tamaño  
tipoZombie = new String[Zombicide.zombiesP1.size()];  //se le da tamaño
  tipoZombie[i] = claseZombie(index.getClass());  //se añaden valores


 
VARIABLE ESTÁTICA COMPARTIDA POR TODAS LAS INSTANCIAS DE UNA CLASE:
 private static int maxGolpeo = 0;

COMPOSICIÓN

  //en atributos de la clase, ya tienen un arma declarada por defecto
  private Arma arma = new Arma(1, 1, TipoArma.SARTEN);

  //en constructor se le pasa una también (cambia la anterior)
   public Superviviente(int vidas, int nivel,String nombre, Skills skill, Arma arma){
        this.vidas = vidas;
        this.nivel = nivel;
        this.nombre = nombre;
        this.skill = skill;
        this.arma = arma;
    }


AGREGACION


HERENCIA

//uso de extends:
public class Caminante extends Zombie {

//constructor, uso de super al constructor del padre:
 public Caminante(int muere, int daño, int movimiento) {
        super(muere, daño, movimiento);
    }
 
// llamada a método del padre, uso de override
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

//en el padre ese método que ha sido llamado por el hijo es así:
 public int calcularGolpeo(int bonificacion){
       //base * skills + aleatorio
       int aleatorio = rnd.nextInt(10)+1;    //random.nextInt(max - min + 1) + min
       return this.base * bonificacion + aleatorio;
   }
    
POLIMORFISMO, ejemplo del zarpazo:

//casteo al hijo para acceder a su método particular:
 if(index instanceof Unknown){
                              //PARA EJHECUTAR EL ZARPAZO
                                System.out.println("Es un unknown!!! Evaluando osible zarpazo...");
                              //ejemplo de polimorfismo: casteo a unknown para poder acceder al método zarpazo
                                Unknown z = (Unknown) index;
                                if(z.zarpazo()){
//aqui su declaración en la clase:
 public boolean zarpazo(){
        int aleatorio = rnd.nextInt(10) + 1;
        if(aleatorio > 7){ return true;}
        else {return false;}
    }

java.util.Random           random.nextInt(max-min+1) + min
                           letrasAleat[i] = (char)(intRandom.nextInt(26) + 97);


java.lang.Math             Math.PI, Math.pow(base, exp)

java.lang.String           string.toLowerCase()
                           string.toUpperCase()
				
string.length()     length of string
array.length         array

//encontrar numero o letra en un string:

 if(!(Character.isDigit(nif.charAt(i)))){

 if(Character.isDigit(passw.charAt(i)))
		 hayNum = true;
	  if(Character.isLetter(passw.charAt(i)))
		 hayLetra = true;

//busqueda en una posicion de un string:		 
for (int i = 0; i < passw.length(); i++) {
		
		char c = passw.charAt(i);
		
		if(!((c>=48 && c<=57) || (c>=65 && c<=90) || (c>=97 && c<=122))){
			
			caracter = false;
			correcto = false;
		}	
		
//leer por teclado un valor
c = input.next().charAt(0);


frase = frase.replace("a", "e");  //con este método sustituimos a por e

//imprimir abecedario:
for(i = (char)('a'); i <= (char)('z'); i++){
            System.out.println((char)(i) + " --> " + i);
			
//borrar valores de un array, desplazar
ejercicio e7 arrays
ejercicio e9 arrays
ejercicio e13 y e14 matrices



			

                   



*/