import java.io.*;
import java.util.*;
/////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con la clase CBanco y la jerarqu�a
// de clases derivadas de CCuenta
//
public class Test
{

  // Como ejercicio, complete el c�digo seg�n se explica en el libro

  
  public static void main(String[] args)
  {
/*
    ArrayList<CCuenta> a = new ArrayList<CCuenta>();
    
    a.add(new CCuentaAhorro("aaa", "111", 1000, 1, 1));
    a.add(new CCuentaCorriente("bbb", "222", 4000, 1.5, 1, 6));
    a.add(new CCuentaCorrienteConIn("ccc", "333", 5000, 2, 1, 6));
    
    mostrarCuentas(a);
 */
    ArrayList<CCuentaAhorro> a = new ArrayList<CCuentaAhorro>();
    a.add(new CCuentaAhorro("aaa", "111", 1000, 1, 1));
    // ...
    mostrarCuentas(a);
  }
}
/////////////////////////////////////////////////////////////////
