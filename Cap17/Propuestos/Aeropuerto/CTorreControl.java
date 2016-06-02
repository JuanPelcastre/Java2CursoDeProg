/*

  CLASE: CTorreControl
  
  DESCRIPCIÓN: La clase CTorreControl que contiene toda la información acerca del aeropuerto y
               de la flota aérea. Se utiliza para inicializar el aeropuerto y para obtener
               información acerca de la situación de cada avión.
  
  VARIABLES: private int numeroAviones {número total de aviones}
             private int numeroPistas {número total de pistas}
             private int [] distanciaRecorrida {Distancia recorrida por cada uno de los aviones}
             private String[] dest {destinos por defecto}
             private int [] distanciaDestino {distancia de cada destino}
             private CDestino[] Destino {Array de objetos de la clase CDestino}
             private boolean[] controlAviones {Array de booleanos}
             private int[] PrioridadAvion; {Array de enteros} 
             

  MÉTODOS:
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
  
  // Número de aviones y número de pistas.
  private int numeroAviones = 0;
  private int numeroPistas = 0;
  
  // Distancia recorrida por cada uno de los aviones.
  private int [] distanciaRecorrida;

  // Destinos posibles desde ese aeropuerto.
  private String[] dest = {"Barcelona    ", "París        ", "New York     ", "San Francisco",
                           "Munich       ", "Santo Domingo", "A Coruña     ", "Roma         ",
                           "Amsterdam    ", "Londres      ", "Sevilla     ", "Los Angeles "};
  
  // Las distancias se miden en "unidades".
  private int [] distanciaDestino = {15, 25, 65, 80, 50, 55, 20, 35, 45, 35, 17, 75};
    
  private CDestino[] Destino;
  
  private boolean[] controlAviones;  //Array para saber la situación de los aviones.

  private int[] PrioridadAvion;  //Array para saber la prioridad de cada avión.
  
  //Métodos
  
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

  // devuelve true si un avión ha llegado a su destino.
  public boolean finTrayecto(int num)
  {
    if (distanciaRecorrida[num] >= Destino[num].obtenerDistancia())
      return true;
    return false;
  }
  
  // aumenta en 1 la distancia recorrida por el avión.
  public void avanza (int num)
  {
    distanciaRecorrida [num]++;
  }
  
  //Método para obtener la flota de aviones con la que trabaja el aeropuerto.

  public int obtenerFlota()
  {
    return numeroAviones;
  }    

  //Método para obtener la distancia recorrida por el avión en un momento determinado.

  public int disRecorrida (int navion)
  {
    return distanciaRecorrida [navion];
  }

  //Método que reinicia la distancia recorrida por un avión a 0.
  
  public void iniciarKm (int navion)
  {
    distanciaRecorrida[navion] = 0;
  }

  //Método que asigna true cuando el avión está en tierra.

  public void avionEnTierra(int navion)
  {
    controlAviones[navion] = true;
  }

  //Método que asigna false cuando el avión está en el aire.

  public void avionEnAire(int navion)
  {
    controlAviones[navion] = false;
  }

  //Método que devuelve el estado actual de un avión(en tierra o en aire)
  
  public boolean controlAereo(int navion)
  {
    return controlAviones[navion];
  }

  //Método que devuelve el nombre del destino al que el avión se dirige.
  
  public String destinoAvion(int navion)
  {
    return Destino[navion].obtenerNombre();
  }

  //Método que guarda el valor de la prioridad asginada a un avión para después visualizarla.
  
  public void obtenerPrioridad(int num, int prioridad)
  {
    PrioridadAvion[num] = prioridad;
  }

  //Método de recuperación de datos.
  
  public int mostrarPrioridad(int navion)
  {
    return PrioridadAvion[navion];
  }
}
