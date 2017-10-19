package Servlets;

import Producto.ProductoPunto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dylan Josel Vaca Méndez 
 */
public class ServletProducto extends HttpServlet {
    
    private ProductoPunto prod;

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req servlet req
     * @param res servlet res
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        double magnitud1 = Double.parseDouble(req.getParameter("mag1"));
        double magnitud2 = Double.parseDouble(req.getParameter("mag2"));
        double angulo = Double.parseDouble(req.getParameter("angulo"));
        double resultado = 0;
        prod = new ProductoPunto();
        resultado = prod.Producto(magnitud1, magnitud2, angulo);
        
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet NewServlet</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>El producto punto es " + resultado + "</h1>");
        out.println("</body>");
        out.println("</html>");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
