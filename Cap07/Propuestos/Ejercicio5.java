import java.io.*;
import java.util.*;

public class Ejercicio5
{
  public static void main(String[] arg)
  {
    Scanner Leer = new Scanner(System.in);
    PrintStream flujoS=System.out;

    int numero = 0;
    int adivinar = 0;
    int i = 0;
    int oportunidades = 7;
    
    adivinar = (int)(100 * Math.random());
    flujoS.println("Adivina mi n�mero entre 0 y 100. Tienes " + oportunidades + " oportunidades. SUERTE.");
    do
    {
      flujoS.print("N�mero: ");
      numero = Leer.nextInt();
      if (numero < adivinar)
        flujoS.println("Demasiado peque�o");
      if (numero > adivinar)
        flujoS.println("Demasiado grande");
      if(numero == adivinar)
        flujoS.println("���Muy bien!!!!. Acertaste.");
      i++;
    }
    while ((numero != adivinar) && (i < oportunidades));
    
    if (i == oportunidades)
      flujoS.println("Fallaste; el n�mero era " + adivinar);
  }
}
