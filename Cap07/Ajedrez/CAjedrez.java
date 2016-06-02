public class CAjedrez
{
  // Imprimir un tablero de ajedrez.
  public static void main(String[] args)
  {
    java.util.Scanner Leer = new java.util.Scanner(System.in);
    int falfil, calfil; // posición inicial del alfil
    int fila, columna;  // posición actual del alfil
    
    System.out.println("Posición del alfil:");
    System.out.print("  fila    "); falfil = Leer.nextInt();
    System.out.print("  columna "); calfil = Leer.nextInt();
    System.out.println(); // dejar una línea en blanco
    
    // Pintar el tablero de ajedrez
    for (fila = 1; fila <= 8; fila++)
    {
      for (columna = 1; columna <= 8; columna++)
      {

        // Como ejercicio, complete el código según se explica en el libro

      }
      System.out.println(); // cambiar de fila
    }
  }
}
