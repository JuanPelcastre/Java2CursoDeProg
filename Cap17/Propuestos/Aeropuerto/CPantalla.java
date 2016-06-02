/*

  CLASE: CPantalla
  
  DESCRIPCIÓN: La clase CPantalla se encarga de visualizar en pantalla el
               funcionamiento de los aviones.
  
  VARIABLES:  private CTorreControl TorreControl {objeto de tipo CTorreControl}

  MÉTODOS:
    - CONSTRUCTOR: public CPantalla(CTorreControl tc)
    
    public void run()
    public void refrescarPantalla()
                  
*/

public class CPantalla extends Thread
{
  private CTorreControl TorreControl = null;  //Objeto de la clase CTorreControl.
  
  // Constructor. Hacemos referencia a la Torre de Control que nos pasan
  // como argumento.

  public CPantalla(CTorreControl tc)
  {
    // referenciamos el tablon "tc" con "torre de control".
    TorreControl = tc;
  }

  // run del Thread.
  
  public void run()
  {    
    // ejecutar el refresco del marcador cada 500 milisegundos.
    while (true) {
      try {
        this.sleep (1500);
        refrescarPantalla();
      }
      catch (InterruptedException e) {}
    }
  }
  
  // Mostramos por pantalla el estado actual de los vuelos.
  
  public void refrescarPantalla()
  {
    System.out.println ("                              Mapa del trayecto");
    System.out.println ("-----------------------------------"
              + "---------------------------------");
    
    //Aviones en tierra.
    System.out.print("Los aviones que se encuentran en tierra:");
    for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      if(TorreControl.controlAereo(i))
        System.out.print("   "+i);

    //Aviones volando.
    System.out.print("\nLos aviones que se encuentran volando:");
    for (int i = 0; i < TorreControl.obtenerFlota(); i++)
      if(!TorreControl.controlAereo(i))
        System.out.print("   "+i);

    System.out.println ("\n-----------------------------------"
              + "---------------------------------");

    //recorremos la flota de aviones de uno en uno.
    for (int i = 0; i < TorreControl.obtenerFlota(); i++)
    {
      System.out.println("Aeronave "+i+" con destino a "+TorreControl.destinoAvion(i)
      +"                           prioridad: "+TorreControl.mostrarPrioridad(i)+".\n");
      //mostramos la distancia recorrida por cada uno.
      for (int j = 0; j < TorreControl.disRecorrida(i); j++)
        if (j != 0)
          System.out.print (".");
        System.out.println ("O\n");
        
    }
    System.out.println ("-----------------------------------"
              + "---------------------------------");
   }
}
