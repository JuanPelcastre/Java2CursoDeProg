public class CPitagoras
{
  // Teorema de Pit�goras
  public static void main(String[] args)
  {
    int x = 1, y = 1, z = 0;
    System.out.println("Z\t" + "X\t" + "Y");
    System.out.println("____________________");
    while (x <= 50)
    {
      // Calcular z. Como z es un entero, almacena
      // la parte entera de la ra�z cuadrada
      z = (int)Math.sqrt(x * x + y * y);
      while (y <= 50 && z <= 50)
      {

        // Como ejercicio, complete el c�digo seg�n se explica en el libro

      }
      x = x + 1; y = x;
    }
  }
}
