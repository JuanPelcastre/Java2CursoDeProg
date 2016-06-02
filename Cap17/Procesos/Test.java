//////////////////////////////////////////////////////////////////
// Procesos.
//
public class Test
{
  // Un programa Java visto como un proceso
  
  public static int random(int n)
  {
    int límiteSup = n, límiteInf = 1;
    return (int)((límiteSup - límiteInf + 1) * Math.random() +
           límiteInf); // valor entre 1 y n
  }
  
  public static void esperar(int n)
  {
    long tmi = System.currentTimeMillis() + n; // milisegundos
    while (System.currentTimeMillis() < tmi);  // esperar n msegs.
  }
  
  public static void tomarMuestraTipoA(int[] n)
  {
    n[0] = random(10);
    for (int i = 0; i < n[0]; i++)
    {
      System.out.println("Tomando muestra de tipo A");
      esperar(500);
    }
  }
  
  public static void tomarMuestraTipoB(int[] n)
  {
    n[0] = random(20);
    for (int i = 0; i < n[0]; i++)
    {
      System.out.println("Tomando muestra de tipo B");
      esperar(500);
    }
  }
  
  public static void resultados(int n, int m)
  {
    System.out.println("Muestras de tipo A: " + n);
    System.out.println("Muestras de tipo B: " + m);
    System.out.println("Total: " + (n + m));
  }
  
  public static void main(String[] args)
  {
    int[] nMuestrasTipoA = {0};
    int[] nMuestrasTipoB = {0};
    
    tomarMuestraTipoA(nMuestrasTipoA);
    tomarMuestraTipoB(nMuestrasTipoB);
    resultados(nMuestrasTipoA[0], nMuestrasTipoB[0]);
  }
}
//////////////////////////////////////////////////////////////////
