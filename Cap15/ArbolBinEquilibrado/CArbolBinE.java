/////////////////////////////////////////////////////////////////
// Clase abstracta: �rbol binario perfectamente equilibrado.
// Para utilizar los m�todos proporcionados por esta clase,
// tendremos que crear una subclase de ella y redefinir los
// m�todos: leerDatos, comparar y procesar.
//
public abstract class CArbolBinE<T>
{
  // Atributos del �rbol binario
  protected CNodo ra�z = null; // ra�z del �rbol
  
  // Nodo de un �rbol binario
  private class CNodo
  {
    // Atributos
    private T datos;           // referencia a los datos
    private CNodo izquierdo;   // ra�z del sub�rbol izquierdo
    private CNodo derecho;     // ra�z del sub�rbol derecho
    
    // M�todos
    public CNodo() {}          // constructor
  }
  
  // M�todos del �rbol binario
  public CArbolBinE() {}       // constructor
  
  // El m�todo siguiente debe ser redefinido en la subclase para
  // que permita leer los datos que ser�n referenciados por un
  // nodo del �rbol. Devuelve el objeto de datos.
  public abstract T leerDatos();
  
  // El m�todo siguiente debe ser redefinido en una subclase para
  // que permita comparar dos nodos del �rbol por el atributo
  // que necesitemos en cada momento.
  public abstract int comparar(T obj1, T obj2);
  
  // El m�todo siguiente debe ser redefinido en la subclase para
  // que permita especificar las operaciones que se deseen
  // realizar con el nodo visitado.
  public abstract void procesar(T obj);
  
  private CNodo construirArbol(int n)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }

  public void construirArbolEquilibrado(int n)
  {
    ra�z = construirArbol(n);
  }
  
  public T buscar(T obj)
  {
    int[] pos = {0};
    return buscar(obj, pos);
  }
  
  public T buscar(T obj, int[] posici�n)
  {
    Object[] datos = {null};
    int[] pos_ini = {0};
    buscar(obj, ra�z, datos, posici�n, pos_ini);
    return (T)datos[0];
  }
  
  private void buscar(T obj, CNodo r, Object[] datos, int[] pos, int[] i)
  {
    // El m�todo buscar permite acceder a un determinado nodo.
    // Si los datos especificados por "obj" se localizan en el
    // �rbol referenciado por "r" a partir de la posici�n "pos[0]",
    // "buscar" devuelve en datos[0] la referencia a esos datos;
    // en otro caso, devuelve null (valor inicial). 
    // Los nodos se consideran numerados (0, 1, 2, ...) seg�n
    // el orden en el que son accedidos por el m�todo "inorden".
    CNodo actual = r;
    if ( actual != null && datos[0] == null )
    {
      buscar(obj, actual.izquierdo, datos, pos, i);
      if (datos[0] == null && pos[0]-- <= 0)
        // La primera condici�n que aparece en el if anterior es
        // necesaria para que una vez encontrado el nodo no se
        // decremente "pos" en el camino de retorno por la pila de
        // llamadas.
        if ( comparar( obj, actual.datos ) == 0 )
        {
          datos[0] = actual.datos;  // nodo encontrado
          pos[0] = i[0];
        }
      i[0]++; // posici�n del siguiente nodo que ser� accedido
      buscar(obj, actual.derecho, datos, pos, i);
    }
  }
  
  public void inorden(CNodo r, boolean nodoRa�z)
  {
    // El m�todo recursivo inorden visita los nodos del �rbol
    // utilizando la forma inorden; esto es, primero se visita
    // el sub�rbol izquierdo, despu�s se visita la ra�z, y por
    // �ltimo, el sub�rbol derecho.
    // Si el segundo argumento es true, la visita comienza
    // en la ra�z independientemente del primer argumento.
    // "i" es la posici�n del nodo en proceso.
    // "pos" devuelve la posici�n del nodo encontrado.    
    CNodo actual = null;

    if ( nodoRa�z )
      actual = ra�z; // partir de la ra�z
    else
      actual = r;   // partir de un nodo cualquiera
    if ( actual != null )
    {
      inorden( actual.izquierdo, false ); // visitar sub�rbol izq.
      // Procesar los datos del nodo visitado
      procesar( actual.datos );
      inorden( actual.derecho, false ); // visitar sub�rbol dcho.
    }
  }
  
  public void inorden()
  {
    // Si el segundo argumento es true, la visita comienza
    // en la ra�z independientemente del primer argumento.
    inorden(null, true);
  }
}
/////////////////////////////////////////////////////////////////
