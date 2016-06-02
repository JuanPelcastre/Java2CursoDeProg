/*

  CLASE: CDestino
  
  DESCRIPCI�N: la clase CDestino se compone de un constructor y de tres m�todos. Cada objeto de
               esta clase contendr� un nombre del destino y la distancia a la que se encuentra
               del aeropuerto.

  VARIABLES:   private String Nombre {Nombre del destino}
               private int Distancia {Distancia a la que se encuentra el destino}

  M�TODOS:
    - CONSTRUCTOR: public CDestino() 
    
    public void asignarDestino(String nomDest, int Dist)
    public int obtenerDistancia()
    public String obtenerNombre()
                  
*/

public class CDestino
{
  private String Nombre; //nombre del destino.
  private int Distancia; //distancia a la que se encuentra el destino.

    //Constructor de la clase. Inicializamos las variables.
    public CDestino()
    {
      Nombre = "Sin destino";
      Distancia = 0;
    }
  
    //Para cada objeto, se pasan el nombre del destino y la distancia a la que se encuentra.

    public void asignarDestino(String nomDest, int Dist)
    {
      Nombre = nomDest;
      Distancia = Dist;
    }
    
    //M�todo que devuelve la distancia a la que se encuentra el destino del aeropuerto.
    
    public int obtenerDistancia()
    {
      return Distancia;
    }

    //Nombre del destino.

    public String obtenerNombre()
    {
      return Nombre;
    }

}
