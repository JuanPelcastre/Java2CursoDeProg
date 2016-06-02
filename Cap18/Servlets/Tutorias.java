import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Tutorias extends HttpServlet
{
  public void doGet(HttpServletRequest request,  
                    HttpServletResponse response)
  throws IOException, ServletException
  {  
    doPost(request, response);  
  }

  // Manipular la petici�n enviada por el cliente
  // utilizando el atributo method=post.
  protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
  throws ServletException, IOException
  {
    // Tipo de la respuesta que ser� enviada al cliente
    response.setContentType("text/html");

    // Obtener el objeto 'PrintWriter' para devolver la respuesta
    PrintWriter out = response.getWriter();

    // Registrar la tutor�a
    try
    {
      // Abrir el fichero para el registro de la tutor�a solicitada
      FileWriter fw = new FileWriter("tutorias.txt", true);
      PrintWriter fichTutorias = new PrintWriter(fw);

      // Tomar los datos recibidos del cliente y escribirlos
      // en el fichero. Se finaliza cada registro con la marca
      // <FIN> para su posterior identificaci�n.


      // Como ejercicio, complete el c�digo seg�n se explica en el libro


      // Cerrar el fichero
      fichTutorias.close(); 
      fw.close();

      // Responder al cliente
      out.println("<html>");
      out.println("<title>Respuesta a la solicitud</title>");
      out.println("Su petici�n ha sido registrada<br>Un saludo");
      out.println("</html>");
    }
    catch(IOException e)
    {
      out.println("Hubo problemas cursando su solicitud." +
                  "<br>Por favor, int�ntelo otra vez.");
    }
    // Cerrar el flujo
    out.close();
  }
  
  // Devuelve una descripci�n breve.
  public String getServletInfo()
  {
    return "Servlet Tutor�as";
  }
}
