// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class Ejercicio03
{
  static long factorial(int n)
  {
    // Función no recursiva:
    long res;
    
    if (n < 0)
    {
      System.out.println("error: número negativo");
      n = 0;
    }
    if(n == 0) return 1;  // 0! es igual 1
    res = n;
    while (--n > 1) res *= n ;
    return res;
  }
  
  static long combinaciones( int n, int k)
  {
    return ( factorial(n) / (factorial(k) * factorial(n - k)) );
  }
  
  static double potencia(double base, int exponente)
  {
    double b;
    
    if (exponente == 0)
      return 1;
    for (b = base; exponente > 1; exponente--)
      b *= base;
    return b;
  }
  
  public static void main(String[] args)
  {
    // Valores predeterminados
    double a = 1, b = 1, m = 1, x = 1, y = 1, result = 0;
    int n = 1, k = 0;
    
    System.out.println("Binomio (ax + by)^n:");
    System.out.print("a = "); a = Leer.datoDouble();
    System.out.print("b = "); b = Leer.datoDouble();
    System.out.print("n = "); m = Leer.datoInt();
    n = (int)m;
    System.out.print("x = "); x = Leer.datoDouble();
    System.out.print("y = "); y = Leer.datoDouble();
    System.out.println("Calcular (" + a + "*" + x + " + " + b + "*" + y + ")^" + n);
    
    for ( k = 0, result = 0; k <= n; k++)
      result += combinaciones(n, k) * potencia(a*x, n-k) * potencia(b*y, k);
    System.out.println("resultado: " + result);
  }
}
