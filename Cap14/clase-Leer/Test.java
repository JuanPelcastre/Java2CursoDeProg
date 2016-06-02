public class Test
{
  public static void main(String[] args)
  {
    char car = 0, cero = '0', nueve = '9',menos = '-';
    String s = null;
    double d = 0.0;

    System.out.print("dato: ");
    if ((car = Leer.mirar()) >= cero && car <= nueve || car == menos)
      d = Leer.datoDouble();
    else
      s = Leer.dato();

    if (s != null)
      System.out.println(s);
    else
      System.out.println(d);
  }
}
