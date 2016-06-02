/////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CArbolBinB<T>. Redefine
// los métodos: comparar y procesar.
//
public class CArbolBinarioDeBusqueda extends CArbolBinB<CDatos>
{
  // Permite comparar dos nodos del árbol por el atributo
  // nombre.
  public int comparar(CDatos obj1, CDatos obj2)
  {
    String str1 = new String(obj1.obtenerNombre());
    String str2 = new String(obj2.obtenerNombre());
    return str1.compareTo(str2);
  }
  
  // Permite mostrar los datos del nodo visitado.
  public void procesar(CDatos obj)
  {
    String nombre = new String(obj.obtenerNombre());
    double nota = obj.obtenerNota();
    System.out.println(nombre + "  " + nota);
  }
}
/////////////////////////////////////////////////////////////////
