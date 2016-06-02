public class CPitagoras
{
  // Teorema de Pitágoras
  public static void main(String[] args)
  {
    int x = 1, y = 1, z = 0;
    System.out.println("Z\t" + "X\t" + "Y");
    System.out.println("____________________");
    while (x <= 50)
    {
      // Calcular z. Como z es un entero, almacena
      // la parte entera de la raíz cuadrada
      z = (int)Math.sqrt(x * x + y * y);
      while (y <= 50 && z <= 50)
      {

        // Como ejercicio, complete el código según se explica en el libro

      }
      x = x + 1; y = x;
    }
  }
}
