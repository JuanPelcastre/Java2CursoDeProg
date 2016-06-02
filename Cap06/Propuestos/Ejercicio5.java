import java.io.*;

public class Ejercicio5
{
  public static void main(String[] arg)
  {
    PrintStream FS=System.out;
    char car=0;
    int nc=2;
    try
    {
      FS.print("Carácter :");
      car=(char)System.in.read();
      FS.println(car);
      nc=System.in.available();
      System.in.skip(nc);
      FS.print("Carácter : ");
      car=(char)System.in.read();
      FS.println(car);
    }
    catch(IOException e)
    {}
  }
}
