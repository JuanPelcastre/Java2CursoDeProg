//////////////////////////////////////////////////////////////////
// Lista lineal simplemente enlazada
//
public class CListaLinealSE<T>
{
  // Elemento de una lista lineal simplemente enlazada
  private class CElemento
  {
    // Atributos
    private T datos;
    private CElemento siguiente; // siguiente elemento
    // M�todos
    private CElemento() {} // constructor
    private CElemento(T d, CElemento s) // constructor
    {
      datos = d;
      siguiente = s;
    }
  }

  // p: referencia al primer elemento de la lista.
  // Es el elemento de cabecera.
  private CElemento p = null;
  private int nElementos = 0; // n�mero de elementos de la lista

  public CListaLinealSE() {} // constructor
  
  public int tama�o()
  {
    return nElementos;
  }
  
  public boolean a�adir(int i, T obj)
  {
    // A�adir un elemento en la posici�n i
    if (i > nElementos || i < 0)
    {
      System.err.println("�ndice fuera de l�mites");
      return false;
    }
    
    // Crear el elemento a a�adir
    CElemento q = new CElemento(obj, null);
    
    // Si la lista referenciada por p est� vac�a, a�adirlo sin m�s 
    if (nElementos == 0)
    {
      // A�adir el primer elemento
      p = q;
      nElementos++;
      return true;
    }
    
    // Si la lista no est� vac�a, encontrar el punto de inserci�n
    CElemento elemAnterior = p;
    CElemento elemActual = p;
    // Posicionarse en el elemento i
    for (int n = 0; n < i; n++)
    {
      elemAnterior = elemActual;
      elemActual = elemActual.siguiente;
    }
    // Dos casos:
    // 1) Insertar al principio de la lista
    // 2) Insertar despu�s del anterior (incluye insertar al final)


    // Como ejercicio, complete el c�digo seg�n se explica en el libro


    nElementos++;
    return true;
  }
  
  public boolean a�adirAlPrincipio(T obj)
  {
    // A�adir un elemento al principio
    return a�adir(0, obj);
  }
  
  public boolean a�adirAlFinal(T obj)
  {
    // A�adir un elemento al final
    return a�adir(tama�o(), obj);
  }
  
  public T borrar(int i)
  {
    // Borrar el elemento de la posici�n i
    if (i >= nElementos || i < 0)
      return null;
    
    // Entrar en la lista y encontrar el �ndice del elemento
    CElemento elemAnterior = p;
    CElemento elemActual = p;
    // Posicionarse en el elemento i
    for (int n = 0; n < i; n++)
    {
      elemAnterior = elemActual;
      elemActual = elemActual.siguiente;
    }
    // Dos casos:
    // 1) Borrar el primer elemento de la lista
    // 2) Borrar el siguiente a elemAnterior (elemActual)
    if ( elemActual == p ) // 1)
      p = p.siguiente; // cabecera
    else // 2)
      elemAnterior.siguiente = elemActual.siguiente;

    nElementos--;
    return elemActual.datos; // retornar el elemento borrado.
    
    // El elemento referenciado por elemActual ser� enviado a la
    // basura (borrado) al quedar desreferenciado, por ser
    // elemActual una variable local.
  }
  
  public T borrarPrimero()
  {
    // Borrar el primer elemento
    return borrar(0);
  }
  
  public T borrar�ltimo()
  {
    // Borrar el �ltimo elemento
    return borrar(nElementos - 1);
  }
  
  public T obtener(int i)
  {
    // Obtener el elemento de la posici�n i
    if (i >= nElementos || i < 0)
      return null;
    
    CElemento q = p; // referencia al primer elemento
    // Posicionarse en el elemento i
    for (int n = 0; n < i; n++)
      q = q.siguiente;
    
    // Retornar los datos
    return q.datos;
  }

  public T obtenerPrimero()
  {
    // Retornar el primer elemento
    return obtener(0);
  }
  
  public T obtener�ltimo()
  {
    // Retornar el �ltimo elemento
    return obtener(nElementos - 1);
  }
}
//////////////////////////////////////////////////////////////////
