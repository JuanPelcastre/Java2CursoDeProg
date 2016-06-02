import java.util.Arrays;
/////////////////////////////////////////////////////////////////
// Definición de la clase CVector
//
public class CVector implements Cloneable
{
  private double[] vector; // matriz vector
  private int nElementos;  // número de elementos de la matriz

  // Crear una matriz con 10 elementos por omisión
  public CVector() // número de elementos por omisión: 10
  {
    nElementos = 10;
    vector = new double[nElementos];
  }
  
  // Crear una matriz con ne elementos
  public CVector(int ne) // ne elementos
  {
    if ( ne < 1 )
    {
      System.out.println("Nº de elementos no válido: " + ne);
      System.out.println("Se asignan 10 elementos");
      ne = 10;
    }
    nElementos = ne;
    vector = new double[nElementos];
  }
  
  // Crear una matriz a partir de otra matriz primitiva
  public CVector(double[] m) // crea un CVector desde una matriz
  {
    nElementos = m.length;
    vector = new double[nElementos];
    // Copiar los elementos de la matriz m
    for ( int i = 0; i < nElementos; i++ )
      vector[i] = m[i];
  }
  
  // Constructor copia
  public CVector(final CVector v) // constructor copia
  {
    nElementos = v.nElementos;
    vector = new double[nElementos];
    // Copiar el objeto v
    for ( int i = 0; i < nElementos; i++ )
      vector[i] = v.vector[i];
  }
  
  // Copia un vector en otro
  public CVector copiar(final CVector v) // copia un CVector en otro
  {
    nElementos = v.nElementos;
    vector = new double[nElementos];
    // Copiar el objeto v
    for ( int i = 0; i < nElementos; i++ )
      vector[i] = v.vector[i];
    
    return this;
  }
/*
  public Object clone()
  {
    try
    {
      // return super.clone(); // copia superficial
      // Copia profunda
      CVector objTemp = (CVector)super.clone();
      objTemp.vector = (double[])this.vector.clone();
      return objTemp;
    }
    catch (CloneNotSupportedException e)
    {
      throw new InternalError(e.toString());
    }
  }
*/
  public CVector clone()
  {
    return new CVector(this);
  }

  public void ponerValorEn( int i, double valor )
  {
    if (i >= 0 && i < nElementos)
      vector[i] = valor;
    else
      System.out.println("Índice fuera de límites");
  }
  
  public double valorEn( int i )
  {
    if (i >= 0 && i < nElementos)
      return vector[i];
    else
    {
      System.out.println("Índice fuera de límites");
      return Double.NaN;
    }
  }
  
  public int longitud() { return nElementos; }
  
  public boolean equals(CVector v)
  {
    return Arrays.equals(vector, v.vector);      
  }
}
