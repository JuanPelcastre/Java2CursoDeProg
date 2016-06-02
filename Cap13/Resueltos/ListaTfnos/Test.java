import java.io.*;
/////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con matrices de objetos
//
public class Test
{
  // Definir un flujo de caracteres de entrada: flujoE
  private static InputStreamReader isr = new InputStreamReader(System.in);
  private static BufferedReader flujoE = new BufferedReader(isr);
  // Definir una referencia al flujo est�ndar de salida: flujoS
  private static PrintStream flujoS = System.out;
  private static int pos = -1;
  private static String cadenabuscar = null;
  
  public static int men�()
  {
    System.out.print("\n\n");
    System.out.println("1. Buscar");
    System.out.println("2. Buscar siguiente");
    System.out.println("3. A�adir");
    System.out.println("4. Eliminar");
    System.out.println("5. Salir");
    System.out.println();
    System.out.print("   Opci�n: ");
    int op;
    do
      op = Leer.datoInt();
    while (op < 1 || op > 5);
    return op;
  }
  
  public static void buscar(CListaTfnos listatfnos, boolean buscar_siguiente)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public static void a�adir(CListaTfnos listatfnos)
  {
    try
    {
      String nombre, direcci�n;
      long tel�fono;
      flujoS.print("nombre:    "); nombre = flujoE.readLine();
      flujoS.print("direcci�n: "); direcci�n = flujoE.readLine();
      flujoS.print("tel�fono:  "); tel�fono = Leer.datoLong();
      listatfnos.a�adir(new CPersona(nombre, direcci�n, tel�fono));
    }
    catch (IOException ignorada)
    {}
  }
  
  public static void eliminar(CListaTfnos listatfnos)
  {
    long tel�fono;
    boolean eliminado = false;
    flujoS.print("tel�fono: "); tel�fono = Leer.datoLong();
    eliminado = listatfnos.eliminar(tel�fono);
    if (eliminado)
      flujoS.println("registro eliminado");
    else
      if (listatfnos.longitud() != 0)
        flujoS.println("tel�fono no encontrado");
      else
        flujoS.println("lista vac�a");
  }
  
  public static void main(String[] args)
  {
    // Crear un objeto lista de tel�fonos vac�o (con cero elementos)
    CListaTfnos listatfnos = new CListaTfnos();
    int opci�n = 0;
    do
    {
      opci�n = men�();
      try
      {
        switch (opci�n)
        {
          case 1: // buscar
            buscar(listatfnos, false);
            break;
            
          case 2: // buscar siguiente
            buscar(listatfnos, true);
            break;
            
          case 3: // a�adir
            a�adir(listatfnos);
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
        System.out.println("Error: �ndice fuera de l�mites");
      }
    }
    while(opci�n != 5);
  }
}
