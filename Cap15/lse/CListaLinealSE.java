//////////////////////////////////////////////////////////////////
// Lista lineal simplemente enlazada
//
public class CListaLinealSE
{
  // p: referencia al primer elemento de la lista
  private CElemento p = null;
  private int nElementos = 0; // número de elementos de la lista

  // Elemento de una lista lineal simplemente enlazada
  private class CElemento
  {
    // Atributos
    private double dato;
    private CElemento siguiente; // siguiente elemento
    // Métodos
    private CElemento() {} // constructor
  }

  public CListaLinealSE() {} // constructor
  
  public int tamaño()
  {
    return nElementos;
  }

  // Añadir un elemento al principio de la lista
  public void añadirAlPrincipio(double n)
  {
    CElemento q = new CElemento();
    q.dato = n;      // asignación de valores
    q.siguiente = p; // reasignación de referencias
    p = q;
    nElementos++;
  }
  
  public Double obtener(int i)
  {
    if (p == null)
    {
      System.err.println("lista vacía");
      return null;
    }
    
    CElemento q = p; // referencia al primer elemento
    if (i >= 0)
    {
      // Posicionarse en el elemento i
      for (int n = 0; q != null && n < i; n++)
        q = q.siguiente;
      // Retornar el dato
      if (q != null) return q.dato;
    }
    // Índice fuera de límites
    return null;
  }
}
//////////////////////////////////////////////////////////////////
