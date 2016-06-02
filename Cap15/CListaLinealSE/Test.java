//////////////////////////////////////////////////////////////////
// Crear una lista lineal simplemente enlazada
//
public class Test
{
  public static void mostrarLista(CListaLinealSE<CDatos> lse)
  {
    // Mostrar todos los elementos de la lista
    int i = 0, tam = lse.tamaño();
    CDatos obj;
    while (i < tam)
    {
      obj = lse.obtener(i);
      System.out.println(i + ".-  " + obj.obtenerNombre() + " " +
                         obj.obtenerNota());
      i++;
    }
  }
  
  public static void main(String[] args)
  {
    // Crear una lista lineal vacía
    CListaLinealSE<CDatos> lse = new CListaLinealSE<CDatos>();
    
    // Leer datos y añadirlos a la lista
    String nombre;
    double nota;
    int i = 0;
    System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
    System.out.print("nombre: ");
    while ((nombre = Leer.dato()) != null)
    {
      System.out.print("nota:   ");
      nota = Leer.datoDouble();
      lse.añadirAlFinal(new CDatos(nombre, nota));
      System.out.print("nombre: ");
    }

    // Añadir un objeto al principio
    lse.añadirAlPrincipio(new CDatos("abcd", 10));
    // Añadir un objeto en la posición 1
    lse.añadir(1, new CDatos("defg", 9.5));
        
    System.out.println("\n");
    // Mostrar el primero
    CDatos obj = lse.obtenerPrimero();
    System.out.println("Primero: " + obj.obtenerNombre() + " " +
                       obj.obtenerNota());
    
    // Mostrar el último
    obj = lse.obtenerÚltimo();
    System.out.println("Último:  " + obj.obtenerNombre() + " " +
                       obj.obtenerNota());
    
    // Mostrar todos
    System.out.println("Lista:");
    mostrarLista(lse);
    
    // Borrar el elemento de índice 2
    obj = lse.borrar(2);
    if (obj == null)
      System.out.println("Error: elemento no borrado");
    
    // Modificar el elemento de índice 1
    obj = lse.obtener(1);
    obj.asignarNota(9);
    
    // Mostrar todos
    System.out.println("Lista:");
    mostrarLista(lse);
  }
}
