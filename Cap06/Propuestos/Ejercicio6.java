import java.io.*;

public class Ejercicio6
{
  public static void main(String[] arg)
  {
    PrintStream FS=System.out;
    char car1='A', car2=65, car3=0;
    car3 = (char)(car1 + 'a' - 'A');
    FS.println(car3+" "+(int)car3); //a 97
    car3=(char)(car2+32);
    FS.println(car3+" "+(int)car3); //a 97
  }
}
