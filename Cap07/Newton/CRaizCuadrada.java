public class CRaizCuadrada
{
  // Raíz cuadrada. Método de Newton.
  public static void main(String[] args)
  {
    java.util.Scanner Leer = new java.util.Scanner(System.in);
    double n;        // número
    double aprox;    // aproximación a la raíz cuadrada
    double antaprox; // anterior aproximación a la raíz cuadrada
    double epsilon;  // coeficiente de error
        
    do
    {
      System.out.print("Número: ");
      n = Leer.nextDouble();
    }
    while ( n < 0 );
    do
    {
      System.out.print("Raíz cuadrada aproximada: ");
      aprox = Leer.nextDouble();
    }
    while ( aprox <= 0 );
    do
    {
    System.out.print("Coeficiente de error: ");
    epsilon = Leer.nextDouble();
    }
    while ( epsilon <= 0 );
    do
    {

      // Como ejercicio, complete el código según se explica en el libro

    }
    while (Math.abs(aprox - antaprox) >= epsilon);
    System.out.printf("La raíz cuadrada de %.2f es %.2f", n, aprox);
  }
}
