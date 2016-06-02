// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class Ejercicio2
{
  public static void main(String[] args)
  {
    int n_car = 0, n_caracteres = 0; // número de caracteres
    char car;
    String frase;
    System.out.println("Introduzca una frase:");
    frase = Leer.dato();
    char[] stemp = frase.toCharArray();
    n_caracteres = stemp.length;
    System.out.print(frase + " ");
    do
    { // Repite el bucle mientras la cadena no vuelva a ser la original
      car = stemp[n_caracteres - 1];
      for (n_car = n_caracteres - 2; n_car >= 0; n_car--)
      {
        stemp[n_car + 1] = stemp[n_car];
      }
      stemp[0] = car;
      System.out.print(new String(stemp) + " ");
    }
    while( frase.compareTo(new String(stemp)) != 0 );
    System.out.println();
  }
}
