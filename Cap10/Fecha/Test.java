/////////////////////////////////////////////////////////////////
// Aplicación que utiliza la clase CFecha
//
public class Test
{
  // Leer una fecha
  public static void leerFecha(int[] f)
  {
    System.out.print("día, ##   :  ");  f[0] = Leer.datoInt();
    System.out.print("mes, ##   :  ");  f[1] = Leer.datoInt();
    System.out.print("año, #### :  ");  f[2] = Leer.datoInt();
  }
  
  // Visualizar una fecha
  public static void visualizarFecha(CFecha fecha)
  {
    int[] f = new int[3];
    
    fecha.obtenerFecha(f);
    System.out.println(f[0] + "/" + f[1] + "/" + f[2]);
  }
  
  // Establecer una fecha, verificarla y visualizarla
  public static void main(String[] args)
  {
    CFecha fecha = new CFecha(); // objeto de tipo CFecha
    int[] f = new int[3];
    
    do
    {
      leerFecha(f);
      fecha.asignarFecha(f[0], f[1], f[2]);
    }
    while (!fecha.fechaCorrecta());
    
    visualizarFecha( fecha );
  }
}
