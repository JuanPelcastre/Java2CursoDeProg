public class CListaLinealSEOrdenada extends CListaLinealSEO<CDatos>
{
  // Permite comparar dos elementos de la lista por
  // el atributo nombre.
  public int comparar(CDatos obj1, CDatos obj2)
  {
    String str1 = new String(obj1.obtenerNombre());
    String str2 = new String(obj2.obtenerNombre());
    return str1.compareTo(str2);
  }
}
