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
    
    // M�todos
    private CElemento() {} // constructor
    
    private CElemento(T d, CElemento s) // constructor
    {
      datos = d;
      siguiente = s;
    }
  }

  // �ltimo: referencia el �ltimo elemento.
  // �ltimo.siguiente referencia al primer elemento de la lista.
  private CElemento �ltimo = null;
  private int nElementos = 0; // n�mero de elementos de la lista

  public CListaCircularSE() {} // constructor
  
  public int tama�o()
  {
    return nElementos;
  }

  public void a�adirAlPrincipio(T obj)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public void a�adirAlFinal(T obj)
  {
    // A�ade un elemento al final de la lista.
    // Por lo tanto, �ltimo referenciar� este nuevo elemento.
    // Crear el nuevo elemento.
    CElemento q = new CElemento(obj, null);
      
    if( �ltimo != null ) // existe una lista
    {       
      q.siguiente = �ltimo.siguiente;
      �ltimo = �ltimo.siguiente =  q;
    }      
    else  // inserci�n del primer elemento
    {
      �ltimo = q;
      �ltimo.siguiente = q;
    }
    nElementos++;
  }
  
  public T borrar()
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public T obtener(int i)
  {
    // Obtener el elemento de la posici�n i
    if (i >= nElementos || i < 0)
      return null;
    
    CElemento q = �ltimo.siguiente; // primer elemento
    // Posicionarse en el elemento i
    for (int n = 0; n < i; n++)
      q = q.siguiente;
    
    // Retornar los datos
    return q.datos;
  }
}
//////////////////////////////////////////////////////////////////
