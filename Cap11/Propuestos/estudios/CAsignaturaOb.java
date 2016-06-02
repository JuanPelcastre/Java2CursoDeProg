public class CAsignaturaOb extends CAsignatura
{
  public CAsignaturaOb(int id, String nom)
  {
    super(id, nom);
  }

  public CAsignaturaOb(final CAsignaturaOb asob)
  {
    super(asob);
  }
  
  public CAsignaturaOb copiar(final CAsignaturaOb asob)
  {
    super.copiar(asob);
    return this;
  }
  
  public CAsignaturaOb clonar()
  {
    return new CAsignaturaOb(this);
  }
}
