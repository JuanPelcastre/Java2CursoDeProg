import java.io.*;
import java.util.*;

/*

  CLASE: Aeropuerto
  
  DESCRIPCIÓN: Esta clase contiene el método main y a partir de aquí se ejecuta todo el
               programa.  Esta clase es la única que interactúa con el usuario.

  VARIABLES:   private static CTorreControl TorreControl {objeto de la clase CTorreControl}
               private static CPantalla Pantalla {hilo de la clase CPantalla}
               private static CPermiso admision {objeto de la clase CPermiso}
               private CAvion[] aviones {array de objetos de la clase CAvion}


  MÉTODOS:
                      
    public static void main(String[] args)
    public static void menu()
    public static void nombrarAviones(String[] nom)

*/

public class Aeropuerto
{
  // Atributos
  
  // Torre de Control del aeropuerto.
  private static CTorreControl TorreControl = null;
  
  //Hilo para visualizar los resultados en pantalla.
  private static CPantalla Pantalla = null;
  
  //Semáforo de sincronización.
  private static CPermiso admision;
  
  // Aviones del aeropuerto.
  private CAvion[] aviones;
  
  //Método principal.
  public static void main(String[] args) throws IOException
  {        
    char respuesta; //carácter (s/n)
    BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
    
    menu(); //Llamada al método menu
    
    CAvion[] aviones = new CAvion[TorreControl.obtenerFlota()];  

    //Pantalla para visualizar los aviones.
    Pantalla = new CPantalla (TorreControl);
        
    String[] nombre = new String[TorreControl.obtenerFlota()];
    
    nombrarAviones(nombre); //Llamada al método.
    
    //Creación de los hilos.
    for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      aviones[i] = new CAvion (TorreControl, nombre[i], i, admision);            
    
    for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      System.out.println("Nombre del avion "+i+" es: "+aviones[i].obtenerNombre());
             
    System.out.println("El aeropuerto empieza a funcionar.\n\n");    
    
    //Los hilos empiezan a funcionar.
    for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      aviones[i].start();

    Pantalla.start();

  }

  //Método que permite al usuario cambiar las características del programa
  //establecidas por defecto.
  public static void menu() throws IOException
  {
    char respuesta;
    String nom_dest = null;
    int naviones = 0, npistas = 0, dis_dest = 0, ndests = 0;

    BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Este programa tiene unas condiciones establecidas por defecto: \n");        
    System.out.println("\tLa flota aérea de la que dispone el aerouperto es de 12 aviones.");
    System.out.println("\tEl número de pistas que tiene el aeropuerto es de 4.");
    System.out.println("\tLos destinos con los que trabaja el aerouperto son: ");
    System.out.println("\t- Barcelona, A Coruña, Sevilla, New York, San Francisco, Los Angeles");
    System.out.println("\t- Santo Domingo, París, Munich, Roma, Amsterdam, Londres.");

    System.out.print("\n\n¿Desea cambiar las condiciones establecidas por defecto?(s/n) ");
      
    respuesta = (char)entrada.read();
    entrada.readLine();
    respuesta = Character.toLowerCase(respuesta); //Ponemos la respuesta a minúsculas.
    System.out.println("\n\n");

    if (respuesta == 's')
    {
      do
      {
        System.out.print("¿Con cuántos aviones quiere usted trabajar?(max 12) ");    
        naviones = Integer.parseInt(entrada.readLine()); //Leemeos un entero.
      }while(naviones > 12 || naviones < 1);
      
      System.out.print("¿Desea trabajar con un número de pistas distinto a 4?(s/n) ");    
      respuesta = (char)entrada.read();
      entrada.readLine();
      respuesta = Character.toLowerCase(respuesta);
      System.out.println("\n\n");

      if (respuesta == 's')
      {
        do
        {
          System.out.print("¿Con cuántas pistas quiere trabajar? ");    
          npistas = Integer.parseInt(entrada.readLine());                    
        }while(npistas < 1);
        
        //Llamamos a los constructores.
        TorreControl = new CTorreControl(naviones, npistas);
        admision = new CPermiso(TorreControl.numPistas());
      }
      else
      {  
        //Llamamos a los constructores.
        TorreControl = new CTorreControl(naviones);
        admision = new CPermiso(TorreControl.numPistas());
      }                    
    }  
    else
    {  
      //Llamamos a los constructores.
      TorreControl = new CTorreControl();
      admision = new CPermiso(TorreControl.numPistas());
    }
  }
  
  //La función de este método es asignar un nombre a cada avión en caso de que el usuario lo
  //desee así.
  public static void nombrarAviones(String[] nom) throws IOException
  {
    char respuesta;

    BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("\n¿Desea darle nombres a los aviones?(s/n) ");    
    respuesta = (char)entrada.read();
    entrada.readLine();
    respuesta = Character.toLowerCase(respuesta);
    System.out.println("\n\n");
    if (respuesta == 's')
    {
      System.out.println("A continuación escriba el nombre de los aviones:\n");
      for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      {
        System.out.print("\tAvión[" +i+"]: ");
        nom[i] = entrada.readLine();
      }
    }
  }
    
}
