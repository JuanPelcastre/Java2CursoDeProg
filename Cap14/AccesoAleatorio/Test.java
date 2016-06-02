import java.io.*;
//////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con un fichero accedido aleatoriamente
//
public class Test
{
  // Definir una referencia al flujo est�ndar de salida: flujoS
  static PrintStream flujoS = System.out;

  static CListaTfnos listatfnos;

  public static void imprimirListaTfnos() throws IOException
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public static boolean modificar(int nreg) throws IOException
  {
    String nombre, direcci�n;
    long tel�fono;
    int op;
    // Leer el registro
    CPersona obj = listatfnos.leerReg(nreg);
    if (obj == null) return false;
    
    // Modificar el registro
    do
    {
      flujoS.print("\n\n");
      flujoS.println("Modificar el dato:");
      flujoS.println("1. Nombre");
      flujoS.println("2. Direcci�n");
      flujoS.println("3. Tel�fono");
      flujoS.println("4. Salir y salvar los cambios");
      flujoS.println("5. Salir sin salvar los cambios");
      flujoS.println();
      flujoS.print("   Opci�n: ");
      op = Leer.datoInt();
          
      switch( op )
      {
        case 1: // modificar nombre
          flujoS.print("nombre:    ");
          nombre = Leer.dato();
          obj.asignarNombre(nombre);
          break;
        case 2: // modificar direcci�n
          flujoS.print("direcci�n: ");
          direcci�n = Leer.dato();
          obj.asignarDirecci�n(direcci�n);
          break;
        case 3: // modificar tel�fono
          flujoS.print("tel�fono:  ");
          tel�fono = Leer.datoLong();
          obj.asignarTel�fono(tel�fono);
          break;
        case 4: // guardar los cambios
          // Operaci�n pospuesta a la salida del switch
          break;
        case 5: // salir sin guardar los cambios
          break;
      }
    }
    while( op != 4 && op != 5);

    if (op == 4)
    {
      listatfnos.escribirReg(nreg, obj);             
      return true;
    }
    else
      return false;
  }
  
  public static void actualizar(File fActual) throws IOException 
  {
    // Crear un fichero temporal
    File ficheroTemp = new File("listatfnos.tmp");
    CListaTfnos ftemp = new CListaTfnos(ficheroTemp);    
    int nregs = listatfnos.n�meroDeRegs();
    // Copiar en el fichero temporal todos los registros del
    // fichero actual que en su campo tel�fono no tengan un 0
    CPersona obj;
    for ( int reg_i = 0; reg_i < nregs; reg_i++ )
    {
      obj = listatfnos.leerReg(reg_i);
      if (obj.obtenerTel�fono() != 0)
        ftemp.a�adirReg(obj);
    }
    listatfnos.cerrarFichero();
    ftemp.cerrarFichero();
    fActual.delete();
    if (!ficheroTemp.renameTo(fActual))
      throw new IOException("no se renombr� el fichero");
  }  

  public static int men�()
  {
    flujoS.print("\n\n");
    flujoS.println("1. Buscar");
    flujoS.println("2. Buscar siguiente");
    flujoS.println("3. Modificar");
    flujoS.println("4. A�adir");
    flujoS.println("5. Eliminar");
    flujoS.println("6. Imprimir");    
    flujoS.println("7. Salir");    
    flujoS.println();
    flujoS.print("   Opci�n: ");
    int op;
    do
      op = Leer.datoInt();
    while (op < 1 || op > 7);
    flujoS.println();
    return op;
  }
  
  public static void main(String[] args)
  {
    int opci�n = 0, pos = -1;
    String cadenabuscar = null;
    String nombre, direcci�n;
    long tel�fono;
    boolean eliminado = false;
    boolean modificado = false;
    
    try
    {
      // Crear un objeto lista de tel�fonos vac�o (con 0 elementos)
      // o con el contenido del fichero listatfnos.dat si existe.
      File fichero = new File("listatfnos.dat");
      listatfnos = new CListaTfnos(fichero);
      
      do
      {
        opci�n = men�();
        switch (opci�n)
        {
          case 1: // buscar
            flujoS.print("conjunto de caracteres a buscar ");
            cadenabuscar = Leer.dato();
            pos = listatfnos.buscarReg(cadenabuscar, 0);
            if (pos == -1)
              if (listatfnos.n�meroDeRegs() != 0)
                flujoS.println("b�squeda fallida");
              else
                flujoS.println("lista vac�a");
            else
            {
              flujoS.println("N�mero de registro: " + pos);
              flujoS.println(listatfnos.leerReg(pos).obtenerNombre());
              flujoS.println(listatfnos.leerReg(pos).obtenerDirecci�n());
              flujoS.println(listatfnos.leerReg(pos).obtenerTel�fono());
            }
            break;
          case 2: // buscar siguiente
            pos = listatfnos.buscarReg(cadenabuscar, pos + 1);
            if (pos == -1)
              if (listatfnos.n�meroDeRegs() != 0)
                flujoS.println("b�squeda fallida");
              else
                flujoS.println("lista vac�a");
            else
            {
              flujoS.println("N�mero de registro: " + pos);
              flujoS.println(listatfnos.leerReg(pos).obtenerNombre());
              flujoS.println(listatfnos.leerReg(pos).obtenerDirecci�n());
              flujoS.println(listatfnos.leerReg(pos).obtenerTel�fono());
            }
            break;
          case 3: // modificar
            // Solicitar el n�mero de registro a modificar  
            flujoS.print("n�mero de registro entre 0 y " + 
                         (listatfnos.n�meroDeRegs() - 1) + ": ");
            pos = Leer.datoInt();
            modificado = modificar(pos);
            if (modificado)
              flujoS.println("modificaci�n realizada con �xito");
            else
              flujoS.println("error: no se modific� el registro");
            break;
          case 4: // a�adir
            flujoS.print("nombre:    "); nombre = Leer.dato();
            flujoS.print("direcci�n: "); direcci�n = Leer.dato();
            flujoS.print("tel�fono:  "); tel�fono = Leer.datoLong();
            listatfnos.a�adirReg(new CPersona(nombre, direcci�n, tel�fono));
            break;
          case 5: // eliminar
            flujoS.print("tel�fono: "); tel�fono = Leer.datoLong();
            eliminado = listatfnos.eliminarReg(tel�fono);
            if (eliminado)
              flujoS.println("registro eliminado");
            else
              if (listatfnos.n�meroDeRegs() != 0)
                flujoS.println("tel�fono no encontrado");
              else
                flujoS.println("lista vac�a");
            break;
          case 6: // imprimir
            imprimirListaTfnos();
            break;
          case 7: // salir
            // guardar lista
            if (listatfnos.tieneRegsEliminados())
              actualizar(fichero);
            listatfnos = null;
        }
      }
      while(opci�n != 7);
    }
    catch (IOException e)
    {
      flujoS.println("Error: " + e.getMessage());
    }
  }
}
