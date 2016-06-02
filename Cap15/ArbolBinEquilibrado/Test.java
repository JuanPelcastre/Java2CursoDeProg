//////////////////////////////////////////////////////////////////
// Crear un árbol binario perfectamente equilibrado de n nodos
//
public class Test
{
  public static void main(String[] args)
  {
    CArbolBinarioEquilibrado arbolbe = new CArbolBinarioEquilibrado();
    
    int númeroDeNodos, pos[] = {0};
    System.out.print("Número de nodos: ");
    númeroDeNodos = Leer.datoInt();
    arbolbe.construirArbolEquilibrado(númeroDeNodos);
    System.out.println();
    
    // Buscar todas las ocurrencias de nombre
    String nombre;
    System.out.print("nombre a buscar: "); nombre = Leer.dato();
    CDatos objBuscar = new CDatos(nombre, 0);
    // Buscar la primera ocurrencia
    CDatos obj = arbolbe.buscar(objBuscar, pos);
    if ( obj == null ) System.out.println("La búsqueda falló");
    while (obj != null)
    {
      System.out.println(pos[0] + ".- " + obj.obtenerNombre() +
                         "  " + obj.obtenerNota());
      // Buscar más ocurrencias con el mismo nombre
      pos[0]++;
      obj = arbolbe.buscar(objBuscar, pos);
    }
    
    // Mostrar los nodos del árbol
    System.out.println("\nArbol:");
    arbolbe.inorden();
  }
}
