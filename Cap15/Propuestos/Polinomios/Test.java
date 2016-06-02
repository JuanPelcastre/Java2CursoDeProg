import java.math.*;
//////////////////////////////////////////////////////////////////
// Clase CPolinomio. Un objeto CPolinomio consta de uno o m�s
//                   objetos CTermino.
//
public class Test
{
  public static void mostrarPolinomio(CListaLinealSEOrdenada poli)
  {
    // Mostrar todos los elementos de la lista
    CTermino pobj = poli.obtenerPrimero();
    while (pobj != null)
    {
      pobj.mostrarTermino();
      pobj = poli.obtenerSiguiente();
    }
    System.out.println();
  }
  
  public static CTermino leerTermino()
  {
    Float coef;
    Integer expx, expy;
    System.out.print("Introduce coeficiente:    ");
    coef = Leer.datoFloat();
    System.out.print("Introduce exponente de X: ");
    expx = Leer.datoInt();
    System.out.print("Introduce exponente de Y: ");
    expy = Leer.datoInt();
    System.out.println();
    if (coef == 0 && expx == 0 && expy == 0) return null;
    return new CTermino(coef, expx, expy);
  }
  
  public static CListaLinealSEOrdenada sumar(CListaLinealSEOrdenada pA, CListaLinealSEOrdenada pB)
  {
    // pR = sumar(pA + pB)
    int k = 0;
    CTermino tA = null, tB = null, tR = new CTermino();
    // Polinomio resultante
    CListaLinealSEOrdenada pR = new CListaLinealSEOrdenada();
    
    // Sumar pA con pB
    tA = pA.obtenerPrimero();
    tB = pB.obtenerPrimero();
    while (tA != null && tB != null)
    {
      k = pR.comparar(tA, tB);
      
      if ( k == 0 )
      {
        tR.asignarCoeficiente(tA.obtenerCoeficiente() +
          tB.obtenerCoeficiente());
        tR.asignarExponenteDeX(tA.obtenerExponenteDeX());
        tR.asignarExponenteDeY(tA.obtenerExponenteDeY());
        tA = pA.obtenerSiguiente();
        tB = pB.obtenerSiguiente();
      }
      else if ( k < 0 )
      {
        tR.asignarCoeficiente(tA.obtenerCoeficiente());
        tR.asignarExponenteDeX(tA.obtenerExponenteDeX());
        tR.asignarExponenteDeY(tA.obtenerExponenteDeY());
        tA = pA.obtenerSiguiente();
      }
      else
      {
        tR.asignarCoeficiente(tB.obtenerCoeficiente());
        tR.asignarExponenteDeX(tB.obtenerExponenteDeX());
        tR.asignarExponenteDeY(tB.obtenerExponenteDeY());
        tB = pB.obtenerSiguiente();
      }
      if (tR.obtenerCoeficiente() != 0.0)
        pR.a�adir(new CTermino(tR));
    }
    
    // T�rminos restantes en el pA
    while (tA != null)
    {
      tR.asignarCoeficiente(tA.obtenerCoeficiente());
      tR.asignarExponenteDeX(tA.obtenerExponenteDeX());
      tR.asignarExponenteDeY(tA.obtenerExponenteDeY());
      pR.a�adir(new CTermino(tR));
      tA = pA.obtenerSiguiente();
    }
    
    // T�rminos restantes en el pB
    while (tB != null)
    {
      tR.asignarCoeficiente(tB.obtenerCoeficiente());
      tR.asignarExponenteDeX(tB.obtenerExponenteDeX());
      tR.asignarExponenteDeY(tB.obtenerExponenteDeY());
      pR.a�adir(new CTermino(tR));
      tB = pB.obtenerSiguiente();
    }
    
    return pR;
  }
  
  public static void main(String[] args)
  {
    // Definir los polinomios a sumar
    CListaLinealSEOrdenada polinomioA = new CListaLinealSEOrdenada();
    CListaLinealSEOrdenada polinomioB = new CListaLinealSEOrdenada();
    // Declarar una referencia al polinomio resultante
    CListaLinealSEOrdenada polinomioR;
    // Declarar una referencia a un t�rmino cualquiera
    CTermino t�rmino = null, aux = null; // referencia a un t�rmino
    
    // Leer los t�rminos del primer sumando
    System.out.print("T�rminos del polinomio A "
      + "(para finalizar introduzca 0 para el\n"
      + "coeficiente y para los exponentes).\n\n");
    t�rmino = leerTermino();
    while ( t�rmino != null )
    {
      if (polinomioA.buscar(t�rmino))
      {
        aux = polinomioA.obtenerActual();
        aux.asignarCoeficiente(aux.obtenerCoeficiente() +
          t�rmino.obtenerCoeficiente());
      }
      else
        polinomioA.a�adir(t�rmino);
      
      t�rmino = leerTermino();
    }
    
    // Leer los t�rminos del segundo sumando
    System.out.println("T�rminos del polinomio B "
      + "(para finalizar introduzca 0 para el\n"
      + "coeficiente y para los exponentes).\n\n");
    t�rmino = leerTermino();
    while ( t�rmino != null )
    {
      if (polinomioB.buscar(t�rmino))
      {
        aux = polinomioB.obtenerActual();
        aux.asignarCoeficiente(aux.obtenerCoeficiente() +
          t�rmino.obtenerCoeficiente());
      }
      else
        polinomioB.a�adir(t�rmino);
      
      t�rmino = leerTermino();
    }

    // Sumar polinomios
    polinomioR = sumar(polinomioA, polinomioB);
    
    // Mostrar polinomios
    System.out.println("\nPolinomio A:");
    mostrarPolinomio(polinomioA);
    System.out.println("\nPolinomio B");
    mostrarPolinomio(polinomioB);
    System.out.println("\nPolinomio resultante:");
    mostrarPolinomio(polinomioR);
  }
}
//////////////////////////////////////////////////////////////////
