//////////////////////////////////////////////////////////////////
// Lista lineal circular simplemente enlazada
//
public class CListaCircularSE<T>
{
  // Elemento de una lista lineal circular simplemente enlazada
  private class CElemento
  {
    // Atributos
    private T datos;        // referencia a los datos
    private CElemento siguiente; // siguiente elemento
    
    // Métodos
    private CElemento() {} // constructor
    
    private CElemento(T d, CElemento s) // constructor
    {
      datos = d;
      siguiente = s;
    }
  }

  // último: referencia el último elemento.
  // último.siguiente referencia al primer elemento de la lista.
  private CElemento último = null;
  private int nElementos = 0; // número de elementos de la lista

  public CListaCircularSE() {} // constructor
  
  public int tamaño()
  {
    return nElementos;
  }

  public void añadirAlPrincipio(T obj)
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
  
  public void añadirAlFinal(T obj)
  {
    // Añade un elemento al final de la lista.
    // Por lo tanto, último referenciará este nuevo elemento.
    // Crear el nuevo elemento.
    CElemento q = new CElemento(obj, null);
      
    if( último != null ) // existe una lista
    {       
      q.siguiente = último.siguiente;
      último = último.siguiente =  q;
    }      
    else  // inserción del primer elemento
    {
      último = q;
      último.siguiente = q;
    }
    nElementos++;
  }
  
  public T borrar()
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
  
  public T obtener(int i)
  {
    // Obtener el elemento de la posición i
    if (i >= nElementos || i < 0)
      return null;
    
    CElemento q = último.siguiente; // primer elemento
    // Posicionarse en el elemento i
    for (int n = 0; n < i; n++)
      q = q.siguiente;
    
    // Retornar los datos
    return q.datos;
  }
}
//////////////////////////////////////////////////////////////////
