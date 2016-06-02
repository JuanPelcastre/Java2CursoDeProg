import java.util.*;

/////////////////////////////////////////////////////////////////
// Definición de la clase genérica CVector
//
public class CVector<T> implements Comparable<T>
{
  private ArrayList<T> vector; // matriz vector
  
  // Crear una matriz con un espacio para n elementos
  public CVector(int... ne) // ne elementos
  {
    int nElementos;
    if ( ne.length < 1 )
      nElementos = 10; // elementos por omisión
    else
      nElementos = ne[0];
    
    vector = new ArrayList<T>(nElementos);
  }
  
  // Crear una matriz a partir de otra matriz primitiva
  public CVector(T[] m) // crea un CVector desde una matriz
  {
    int nElementos = m.length;
    vector = new ArrayList<T>(nElementos);
    // Copiar los elementos de la matriz m
    for ( int i = 0; i < nElementos; i++ )
      vector.add(m[i]);
  }
  
  // Constructor copia
  public CVector(final CVector v) // constructor copia
  {
    copiar(v);
  }
  
  // Copia un vector en otro
  public CVector copiar(final CVector v) // copia un CVector en otro
  {
    int nElementos = v.longitud();
    vector = new ArrayList<T>(nElementos);
    // Copiar el objeto v
    for ( int i = 0; i < nElementos; i++ )
      vector.add((T)v.vector.get(i));
    
    return this;
  }
  
  public void ponerValorEn( int i, T valor )
  {
    int nElementos = this.longitud();
    if (i >= 0 && i < nElementos)
      vector.set(i, valor);
    else
      System.out.println("Índice fuera de límites");
  }
  
  public T valorEn( int i )
  {
    if (i >= 0 && i < this.longitud())
      return vector.get(i);
    else
    {
      System.out.println("Índice fuera de límites");
      return null;
    }
  }
  
  public int longitud() { return vector.size(); }
  
  public ArrayList<T> colección() { return vector; }
  
  // Como ejercicio, complete el código según se explica en el libro

}
