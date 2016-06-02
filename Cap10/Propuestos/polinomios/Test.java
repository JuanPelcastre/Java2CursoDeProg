import java.io.*;
/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con CPolinomio y CTermino
//
public class Test
{
  static CTermino IntroducirTermino()
  {
    float coef;
    int exp;
    System.out.print("Introduce coeficiente:    ");
    coef = Leer.datoFloat();
    System.out.print("Introduce exponente en X: ");
    exp = Leer.datoInt();
    System.out.println();
    return new CTermino(coef, exp);
  }
  
  public static void main(String[] args)
  {
    CPolinomio PolinomioR = new CPolinomio();
    CPolinomio PolinomioB = new CPolinomio();
    CPolinomio PolinomioA = new CPolinomio();
    CTermino tx = null;
    
    System.out.println("Términos del polinomio A\n"
      + "(para finalizar introduzca 0 para el\n"
      + "coeficiente y para el exponente):\n");
    tx = IntroducirTermino();
    while (tx.ObtenerCoeficiente() != 0 || tx.ObtenerExponente() != 0)
    {
      PolinomioA.AsignarTermino(tx);
      tx = IntroducirTermino();
    }
    
    System.out.println("Términos del polinomio B\n"
      + "(para finalizar introduzca 0 para el\n"
      + "coeficiente y para el exponente):\n");
    tx = IntroducirTermino();
    while (tx.ObtenerCoeficiente() != 0 || tx.ObtenerExponente() != 0)
    {
      PolinomioB.AsignarTermino(tx);
      tx = IntroducirTermino();
    }
    
    PolinomioR.Sumar(PolinomioA, PolinomioB);
    
    System.out.print("\nPolinomio A: "); PolinomioA.VisualizarPol();
    System.out.print("\nPolinomio B: "); PolinomioB.VisualizarPol();
    System.out.print("\nPolinomio R: "); PolinomioR.VisualizarPol();
    System.out.println();
  }
}
