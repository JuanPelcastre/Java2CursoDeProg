/////////////////////////////////////////////////////////////////
// Clase abstracta: árbol binario perfectamente equilibrado.
// Para utilizar los métodos proporcionados por esta clase,
// tendremos que crear una subclase de ella y redefinir los
// métodos: leerDatos, comparar y procesar.
//
public abstract class CArbolBinE<T>
{
  // Atributos del árbol binario
  protected CNodo raíz = null; // raíz del árbol
  
  // Nodo de un árbol binario
  private class CNodo
  {
    // Atributos
    private T datos;           // referencia a los datos
    private CNodo izquierdo;   // raíz del subárbol izquierdo
    private CNodo derecho;     // raíz del subárbol derecho
    
    // Métodos
    public CNodo() {}          // constructor
  }
  
  // Métodos del árbol binario
  public CArbolBinE() {}       // constructor
  
  // El método siguiente debe ser redefinido en la subclase para
  // que permita leer los datos que serán referenciados por un
  // nodo del árbol. Devuelve el objeto de datos.
  public abstract T leerDatos();
  
  // El método siguiente debe ser redefinido en una subclase para
  // que permita comparar dos nodos del árbol por el atributo
  // que necesitemos en cada momento.
  public abstract int comparar(T obj1, T obj2);
  
  // El método siguiente debe ser redefinido en la subclase para
  // que permita especificar las operaciones que se deseen
  // realizar con el nodo visitado.
  public abstract void procesar(T obj);
  
  private CNodo construirArbol(int n)
  {

    // Como ejercicio, complete el código según se explica en el libro

  }

  public void construirArbolEquilibrado(int n)
  {
    raíz = construirArbol(n);
  }
  
  public T buscar(T obj)
  {
    int[] pos = {0};
    return buscar(obj, pos);
  }
  
  public T buscar(T obj, int[] posición)
  {
    Object[] datos = {null};
    int[] pos_ini = {0};
    buscar(obj, raíz, datos, posición, pos_ini);
    return (T)datos[0];
  }
  
  private void buscar(T obj, CNodo r, Object[] datos, int[] pos, int[] i)
  {
    // El método buscar permite acceder a un determinado nodo.
    // Si los datos especificados por "obj" se localizan en el
    // árbol referenciado por "r" a partir de la posición "pos[0]",
    // "buscar" devuelve en datos[0] la referencia a esos datos;
    // en otro caso, devuelve null (valor inicial). 
    // Los nodos se consideran numerados (0, 1, 2, ...) según
    // el orden en el que son accedidos por el método "inorden".
    CNodo actual = r;
    if ( actual != null && datos[0] == null )
    {
      buscar(obj, actual.izquierdo, datos, pos, i);
      if (datos[0] == null && pos[0]-- <= 0)
        // La primera condición que aparece en el if anterior es
        // necesaria para que una vez encontrado el nodo no se
        // decremente "pos" en el camino de retorno por la pila de
        // llamadas.
        if ( comparar( obj, actual.datos ) == 0 )
        {
          datos[0] = actual.datos;  // nodo encontrado
          pos[0] = i[0];
        }
      i[0]++; // posición del siguiente nodo que será accedido
      buscar(obj, actual.derecho, datos, pos, i);
    }
  }
  
  public void inorden(CNodo r, boolean nodoRaíz)
  {
    // El método recursivo inorden visita los nodos del árbol
    // utilizando la forma inorden; esto es, primero se visita
    // el subárbol izquierdo, después se visita la raíz, y por
    // último, el subárbol derecho.
    // Si el segundo argumento es true, la visita comienza
    // en la raíz independientemente del primer argumento.
    // "i" es la posición del nodo en proceso.
    // "pos" devuelve la posición del nodo encontrado.    
    CNodo actual = null;

    if ( nodoRaíz )
      actual = raíz; // partir de la raíz
    else
      actual = r;   // partir de un nodo cualquiera
    if ( actual != null )
    {
      inorden( actual.izquierdo, false ); // visitar subárbol izq.
      // Procesar los datos del nodo visitado
      procesar( actual.datos );
      inorden( actual.derecho, false ); // visitar subárbol dcho.
    }
  }
  
  public void inorden()
  {
    // Si el segundo argumento es true, la visita comienza
    // en la raíz independientemente del primer argumento.
    inorden(null, true);
  }
}
/////////////////////////////////////////////////////////////////
