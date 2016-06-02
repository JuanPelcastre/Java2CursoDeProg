//////////////////////////////////////////////////////////////////
// Crear una lista lineal simplemente enlazada
//
public class Test
{
  public static void main(String[] args)
  {
    // Crear una lista lineal vac�a
    CListaLinealSE lse = new CListaLinealSE();
    
    // Leer datos reales y a�adirlos a la lista
    Double n;

    System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
    System.out.print("dato: ");
    while ((n = Leer.datoDouble()) != null)
    {
      lse.a�adirAlPrincipio(n);
      System.out.print("dato: ");
    }

    // Mostrar la lista de datos
    System.out.println();
    Double d;
    int tam = lse.tama�o();
    for (int i = 0; i < tam; i++)
    {
      d = lse.obtener(i);
      System.out.print(d + " ");
    }
  }
}
