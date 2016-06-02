public class Test
{
  public static int menú(String[] opciones)
  {
    int i;
    int opcion = 0;
    int numOpciones = opciones.length;
    
    System.out.println("\n\n__________________________________________\n");
    for (i = 1; i <= numOpciones; ++i)
      System.out.println("    " + i + ". " + opciones[i-1]);
    System.out.println("__________________________________________");
    do
    {
      System.out.print("\nOpción (1 - " + numOpciones + "): ");
      opcion = Leer.datoInt();
    }
    while (opcion < 1 || opcion > numOpciones);
    
    return opcion;
  }
  
  public static void main(String[] args)
  {
    // Opciones del menú
    String[] opciones =
    {
      "Leer un char",
      "Leer un short",
      "Leer un int",
      "Leer un float",
      "Leer un double",
      "Leer un string",
      "Salir"
    };
    
    boolean salir = false;
    
    do
    {
      switch (menú(opciones))
      {
        case 1:
          // ...
          break;
        // ...
        case 7:
          salir = true;
          break;
      }
    }
    while(!salir);
  }
}
