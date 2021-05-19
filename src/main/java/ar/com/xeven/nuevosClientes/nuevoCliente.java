package ar.com.xeven.nuevosClientes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "nuevoCliente", value = "/nuevoCliente")
public class nuevoCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String nombre = request.getParameter("nombre");
        String empresa = request.getParameter("empresa");

        PrintWriter out = response.getWriter();
        out.println("hola "+nombre);
        out.println("<br /><br/>"+empresa);

    }
}
