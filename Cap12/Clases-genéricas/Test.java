/////////////////////////////////////////////////////////////////
// Aplicación que utiliza la clase genérica CVector
//
public class Test
{
  // Visualizar un vector
  public static void visualizarVector(CVector v)
  {
    int ne = v.longitud();
    for (int i = 0; i < ne; i++)
      System.out.print(v.valorEn(i) + " ");
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    Double x[] = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0 }; // matriz x
    CVector<Double> vector1 = new CVector<Double>(x);
    visualizarVector(vector1); // escribe 1.0 2.0 3.0 ... 7.0

    CVector<Double> vector2 = new CVector<Double>(vector1);
    for (int i = 0; i < vector2.longitud(); i++)
    {
      vector2.ponerValorEn(i, (Double)vector2.valorEn(i)*10.0);
    }
    visualizarVector(vector2); // escribe 10.0 20.0 30.0 ... 70.0
    
    Integer n[] = { 1, 2, 3, 4, 5, 6, 7 }; // matriz n
    CVector<Integer> vector3 = new CVector<Integer>(n);
    visualizarVector(vector3); // escribe 1 2 3 ... 7
  }
}
