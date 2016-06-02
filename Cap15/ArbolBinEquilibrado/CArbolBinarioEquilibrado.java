/////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CArbolBinE<T>. Redefine
// los m�todos: leerDatos, comparar y procesar.
//
public class CArbolBinarioEquilibrado extends CArbolBinE<CDatos>
{
  // Leer los datos que ser�n referenciados por un nodo del �rbol.
  public CDatos leerDatos()
  {
    String nombre;
    double nota;
    System.out.print("nombre: "); nombre = Leer.dato();
    System.out.print("nota:   "); nota = Leer.datoDouble();
    return new CDatos(nombre, nota);
  }
  
  // Permite comparar dos nodos del �rbol por el atributo nombre.
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
