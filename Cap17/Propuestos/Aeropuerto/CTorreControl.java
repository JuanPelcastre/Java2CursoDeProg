/*

  CLASE: CTorreControl
  
  DESCRIPCI�N: La clase CTorreControl que contiene toda la informaci�n acerca del aeropuerto y
               de la flota a�rea. Se utiliza para inicializar el aeropuerto y para obtener
               informaci�n acerca de la situaci�n de cada avi�n.
  
  VARIABLES: private int numeroAviones {n�mero total de aviones}
             private int numeroPistas {n�mero total de pistas}
             private int [] distanciaRecorrida {Distancia recorrida por cada uno de los aviones}
             private String[] dest {destinos por defecto}
             private int [] distanciaDestino {distancia de cada destino}
             private CDestino[] Destino {Array de objetos de la clase CDestino}
             private boolean[] controlAviones {Array de booleanos}
             private int[] PrioridadAvion; {Array de enteros} 
             

  M�TODOS:
    - CONSTRUCTOR: public CTorreControl()
                   public CTorreControl (int nAviones)
                   public CTorreControl (int nAviones, int nPistas)

    public int numPistas()
    public boolean finTrayecto(int num)
    public void avanza (int num)
    public int obtenerFlota()
    public int disRecorrida (int navion)
    public void iniciarKm (int navion)
    public void avionEnTierra(int navion)
    public void avionEnAire(int navion)
    public boolean controlAereo(int navion)
    public String destinoAvion(int navion)
    public void obtenerPrioridad(int num, int prioridad)
    public int mostrarPrioridad(int navion)
                  
*/

public class CTorreControl
{
  // Atributos
  
  // N�mero de aviones y n�mero de pistas.
  private int numeroAviones = 0;
  private int numeroPistas = 0;
  
  // Distancia recorrida por cada uno de los aviones.
  private int [] distanciaRecorrida;

  // Destinos posibles desde ese aeropuerto.
  private String[] dest = {"Barcelona    ", "Par�s        ", "New York     ", "San Francisco",
                           "Munich       ", "Santo Domingo", "A Coru�a     ", "Roma         ",
                           "Amsterdam    ", "Londres      ", "Sevilla     ", "Los Angeles "};
  
  // Las distancias se miden en "unidades".
  private int [] distanciaDestino = {15, 25, 65, 80, 50, 55, 20, 35, 45, 35, 17, 75};
    
  private CDestino[] Destino;
  
  private boolean[] controlAviones;  //Array para saber la situaci�n de los aviones.

  private int[] PrioridadAvion;  //Array para saber la prioridad de cada avi�n.
  
  //M�todos
  
  // Constructores. Inicializa los atributos.
  
  // Constructor sin parametros. Inicializa a 12 aviones
  // y a destinos introducidos por defecto.
  public CTorreControl()
  {
    numeroAviones = 12;
    numeroPistas = 4;

    Destino = new CDestino[numeroAviones];
    controlAviones = new boolean[numeroAviones];
    PrioridadAvion = new int[numeroAviones];
    
    for (int i = 0; i < numeroAviones; i++)
    {
      controlAviones[i] = false;
      Destino[i] = new CDestino();
      Destino[i].asignarDestino(dest[i], distanciaDestino[i]);
    }
    
    distanciaRecorrida = new int [numeroAviones];  
    // Inicializacion de la matriz de aviones.
    // Todos inicialmente a 0, en tierra.
    for (int i = 0; i < numeroAviones; i++)
      distanciaRecorrida[i] = 0;  // no han recorrido ninguna distancia.
  }
  
  // Constructor con un parametro. Inicializa a nAviones
  // y a destinos introducidos por defecto.
  public CTorreControl (int nAviones)
  {
    numeroAviones = nAviones;
    numeroPistas = 4;

    Destino = new CDestino[numeroAviones];
    controlAviones = new boolean[numeroAviones];
    PrioridadAvion = new int[numeroAviones];
    
    for (int i = 0; i < numeroAviones; i++)
    {
      controlAviones[i] = false;
      Destino[i] = new CDestino();
      Destino[i].asignarDestino(dest[i], distanciaDestino[i]);
    }

    distanciaRecorrida = new int [numeroAviones];  
    // Inicializacion de la matriz de aviones.
    // Todos inicialmente a 0.
    for (int i = 0; i < numeroAviones; i++)
      distanciaRecorrida[i] = 0;
  }

  // Constructor con dos parametros. Inicializa a nAviones y nPistas
  // y a destinos introducidos por defecto.  
  public CTorreControl (int nAviones, int nPistas)
  {
    numeroAviones = nAviones;
    numeroPistas = nPistas;

    Destino = new CDestino[numeroAviones];
    controlAviones = new boolean[numeroAviones];
    PrioridadAvion = new int[numeroAviones];
    
    for (int i = 0; i < numeroAviones; i++)
    {
      controlAviones[i] = false;
      Destino[i] = new CDestino();
      Destino[i].asignarDestino(dest[i], distanciaDestino[i]);
    }

    distanciaRecorrida = new int [numeroAviones];  
    // Inicializacion de la matriz de aviones.
    // Todos inicialmente a 0.
    for (int i = 0; i < numeroAviones; i++)
      distanciaRecorrida[i] = 0;
  }
    
  public int numPistas()
  {
    return numeroPistas;
  }  

  // devuelve true si un avi�n ha llegado a su destino.
  public boolean finTrayecto(int num)
  {
    if (distanciaRecorrida[num] >= Destino[num].obtenerDistancia())
      return true;
    return false;
  }
  
  // aumenta en 1 la distancia recorrida por el avi�n.
  public void avanza (int num)
  {
    distanciaRecorrida [num]++;
  }
  
  //M�todo para obtener la flota de aviones con la que trabaja el aeropuerto.

  public int obtenerFlota()
  {
    return numeroAviones;
  }    

  //M�todo para obtener la distancia recorrida por el avi�n en un momento determinado.

  public int disRecorrida (int navion)
  {
    return distanciaRecorrida [navion];
  }

  //M�todo que reinicia la distancia recorrida por un avi�n a 0.
  
  public void iniciarKm (int navion)
  {
    distanciaRecorrida[navion] = 0;
  }

  //M�todo que asigna true cuando el avi�n est� en tierra.

  public void avionEnTierra(int navion)
  {
    controlAviones[navion] = true;
  }

  //M�todo que asigna false cuando el avi�n est� en el aire.

  public void avionEnAire(int navion)
  {
    controlAviones[navion] = false;
  }

  //M�todo que devuelve el estado actual de un avi�n(en tierra o en aire)
  
  public boolean controlAereo(int navion)
  {
    return controlAviones[navion];
  }

  //M�todo que devuelve el nombre del destino al que el avi�n se dirige.
  
  public String destinoAvion(int navion)
  {
    return Destino[navion].obtenerNombre();
  }

  //M�todo que guarda el valor de la prioridad asginada a un avi�n para despu�s visualizarla.
  
  public void obtenerPrioridad(int num, int prioridad)
  {
    PrioridadAvion[num] = prioridad;
  }

  //M�todo de recuperaci�n de datos.
  
  public int mostrarPrioridad(int navion)
  {
    return PrioridadAvion[navion];
  }
}
