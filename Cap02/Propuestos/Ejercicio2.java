public class Ejercicio2
{
  public static void main(String[] args)
  {
    int a = 2, b = 3, c = 6, d = 11;
    long suma = 0;
    float media = 0;
    
    suma = a + b + c + d;    // no es necesaria la conversi�n cast
    media = (float)suma / 4; // SI es necesaria la conversi�n CAST
            
    System.out.println("La suma es " + suma);
    System.out.println("La media es " + media);
  }
}
