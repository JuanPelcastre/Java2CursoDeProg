import java.util.*;

/*

  CLASE: CAvion
  
  DESCRIPCI�N: La clase CAvion se necesita cada vez que queremos utilizar un nuevo avi�n,
               un nuevo hilo. Se compone de dos constructores, de un m�todo run y de un m�todo
               para obtener el nombre del avi�n. La clase CAvion contiene toda la informaci�n
               acerca del vuelo de un avi�n.

  VARIABLES: private String nombre;  {nombre del avi�n}
             private int numero;  {n�mero del hilo}
             private CTorreControl TorreControl;  {Objeto de la clase CTorreControl}
             private CPermiso Permiso;  {Objeto de la clase CPermiso}

  M�TODOS:
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
  private static CPermiso Permiso = null;  //sem�foro       
  
  //Constructor inicial que pasa como par�metros un objeto tc de la TorreControl y el sem�foro
  //de sincronizaci�n per.
  
  public CAvion(CTorreControl tc, CPermiso per)
  {
    nombre = new String ("Sin nombre");
    numero = 0;
    TorreControl = tc;
    Permiso = per;
  }
  
  //Constructor inicial que pasa como par�metros un objeto de la CTorreControl, el sem�foro de
  //sincronizaci�n per, el n�mero del avi�n y el nombre del mismo.
  
  public CAvion(CTorreControl tc, String nomAvion, int num, CPermiso per)
  {
    nombre = nomAvion;
    numero = num;
    TorreControl = tc;
    Permiso = per;
  }
  
  //Hilo infinito para que el avi�n est� en funcionamiento permanentemente.
  
  public void run()
  {
    boolean admision = false;        
    while(true)
    {    
      do
      {
        //El avi�n llama a la torre de control para que le sea adjudicada una pista.
        try
        {
          sleep ((int) (Math.random ()*1000 + Math.random ()*1000));      
        }
        catch(InterruptedException e){}
        admision = Permiso.permisoAterrizar();
      }while (!admision);
 
      TorreControl.iniciarKm(numero);  //distancia = 0.
      TorreControl.obtenerPrioridad(numero,0);  //La torre le asignar� una prioridad en breve.    
      TorreControl.avionEnTierra(numero);
    
      //Avisa a la torre de control de que va a despegar y por tanto, liberar la pista.

      try
      {
        // El avi�n est� descargando y cargando pasajeros.
        sleep ((int) (5000 + Math.random ()*1000 + Math.random ()*1000));
      }
      catch (InterruptedException e){}

      //La torre de control asigna una prioridad al avi�n de manera aleatoria.
      asignarPrioridad();
      
      //Almacenamos el valor de la prioridad para poder visualizarla de manera c�moda.
      TorreControl.obtenerPrioridad(numero,recuperarPrioridad());      
            
      //El avion abandona el aeropuerto.
      Permiso.permisoDespegar();
    
      TorreControl.avionEnAire(numero);
     
      //Los aviones empiezan a volar.
      while (!TorreControl.finTrayecto(numero))
      {
        //El avi�n va avanzando poco a poco.
        TorreControl.avanza (numero);
        try
        {
          //Todos los aviones ir�n avanzando al mismo tiempo.
          sleep ((int) (Math.random ()*1000 + Math.random ()*1000));
        }
        catch (InterruptedException e){}
      }                     
    }
  }
        
  //m�todo que devuelve el nombre del avi�n.
    
  public String obtenerNombre()
  {
    return nombre;
  }

  //M�todo que se utiliza para asignar la prioridad del hilo.
  
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

  //M�todo de recuperaci�n de datos.

  public int recuperarPrioridad()
  {
    return getPriority();
  }   
}