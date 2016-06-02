import java.io.*;
import java.util.*;

public class Test
{
  public static void main(String[] args)
  {
/*
    // Como ejercicio, complete el código según se explica en el libro

    System.out.print("Cadena de caracteres: ");
    String str = leer.next();
    System.out.print("Valor entero: ");
    int dato = leer.nextInt();
    leer.close();
 */
    String datosDeEntrada = "abc, 123";

    // Como ejercicio, complete el código según se explica en el libro

    leer.useDelimiter("\\s*,\\s*");
    String str = leer.next();
    int dato = leer.nextInt();
    
    // Como ejercicio, complete el código según se explica en el libro

    int a = 12345;
    float b = 54.865F;
    fs.printf("%d\n", a);       /* escribe 12345\n */
    fs.printf("\n%10s\n%10s\n", "abc", "abcdef");
    fs.printf("\n%-10s\n%-10s\n", "abc", "abcdef");
    fs.printf("\n");            /* avanza a la siguiente línea */
    fs.printf("%.2f\n", b);     /* escribe b con dos decimales */

    Calendar c = Calendar.getInstance();
    System.out.printf("Son las %1$tH:%1$tM del %tA %1$td de %1$tB de %1$tY", c);  }
}

