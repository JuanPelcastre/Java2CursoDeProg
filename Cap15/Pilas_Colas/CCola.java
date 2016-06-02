//////////////////////////////////////////////////////////////////
// Cola: lista en la que todas las inserciones se hacen por un
// extremo de la lista (por el final) y todas las supresiones se
// hacen por el otro extremo (por el principio).
//
public class CCola<T> extends CListaCircularSE<T>
{
  public CCola() {}
  
  public void meterEnCola(T obj)
  {
    añadirAlFinal(obj);
  }
  
  public T sacarDeCola()
  {
    return borrar();
  }
}
//////////////////////////////////////////////////////////////////
