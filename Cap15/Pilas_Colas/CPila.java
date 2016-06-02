//////////////////////////////////////////////////////////////////
// Pila: lista en la que todas las inserciones y supresiones se
// hacen en un extremo de la misma.
//
public class CPila<T> extends CListaCircularSE<T>
{
  public CPila() {}
  
  public void meterEnPila(T obj)
  {
    a�adirAlPrincipio(obj);
  }
  
  public T sacarDePila()
  {
    return borrar();
  }
}
//////////////////////////////////////////////////////////////////
