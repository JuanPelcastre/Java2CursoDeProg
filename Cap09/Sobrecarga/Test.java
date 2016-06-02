public class Test
{
  static void visualizar(String cad)
  {
    System.out.println(cad);
  }
  static void visualizar(long n)
  {
    System.out.println(n);
  }
  static void visualizar(String cad, long n)
  {
    System.out.println(cad + n);
  }
  static void visualizar(double n)
  {
    System.out.println(n);
  }
  static void visualizar(String cad, double n)
  {
    System.out.println(cad + n);
  }
  
  public static void main(String[] args)
  {
    long ai = 2, bi = 2;
    double ad = 1.5;
    
    visualizar("Resultados: ");       // invoca al primer m�todo
    visualizar(ai);                   // invoca al segundo m�todo
    visualizar("Dato entero = ", bi); // invoca al tercer m�todo
    visualizar("Dato real = ", ad);   // invoca al quinto m�todo
  }
}
