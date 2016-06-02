public class CRaizCuadrada
{
  // Ra�z cuadrada. M�todo de Newton.
  public static void main(String[] args)
  {
    java.util.Scanner Leer = new java.util.Scanner(System.in);
    double n;        // n�mero
    double aprox;    // aproximaci�n a la ra�z cuadrada
    double antaprox; // anterior aproximaci�n a la ra�z cuadrada
    double epsilon;  // coeficiente de error
        
    do
    {
      System.out.print("N�mero: ");
      n = Leer.nextDouble();
    }
    while ( n < 0 );
    do
    {
      System.out.print("Ra�z cuadrada aproximada: ");
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

      // Como ejercicio, complete el c�digo seg�n se explica en el libro

    }
    while (Math.abs(aprox - antaprox) >= epsilon);
    System.out.printf("La ra�z cuadrada de %.2f es %.2f", n, aprox);
  }
}
