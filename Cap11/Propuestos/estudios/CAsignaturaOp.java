public class CAsignaturaOp extends CAsignatura
{
  public CAsignaturaOp(int id, String nom)
  {
    super(id, nom);
  }

  public CAsignaturaOp(final CAsignaturaOp asob)
  {
    super(asob);
  }
  
  public CAsignaturaOp copiar(final CAsignaturaOp asob)
  {
    super.copiar(asob);
    return this;
  }
  
  public CAsignaturaOp clonar()
  {
    return new CAsignaturaOp(this);
  }
}
