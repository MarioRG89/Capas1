package com.mario;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mario.negocio.LogicaNegocio;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/respuesta")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LogicaNegocio n = new LogicaNegocio();
		String nombre=request.getParameter("nombre");
		Integer numero = n.calculaCoches(request.getParameter("nombre"));
		request.setAttribute("numeroCoches", numero);
		request.setAttribute("name", nombre);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/respuestaCoches.jsp");
		dispatcher.forward(request, response);
		
		/*out.print("<html> <body>");
		out.print("<h1> El numero aleatorio es " + n.calculaCoches(request.getParameter("nombre")) + "</h1>");
		out.print("</body></html>");*/
	}

}
