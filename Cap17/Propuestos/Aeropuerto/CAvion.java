import java.util.*;

/*

  CLASE: CAvion
  
  DESCRIPCIÓN: La clase CAvion se necesita cada vez que queremos utilizar un nuevo avión,
               un nuevo hilo. Se compone de dos constructores, de un método run y de un método
               para obtener el nombre del avión. La clase CAvion contiene toda la información
               acerca del vuelo de un avión.

  VARIABLES: private String nombre;  {nombre del avión}
             private int numero;  {número del hilo}
             private CTorreControl TorreControl;  {Objeto de la clase CTorreControl}
             private CPermiso Permiso;  {Objeto de la clase CPermiso}

  MÉTODOS:
    - CONSTRUCTORES:  public CAvion(CTorreControl tc, CPermiso per) 
                      public CAvion(CTorreControl tc, String nomAvion, int num, CPermiso per)
                      
    public void run
    public String obtenerNombre()
    public int recuperarPrioridad()
    public void asignarPrioridad()

*/

public class CAvion extends Thread
{
  private String nombre = null;
  private int numero = 0;
  private static CTorreControl TorreControl = null;
  private static CPermiso Permiso = null;  //semáforo       
  
  //Constructor inicial que pasa como parámetros un objeto tc de la TorreControl y el semáforo
  //de sincronización per.
  
  public CAvion(CTorreControl tc, CPermiso per)
  {
    nombre = new String ("Sin nombre");
    numero = 0;
    TorreControl = tc;
    Permiso = per;
  }
  
  //Constructor inicial que pasa como parámetros un objeto de la CTorreControl, el semáforo de
  //sincronización per, el número del avión y el nombre del mismo.
  
  public CAvion(CTorreControl tc, String nomAvion, int num, CPermiso per)
  {
    nombre = nomAvion;
    numero = num;
    TorreControl = tc;
    Permiso = per;
  }
  
  //Hilo infinito para que el avión esté en funcionamiento permanentemente.
  
  public void run()
  {
    boolean admision = false;        
    while(true)
    {    
      do
      {
        //El avión llama a la torre de control para que le sea adjudicada una pista.
        try
        {
          sleep ((int) (Math.random ()*1000 + Math.random ()*1000));      
        }
        catch(InterruptedException e){}
        admision = Permiso.permisoAterrizar();
      }while (!admision);
 
      TorreControl.iniciarKm(numero);  //distancia = 0.
      TorreControl.obtenerPrioridad(numero,0);  //La torre le asignará una prioridad en breve.    
      TorreControl.avionEnTierra(numero);
    
      //Avisa a la torre de control de que va a despegar y por tanto, liberar la pista.

      try
      {
        // El avión está descargando y cargando pasajeros.
        sleep ((int) (5000 + Math.random ()*1000 + Math.random ()*1000));
      }
      catch (InterruptedException e){}

      //La torre de control asigna una prioridad al avión de manera aleatoria.
      asignarPrioridad();
      
      //Almacenamos el valor de la prioridad para poder visualizarla de manera cómoda.
      TorreControl.obtenerPrioridad(numero,recuperarPrioridad());      
            
      //El avion abandona el aeropuerto.
      Permiso.permisoDespegar();
    
      TorreControl.avionEnAire(numero);
     
      //Los aviones empiezan a volar.
      while (!TorreControl.finTrayecto(numero))
      {
        //El avión va avanzando poco a poco.
        TorreControl.avanza (numero);
        try
        {
          //Todos los aviones irán avanzando al mismo tiempo.
          sleep ((int) (Math.random ()*1000 + Math.random ()*1000));
        }
        catch (InterruptedException e){}
      }                     
    }
  }
        
  //método que devuelve el nombre del avión.
    
  public String obtenerNombre()
  {
    return nombre;
  }

  //Método que se utiliza para asignar la prioridad del hilo.
  
  public void asignarPrioridad()
  {
    Random aleatorio = new Random();      
    try
    {
      setPriority(aleatorio.nextInt(11));
    }
    catch (SecurityException e){}
    catch (IllegalArgumentException e){}  
  }  

  //Método de recuperación de datos.

  public int recuperarPrioridad()
  {
    return getPriority();
  }   
}