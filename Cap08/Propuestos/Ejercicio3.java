// Leer.class debe estar en la carpeta especificada por CLASSPATH
import java.util.*;
public class Ejercicio3
{
  public static void main(String[] args)
  {
    ArrayList<Integer> numero = new ArrayList<Integer>(); // matriz de números enteros
    
    System.out.println("Introduzca una cantidad impar de números.\n" +
                       "Finalice introduciendo <Entrar>");
    int num;
    System.out.print("Número: "); num = Leer.datoInt();
    while (num != Integer.MIN_VALUE)
    {
      numero.add(num);
      System.out.print("Número: "); num = Leer.datoInt();
    }

    if(numero.size() % 2 == 0)
    {
      System.out.println("Tenía que haber introducido un número impar de números.");
      System.out.print("Un número más: "); num = Leer.datoInt();
      numero.add(num);
    }
    
    int menores, mayores, cont = numero.size();
    for (int i = 0; i < cont; i++)
    {
      menores = mayores = 0;
      for (int j = 0; j < cont; j++)
      {
        if ( j == i ) continue;
        if ( numero.get(i) <= numero.get(j) ) menores++;
        if ( numero.get(i) >= numero.get(j) ) mayores++;
      }
      System.out.println(menores + " " + mayores);
      if (menores == mayores ||
              menores >= cont/2 && mayores >= cont/2) // puede haber números repetidos
      {
        System.out.println("Mediana = " + numero.get(i));
        break;
      }
    }
  }
}
