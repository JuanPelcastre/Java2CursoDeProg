public class CMiAplicacion
{
  public static void main(String[] args)
  {
    CPolinomio pol1 = new CPolinomio();
    pol1.Polinomio(1, -3.2, 0, 7);
    
    double r = pol1.ValorPara(1);
    System.out.println(r);
    
    r = pol1.ValorPara(1.5);
    System.out.println(r);
  }
}

class CPolinomio
{
  // El término de mayor grado tiene exponente 3 fijo
  double c3, c2, c1, c0; // coeficientes

  // Como ejercicio, complete el código según se explica en el libro
}
