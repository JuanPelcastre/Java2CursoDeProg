/////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CArbolBinB<T>. Redefine
// los métodos: comparar y procesar.
//
public class CArbolBinarioDeBusqueda extends CArbolBinB<CDatos>
{
  public int totalPalabras = 0;
  public int totalPalabrasDiferentes = 0;

  // Permite comparar dos nodos del árbol por el atributo
  // palabra.
  public int comparar(CDatos obj1, CDatos obj2)
  {
    String str1 = new String(obj1.obtenerPalabra());
    String str2 = new String(obj2.obtenerPalabra());
    return str1.compareTo(str2);
  }
  
  // Permite mostrar los datos del nodo visitado.
  public void procesar(CDatos obj)
  {
    String palabra = new String(obj.obtenerPalabra());
    int contador = obj.obtenerContador();
    System.out.println(palabra + " = " + contador);
    totalPalabras += contador;
    totalPalabrasDiferentes++;
  }
}
/////////////////////////////////////////////////////////////////
