//////////////////////////////////////////////////////////////////
// Crear un �rbol binario perfectamente equilibrado de n nodos
//
public class Test
{
  public static void main(String[] args)
  {
    CArbolBinarioEquilibrado arbolbe = new CArbolBinarioEquilibrado();
    
    int n�meroDeNodos, pos[] = {0};
    System.out.print("N�mero de nodos: ");
    n�meroDeNodos = Leer.datoInt();
    arbolbe.construirArbolEquilibrado(n�meroDeNodos);
    System.out.println();
    
    // Buscar todas las ocurrencias de nombre
    String nombre;
    System.out.print("nombre a buscar: "); nombre = Leer.dato();
    CDatos objBuscar = new CDatos(nombre, 0);
    // Buscar la primera ocurrencia
    CDatos obj = arbolbe.buscar(objBuscar, pos);
    if ( obj == null ) System.out.println("La b�squeda fall�");
    while (obj != null)
    {
      System.out.println(pos[0] + ".- " + obj.obtenerNombre() +
                         "  " + obj.obtenerNota());
      // Buscar m�s ocurrencias con el mismo nombre
      pos[0]++;
      obj = arbolbe.buscar(objBuscar, pos);
    }
    
    // Mostrar los nodos del �rbol
    System.out.println("\nArbol:");
    arbolbe.inorden();
  }
}
