import java.io.*;
import java.util.*;

public class CComplejo
{
  private double real;  // parte real
  private double imag;  // parte imaginaria
  
  static private String[] mensajeError = {
    "división por cero",
      "log(0)",
      "en pow(z, e), z = 0"
  };
  
  // Manipulación de un error
  public static void error(String mensaje)
  {
    System.out.println("\u0007error: " + mensaje);
    System.exit(1);
  }
  
  // Constructores
  public CComplejo()
  {
    real = 0; imag = 0;
  }
  
  public CComplejo(final double r, final double i)
  {
    real = r; imag = i;
  }
  
  public void copiar(final CComplejo c)
  {
    real = c.real; imag = c.imag;
  }
  
  // Paso de forma polar a binómica: m(cos alfa + isen alfa) = a+bi
  public static CComplejo po_bi(final double mod, final double alfa)
  {
    return new CComplejo(mod * Math.cos(alfa), mod * Math.sin(alfa));
  }
  
  // Operaciones aritméticas con complejos
  public CComplejo sumar(final CComplejo y)
  {
    return new CComplejo(real + y.real, imag + y.imag);
  }
  
  public CComplejo restar(final CComplejo y)
  {
    return new CComplejo(real - y.real, imag - y.imag);
  }
  
  public CComplejo multiplicar(final CComplejo y)
  {
    return new CComplejo(real * y.real - imag * y.imag,
      real * y.imag + imag * y.real);
  }
  
  public CComplejo dividir(final CComplejo y)
  {
    double r = 0, i = 0, divisor = y.norm();
    
    if (divisor != 0)
    {
      r = (real * y.real + imag * y.imag) / divisor;
      i = (imag * y.real - real * y.imag) / divisor;
    }
    else
      CComplejo.error(mensajeError[0]);
    return new CComplejo(r, i);
  }
  
// Comparación de complejos
  public boolean igual(final CComplejo y)
  {
    return (real == y.real) && (imag == y.imag);
  }
  
  public boolean noIgual(final CComplejo y)
  {
    return !(this.igual(y));
  }
  
// Para el resto de las comparaciones, comparamos módulos
  public boolean menor(final CComplejo y)
  {
    return mod() < y.mod();
  }
  
  public boolean menorOigual(final CComplejo y)
  {
    return mod() <= y.mod();
  }
  
  public boolean mayor(final CComplejo y)
  {
    return mod() > y.mod();
  }
  
  boolean mayorOigual(final CComplejo y)
  {
    return mod() >= y.mod();
  }
  
  // Operaciones trigonométricas con complejos
  public static CComplejo cos(final CComplejo c)
  {
    return new CComplejo(Math.cos(c.real) * Math.cosh(c.imag),
      -Math.sin(c.real) * Math.sinh(c.imag));
  }
  
  public static CComplejo sin(final CComplejo c)
  {
    return new CComplejo(Math.sin(c.real) * Math.cosh(c.imag),
      Math.cos(c.real) * Math.sinh(c.imag));
  }
  
  public static CComplejo tan(final CComplejo c)
  {
    return sin(c).dividir(cos(c));
  }
  
  public static CComplejo cosh(final CComplejo c)
  {
    return new CComplejo(Math.cosh(c.real) * Math.cos(c.imag),
      Math.sinh(c.real) * Math.sin(c.imag));
  }
  
  public static CComplejo sinh(final CComplejo c)
  {
    return new CComplejo(Math.sinh(c.real) * Math.cos(c.imag),
      Math.cosh(c.real) * Math.sin(c.imag));
  }
  
  public static CComplejo tanh(final CComplejo c)
  {
    return sinh(c).dividir(cosh(c));
  }
  
  // Operaciones logarítmicas y exponenciales
  public static CComplejo exp(final CComplejo c)
  {
    double m = Math.exp(c.real);
    return new CComplejo(m * Math.cos(c.imag), m * Math.sin(c.imag));
  }
  
  public static CComplejo log(final CComplejo c)
  {
    double m = c.mod();
    
    if (m == 0) CComplejo.error(mensajeError[1]);
    return new CComplejo(Math.log(m), c.arg());
  }
  
  // Potencia
  public static CComplejo pow(final CComplejo c, final CComplejo e)
  {
    if (e.real == 0 && e.imag == 0)
      return new CComplejo(1, 0);
    else
      if (c.real == 0 && c.imag == 0)
        CComplejo.error(mensajeError[2]);
    return exp(log(c).multiplicar(e));
  }
  
  // Raíz cuadrada
  public static CComplejo sqrt(final CComplejo c)
  {
    return pow(c, new CComplejo(0.5, 0.0));
  }
  
  // Visualizar un complejo
  public static String obtener(final CComplejo c)
  {
    return new String("(" + c.ParteReal() + ", " + c.ParteImag() + ")");
  }
  
  // Leer un complejo
  public static void leer(CComplejo c)
  {
    double re = 0, im = 0;
    char car = '\0';
    boolean error = false;
    String datos;
    do
    {
      try
      {
        error = false;
        System.out.print("real, imag: ");
        datos = Leer.dato();
        Scanner leer = new Scanner(datos);
        leer.useDelimiter("\\s*,\\s*");
        leer.useLocale(new Locale("en", "US"));
        re = leer.nextDouble();
        im = leer.nextDouble();
        leer.close();
      }
      catch(InputMismatchException e)
      {
        error = true;
      }
    }
    while (error);
    
    c.real = re; c.imag = im;
  }
  
  // Obtención de valores
  public double ParteReal() { return real; }
  public double ParteImag() { return imag; }
  public double mod() { return Math.sqrt(real*real + imag*imag); }
  public double arg() { return Math.atan2(imag, real); }
  public double norm() { return real*real + imag*imag; }
  
  // Operaciones varias
  public CComplejo conjugado() { return new CComplejo(real, -imag); }
  public CComplejo negativo() { return new CComplejo(-real, imag); }
  
  // Menos unario. Complejos opuestos
  public CComplejo cambioSigno() { return new CComplejo(-real, -imag); }
}
