/////////////////////////////////////////////////////////////////
// Definici�n de la clase CListaTfnos.
//
import java.io.*;
public class CListaTfnos
{
  private RandomAccessFile fes;   // flujo
  private int nregs;              // n�mero de registros
  private int tama�oReg = 140;    // tama�o del registro en bytes
  private boolean regsEliminados = false; // true si se
                                  // eliminaron registros

  public CListaTfnos(File fichero) throws IOException
  {
    if (fichero.exists() && !fichero.isFile())
      throw new IOException(fichero.getName() + " no es un fichero");
    fes = new RandomAccessFile(fichero, "rw");
    // Como es casi seguro que el �ltimo registro no ocupe el
    // tama�o fijado, utilizamos ceil para redondear por encima.
    nregs = (int)Math.ceil((double)fes.length() / (double)tama�oReg);
  }
  
  public void cerrarFichero() throws IOException { fes.close(); }
  
  public int n�meroDeRegs() { return nregs; } // n�mero de registros
  
  public boolean escribirReg( int i, CPersona objeto ) throws IOException
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public void a�adirReg(CPersona obj) throws IOException
  {
    if (escribirReg( nregs, obj )) nregs++;
  }

  public CPersona leerReg( int i ) throws IOException
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public boolean eliminarReg(long tel) throws IOException
  {
    CPersona obj;
    // Buscar el tel�fono y marcar el registro para
    // posteriormente eliminarlo
    for ( int reg_i = 0; reg_i < nregs; reg_i++ )
    {
      obj = leerReg(reg_i);
      if (obj.obtenerTel�fono() == tel)
      {
        obj.asignarTel�fono(0);
        escribirReg( reg_i, obj );
        regsEliminados = true;
        return true;
      }
    }
    return false;
  }
  
  public boolean tieneRegsEliminados()
  {
    return regsEliminados;
  }
  
  public int buscarReg(String str, int pos) throws IOException
  {
    // Buscar un registro por una subcadena del nombre
    // a partir de un registro determinado
    CPersona obj;
    String nom;
    if (str == null) return -1;
    if (pos < 0) pos = 0;
    for ( int reg_i = pos; reg_i < nregs; reg_i++ )
    {
      obj = leerReg(reg_i);
      nom = obj.obtenerNombre();
      // �str est� contenida en nom?
      if (nom.indexOf(str) > -1)
        return reg_i;
    }
    return -1;
  }
}
