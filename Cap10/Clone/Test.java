/////////////////////////////////////////////////////////////////
// Aplicación que utiliza la clase CVector
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
    double x[] = { 1, 2, 3, 4, 5, 6, 7 }; // matriz x
    CVector vector1 = new CVector(x);

    CVector vector2 = vector1.clone();
    for (int i = 0; i < vector2.longitud(); i++)
      vector2.ponerValorEn(i, vector2.valorEn(i)*10);

    if (vector1 == vector2)
      System.out.println("referencias al mismo objeto");
    else
      System.out.println("referencias a objetos diferentes");
    
    if (vector1.equals(vector2))
      System.out.println("objetos iguales");
    else
      System.out.println("objetos diferentes");

    visualizarVector(vector1); // escribe 1 2 3 4 5 6 7
    visualizarVector(vector2); // escribe 10 20 30 40 50 60 70
  }
}
