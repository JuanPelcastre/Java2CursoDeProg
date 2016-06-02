/*

  CLASE: CPermiso
  
  DESCRIPCIÓN: La clase CPermiso representa un semáforo de sincronización de contador variable
               que consta de un constructor y de dos métodos para la sincronización de los
               hilos.

  VARIABLES:   private int numPistas {variable contador}
               private int maxPistas {variable que contiene el num total de pistas}


  MÉTODOS:
    - CONSTRUCTOR: CPermiso(int nPistas) 
    
    public synchronized boolean permisoAterrizar()
    public synchronized void permisoDespegar()
                  
*/

public class CPermiso
{
  private int numPistas = 0, maxPistas = 0;

  //Constructor que inicializa el contador.
  
  public CPermiso(int nPistas)
  {
    numPistas = nPistas;
    maxPistas = nPistas; //Se mantendrá constante.
  }

  //Simulación de la operación wait de un semáforo. Devuelve true o false.
  
  public synchronized boolean permisoAterrizar()
  {
    if (numPistas >= 0)   //Mientras haya pistas disponibles, la torre de control continuará
      numPistas--;        //cediendo pistas a los aviones.
    
    if (numPistas == -1)  //No hay pistas disponibles en ese momento.
    {
      numPistas++; // 0 pistas disponibles.
      while (true)
      {
        try
        {
          wait(); //Hilo a dormir.
          break;
        }
        catch (InterruptedException e)
        {
          if (numPistas >= 0) break; else continue;
        }
      }
      return false; //no hay pista disponible.
    }    
    else
      return true;  //pista concedida al avión que la solicitó.
  }

  //Simulación de la operación signal de un semáforo.
  
  public synchronized void permisoDespegar()
  {
    if (numPistas < maxPistas)
      numPistas++;  //Cuando un avión despega, una pista queda libre.
    
    notifyAll(); //Los hilos despiertan y "pelean" por la CPU
  }
}
