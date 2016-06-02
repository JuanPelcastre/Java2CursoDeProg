import java.io.*;
/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con matrices de objetos
//
public class Test
{
  // Definir un flujo de caracteres de entrada: flujoE
  private static InputStreamReader isr = new InputStreamReader(System.in);
  private static BufferedReader flujoE = new BufferedReader(isr);
  // Definir una referencia al flujo estándar de salida: flujoS
  private static PrintStream flujoS = System.out;
  private static int pos = -1;
  private static String cadenabuscar = null;
  
  public static int menú()
  {
    System.out.print("\n\n");
    System.out.println("1. Buscar");
    System.out.println("2. Buscar siguiente");
    System.out.println("3. Añadir");
    System.out.println("4. Eliminar");
    System.out.println("5. Salir");
    System.out.println();
    System.out.print("   Opción: ");
    int op;
    do
      op = Leer.datoInt();
    while (op < 1 || op > 5);
    return op;
  }
  
  public static void buscar(CListaTfnos listatfnos, boolean buscar_siguiente)
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
  
  public static void añadir(CListaTfnos listatfnos)
  {
    try
    {
      String nombre, dirección;
      long teléfono;
      flujoS.print("nombre:    "); nombre = flujoE.readLine();
      flujoS.print("dirección: "); dirección = flujoE.readLine();
      flujoS.print("teléfono:  "); teléfono = Leer.datoLong();
      listatfnos.añadir(new CPersona(nombre, dirección, teléfono));
    }
    catch (IOException ignorada)
    {}
  }
  
  public static void eliminar(CListaTfnos listatfnos)
  {
    long teléfono;
    boolean eliminado = false;
    flujoS.print("teléfono: "); teléfono = Leer.datoLong();
    eliminado = listatfnos.eliminar(teléfono);
    if (eliminado)
      flujoS.println("registro eliminado");
    else
      if (listatfnos.longitud() != 0)
        flujoS.println("teléfono no encontrado");
      else
        flujoS.println("lista vacía");
  }
  
  public static void main(String[] args)
  {
    // Crear un objeto lista de teléfonos vacío (con cero elementos)
    CListaTfnos listatfnos = new CListaTfnos();
    int opción = 0;
    do
    {
      opción = menú();
      try
      {
        switch (opción)
        {
          case 1: // buscar
            buscar(listatfnos, false);
            break;
            
          case 2: // buscar siguiente
            buscar(listatfnos, true);
            break;
            
          case 3: // añadir
            añadir(listatfnos);
            break;
            
          case 4: // eliminar
            eliminar(listatfnos);
            break;
          case 5: // salir
            listatfnos = null;
        }
      }
      catch(IndexOutOfBoundsException e)
      {
        System.out.println("Error: índice fuera de límites");
      }
    }
    while(opción != 5);
  }
}
