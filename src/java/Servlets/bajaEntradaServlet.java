
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "bajaEntradaServlet", urlPatterns = {"/bajaEntradaServlet"})
public class bajaEntradaServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_entrada = Integer.parseInt(request.getParameter("id"));
        
        Controladora control = new Controladora();
        control.EliminarEntrada(id_entrada);
        
        response.sendRedirect("listaEntradas.jsp");
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        
        int id_entrada = Integer.parseInt(request.getParameter("id"));
        
        Controladora control = new Controladora();
        control.EliminarEntrada(id_entrada);
        
        response.sendRedirect("listaEntradas.jsp");
           
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
