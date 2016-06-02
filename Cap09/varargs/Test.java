public class Test
{
  static void visualizar(Object... params)
  {
    for (Object p : params)
      System.out.print(p + " ");
    System.out.println();
  }
  
  static void visualizar(String s, Object... params)
  {
    System.out.print(s);
    for (Object p : params)
      System.out.print(p + " ");
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    long ai = 2, bi = 3;
    double ad = 1.5;
    
    visualizar("Resultados: ");
    visualizar(ai);
    visualizar("Dato entero = ", bi);
    visualizar("Dato real = ", ad);
    visualizar(ai, bi, ad);
    visualizar("Datos enteros = ", ai, bi);
  }
}
