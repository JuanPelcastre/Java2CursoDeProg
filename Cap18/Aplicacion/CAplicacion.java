/* CAplicación.java
 */

/**
 * @autor  Fco. Javier Ceballos
 * @versión 1.0
 */
public class CAplicacion extends javax.swing.JFrame
{
  /** Crear un nuevo formulario de la clase CAplicación */
  public CAplicacion()      // constructor
  {
    setSize(300, 200);      // tamaño del formulario
    setTitle("Aplicación"); // título del formulario
    initComponents();       // iniciar los controles o componentes
  }

  /** Este método es llamado desde el constructor CAplicación */
  private void initComponents()
  {
    jEtSaludo = new javax.swing.JLabel();
    jBtSaludo = new javax.swing.JButton();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jEtSaludo.setFont(new java.awt.Font("Dialog", 1, 18));
    jEtSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jEtSaludo.setText("etiqueta");
    getContentPane().add(jEtSaludo);
    jEtSaludo.setBounds(42, 36, 204, 30);

    jBtSaludo.setMnemonic('c');
    jBtSaludo.setText("Haga clic aquí");
    jBtSaludo.setToolTipText("botón de pulsación");
    jBtSaludo.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jBtSaludoActionPerformed(evt);
      }
    });

    getContentPane().add(jBtSaludo);
    jBtSaludo.setBounds(42, 90, 204, 30);

  }
  
  private void jBtSaludoActionPerformed (java.awt.event.ActionEvent evt)
  {
    float rojo = (float)Math.random();
    float verde = (float)Math.random();
    float azul = (float)Math.random();
    jEtSaludo.setForeground(new java.awt.Color(rojo, verde, azul));
    jEtSaludo.setText("¡¡¡Hola mundo!!!");
  }
  
  /** Exit the Application */
  private void exitForm(java.awt.event.WindowEvent evt)
  {
    System.exit(0);
  }
  
  /**
   * @parámetro args: argumentos pasados en la línea de órdenes */
  public static void main(String args[])
  {
    new CAplicacion().setVisible(true);
  }
  
  
  // Declaración de variables
  private javax.swing.JButton jBtSaludo;
  private javax.swing.JLabel jEtSaludo;
  
}