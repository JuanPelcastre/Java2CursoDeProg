import java.io.*;
/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con CComplejo
//
public class Test
{
  public static void main(String[] args)
  {
    CComplejo a = new CComplejo(3.5, -0.7);
    CComplejo b = new CComplejo(2.0, 1.5);
    CComplejo c = new CComplejo(-1, 1);
    CComplejo d = new CComplejo();

    System.out.println("a = " + CComplejo.obtener(a));
    System.out.println("b = " + CComplejo.obtener(b));
    System.out.println("c = " + CComplejo.obtener(c));
    System.out.println("d = " + CComplejo.obtener(d));
    
    double mod = a.mod();
    System.out.println("mod(a) = " + mod);
    double alfa = a.arg();
    System.out.println("arg(a) = " + alfa);
    
    a = c.cambioSigno();
    System.out.println("a = " + CComplejo.obtener(a));
    a = a.sumar(b);
    System.out.println("a + b = " + CComplejo.obtener(a));
    if (a.noIgual(new CComplejo(0, 0)))
    {
      c = b.dividir(a);
      System.out.println("b/a = " + CComplejo.obtener(c));
    }
    d = CComplejo.po_bi(mod, alfa);
    System.out.println("bi(mod, alfa) = " + CComplejo.obtener(d));
    d = CComplejo.tan(b);
    System.out.println("tan(b) = " + CComplejo.obtener(d));
    d = CComplejo.pow(a, c);
    System.out.println("pow(a, c) = " + CComplejo.obtener(d));
    CComplejo.leer(d);
    System.out.println("d = " + CComplejo.obtener(d));
    a = CComplejo.log(new CComplejo(0, 0));
    System.out.println("log(a) = " + CComplejo.obtener(a));
  }
}
