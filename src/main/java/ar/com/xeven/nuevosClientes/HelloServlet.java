package ar.com.xeven.nuevosClientes;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:#e0ac6d;'>");
        out.println("<h1>Acceso denegado, ingrese por el formulario.");
        out.println("</body></html>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:#e0ac6d;'>");
        if(clave.equals("unafacil"))
            out.println("Hola "+usuario);
        else
            out.println("Clave incorrecta!!");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}