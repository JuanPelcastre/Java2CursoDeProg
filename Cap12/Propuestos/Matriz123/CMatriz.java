import java.util.*;
//////////////////////////////////////////////////////////////////
// Matriz multidimensional basada en una unidimensional
//
public class CMatriz<T>
{
  private ArrayList<T> matriz;        // matriz unidimensional
  private int nDims;         // número de dimensiones
  private int[] dimsMatriz;  // valor de cada dimensión
  
  private void construir( int[] dim )
  {
    int i;

    for ( i = 0; i < dim.length; i++ )
      if ( dim[i] < 1 )
      {
        System.out.println("Dimensión nula o negativa");
        System.exit(-1);
      }
    // Establecer los atributos
    dimsMatriz = new int[dim.length];
    for ( i = 0; i < dim.length; i++ ) dimsMatriz[i] = dim[i];
    nDims = dim.length;
    matriz = new ArrayList<T>();
    for ( i = 0; i < totalElementos(); i++ )
      matriz.add(null);
  }

  public CMatriz( int... d ) // constructor
  {
    int[] dim = null;
    if (d.length == 0) dim = new int[] { 10 }; // dimensión por omisión
    if (d.length > 0) dim = new int[d.length];
    for (int i = 0; i < dim.length; ++i)
      dim[i] = d[i];
    construir( dim );
  }

  public int totalElementos()
  {
    int i;
    int nTElementos = 1;
    // Calcular el número total de elementos de la matriz
    for ( i = 0; i < nDims; i++ )
      nTElementos *= dimsMatriz[i];

    return nTElementos;
  }

  public int desplazamiento( int[] subind )
  {
    int i;
    int desplazamiento = 0;

    for ( i = 0; i < nDims; i++ )
    {
      // Verificar si los subíndices están dentro del rango
      if ( subind[i] < 0 || subind[i] > dimsMatriz[i] )
      {
        System.out.println("Subíndice fuera de rango");
        return -1;
      }
      // Desplazamiento equivalente en la matriz unidimensional
      desplazamiento += subind[i];
      if ( i+1 < nDims )
        desplazamiento *= dimsMatriz[i+1];
    }
    return desplazamiento;
  }

  public void asignarDato( T dato, int... in )
  {
    // Asignar un valor al elemento especificado de la matriz
    int subind[] = { 0, 0, 0 };
    for (int i = 0; i < in.length; i++)
    {
      subind[i] = in[i];
    }
    int i = desplazamiento( subind );
    if ( i == -1 ) System.exit(-1); // subíndice fuera de rango
    matriz.set(i, dato);
  }
  
  public T obtenerDato( int... in )
  {
    // Obtener el valor al elemento especificado de la matriz
    int subind[] = { 0, 0, 0 };
    for (int i = 0; i < in.length; i++)
    {
      subind[i] = in[i];
    }
    int i = desplazamiento( subind );
    if ( i == -1 ) System.exit(-1); // subíndice fuera de rango
    return matriz.get(i);
  }
}
//////////////////////////////////////////////////////////////////
