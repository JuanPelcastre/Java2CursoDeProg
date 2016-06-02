import java.util.*;

public class CPolinomio
{
  private ArrayList<CTermino> polinomio; // matriz inicialmente vacía
  
  // Constructor
  public CPolinomio()
  {
    polinomio = new ArrayList<CTermino>(10); // reservar memoria para 10 términos
  }
  
  // Asigna un término al polinomio colocándolo en orden ascendente
  // del exponente.
  public void AsignarTermino(CTermino termino)
  {
    if (termino.ObtenerCoeficiente() == 0) return;
    float c, coef = termino.ObtenerCoeficiente();
    int exp = termino.ObtenerExponente();
    
    // Insertar un nuevo término en orden ascendente del exponente.
    int i = polinomio.size() - 1;
    while (i >= 0 &&  exp < polinomio.get(i).ObtenerExponente())
      i--;
    if (i >= 0 && exp == polinomio.get(i).ObtenerExponente())
    {
      c = coef + polinomio.get(i).ObtenerCoeficiente();
      // Término existente. Sumar los coeficientes.
      if (c != 0)
        polinomio.get(i).AsignarCoeficiente(c);
      else
        polinomio.remove(i);
    }
    else
      // Insertar un nuevo término
      polinomio.add((i+1), termino);
  }
  
  // Sumar dos polinomios
  public void Sumar(CPolinomio polA, CPolinomio polB)
  {
    int ipa = 0, ipb = 0;
    int na = polA.ObtenerNroTerminos(), nb = polB.ObtenerNroTerminos();
    float coefA, coefB;
    int expA, expB;
    // Sumar polA con polB
    while (ipa < na && ipb < nb)
    {
      coefA = polA.polinomio.get(ipa).ObtenerCoeficiente();
      coefB = polB.polinomio.get(ipb).ObtenerCoeficiente();
      expA = polA.polinomio.get(ipa).ObtenerExponente();
      expB = polB.polinomio.get(ipb).ObtenerExponente();
      if (expA == expB)
      {
        if (coefA + coefB != 0)
          AsignarTermino(new CTermino(coefA + coefB, expA));
        ipa++; ipb++;
      }
      else if (expA < expB)
      {
        AsignarTermino(new CTermino(coefA, expA));
        ipa++;
      }
      else
      {
        AsignarTermino(new CTermino(coefB, expB));
        ipb++;
      }
    }
    
    // Términos restantes de polA o de polB
    while (ipa < na)
    {
      coefA = polA.polinomio.get(ipa).ObtenerCoeficiente();
      expA = polA.polinomio.get(ipa).ObtenerExponente();
      AsignarTermino(new CTermino(coefA, expA));
      ipa++;
    }
    while (ipb < nb)
    {
      coefB = polB.polinomio.get(ipb).ObtenerCoeficiente();
      expB = polB.polinomio.get(ipb).ObtenerExponente();
      AsignarTermino(new CTermino(coefB, expB));
      ipb++;
    }
  }
  
  // Visualizar los términos de un polinomio
  public void VisualizarPol()
  {
    int i = ObtenerNroTerminos();
    
    while (i-- != 0)
      polinomio.get(i).VisualizarTermino();
  }

  public int ObtenerNroTerminos()
  {
    return polinomio.size();
  }
}
