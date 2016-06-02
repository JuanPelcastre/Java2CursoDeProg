import java.io.*;
import java.util.*;

/*

  CLASE: Aeropuerto
  
  DESCRIPCI�N: Esta clase contiene el m�todo main y a partir de aqu� se ejecuta todo el
               programa.  Esta clase es la �nica que interact�a con el usuario.

  VARIABLES:   private static CTorreControl TorreControl {objeto de la clase CTorreControl}
               private static CPantalla Pantalla {hilo de la clase CPantalla}
               private static CPermiso admision {objeto de la clase CPermiso}
               private CAvion[] aviones {array de objetos de la clase CAvion}


  M�TODOS:
                      
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
  
  //Sem�foro de sincronizaci�n.
  private static CPermiso admision;
  
  // Aviones del aeropuerto.
  private CAvion[] aviones;
  
  //M�todo principal.
  public static void main(String[] args) throws IOException
  {        
    char respuesta; //car�cter (s/n)
    BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
    
    menu(); //Llamada al m�todo menu
    
    CAvion[] aviones = new CAvion[TorreControl.obtenerFlota()];  

    //Pantalla para visualizar los aviones.
    Pantalla = new CPantalla (TorreControl);
        
    String[] nombre = new String[TorreControl.obtenerFlota()];
    
    nombrarAviones(nombre); //Llamada al m�todo.
    
    //Creaci�n de los hilos.
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

  //M�todo que permite al usuario cambiar las caracter�sticas del programa
  //establecidas por defecto.
  public static void menu() throws IOException
  {
    char respuesta;
    String nom_dest = null;
    int naviones = 0, npistas = 0, dis_dest = 0, ndests = 0;

    BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Este programa tiene unas condiciones establecidas por defecto: \n");        
    System.out.println("\tLa flota a�rea de la que dispone el aerouperto es de 12 aviones.");
    System.out.println("\tEl n�mero de pistas que tiene el aeropuerto es de 4.");
    System.out.println("\tLos destinos con los que trabaja el aerouperto son: ");
    System.out.println("\t- Barcelona, A Coru�a, Sevilla, New York, San Francisco, Los Angeles");
    System.out.println("\t- Santo Domingo, Par�s, Munich, Roma, Amsterdam, Londres.");

    System.out.print("\n\n�Desea cambiar las condiciones establecidas por defecto?(s/n) ");
      
    respuesta = (char)entrada.read();
    entrada.readLine();
    respuesta = Character.toLowerCase(respuesta); //Ponemos la respuesta a min�sculas.
    System.out.println("\n\n");

    if (respuesta == 's')
    {
      do
      {
        System.out.print("�Con cu�ntos aviones quiere usted trabajar?(max 12) ");    
        naviones = Integer.parseInt(entrada.readLine()); //Leemeos un entero.
      }while(naviones > 12 || naviones < 1);
      
      System.out.print("�Desea trabajar con un n�mero de pistas distinto a 4?(s/n) ");    
      respuesta = (char)entrada.read();
      entrada.readLine();
      respuesta = Character.toLowerCase(respuesta);
      System.out.println("\n\n");

      if (respuesta == 's')
      {
        do
        {
          System.out.print("�Con cu�ntas pistas quiere trabajar? ");    
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
  
  //La funci�n de este m�todo es asignar un nombre a cada avi�n en caso de que el usuario lo
  //desee as�.
  public static void nombrarAviones(String[] nom) throws IOException
  {
    char respuesta;

    BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("\n�Desea darle nombres a los aviones?(s/n) ");    
    respuesta = (char)entrada.read();
    entrada.readLine();
    respuesta = Character.toLowerCase(respuesta);
    System.out.println("\n\n");
    if (respuesta == 's')
    {
      System.out.println("A continuaci�n escriba el nombre de los aviones:\n");
      for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      {
        System.out.print("\tAvi�n[" +i+"]: ");
        nom[i] = entrada.readLine();
      }
    }
  }
    
}
