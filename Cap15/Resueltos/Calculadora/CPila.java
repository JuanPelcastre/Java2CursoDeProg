//////////////////////////////////////////////////////////////////
// Pila: lista en la que todas las inserciones y supresiones se
// hacen en un extremo de la misma.
//
public class CPila<T> extends CListaCircularSE
{
  public CPila() {}
  
  public void meterEnPila(T obj)
  {
    añadirAlPrincipio(obj);
  }
  
  public T sacarDePila()
  {
    return (T)borrar();
  }
}
//////////////////////////////////////////////////////////////////
