public class CListaLinealSEOrdenada extends CListaLinealSEO<CTermino>
{
  // Permite comparar dos elementos de la lista por
  // el atributo exponente.
  public int comparar(CTermino obj1, CTermino obj2)
  {
    int k = 10, a = 0, b = 0, r = 0;
    int expX1 = obj1.obtenerExponenteDeX();
    int expY1 = obj1.obtenerExponenteDeY();
    int expX2 = obj2.obtenerExponenteDeX();
    int expY2 = obj2.obtenerExponenteDeY();
    
    while (Math.abs(expX1) > k || Math.abs(expY1) > k ||
      Math.abs(expX2) > k || Math.abs(expY2) > k) k = k*10;
    a = expX1 * k + expY1;
    b = expX2 * k + expY2;
    
    // Elegimos orden descendente
    if (a > b) r = -1;
    if (a == b) r = 0;
    if (a < b) r = 1;
    
    return r;
  }
}
