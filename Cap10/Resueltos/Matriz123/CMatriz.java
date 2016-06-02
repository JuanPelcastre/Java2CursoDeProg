//////////////////////////////////////////////////////////////////
// Matriz multidimensional basada en una unidimensional
//
public class CMatriz
{
  private double[] matriz;   // matriz unidimensional
  private int nDims;         // n�mero de dimensiones
  private int[] dimsMatriz;  // valor de cada dimensi�n
  
  private void construir( int[] dim )
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }

  public CMatriz( int... d ) // constructor
  {
    int[] dim = null;
    if (d.length == 0) dim = new int[] { 10 }; // dimensi�n por omisi�n
    if (d.length > 0) dim = new int[d.length];
    for (int i = 0; i < dim.length; ++i)
      dim[i] = d[i];
    construir( dim );
  }

  public int totalElementos()
  {
    int i;
    int nTElementos = 1;
    // Calcular el n�mero total de elementos de la matriz
    for ( i = 0; i < nDims; i++ )
      nTElementos *= dimsMatriz[i];

    return nTElementos;
  }

  public int desplazamiento( int[] subind )
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }

  public void asignarDato( double dato, int... in )
  {
    // Asignar un valor al elemento especificado de la matriz
    int subind[] = { 0, 0, 0 };
    for (int i = 0; i < in.length; i++)
    {
      subind[i] = in[i];
    }
    int i = desplazamiento( subind );
    if ( i == -1 ) System.exit(-1); // sub�ndice fuera de rango
    matriz[i] = dato;
  }
  
  public double obtenerDato( int... in )
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
}
//////////////////////////////////////////////////////////////////
