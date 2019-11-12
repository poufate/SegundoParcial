package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Empleado;
import model.EmpleadoDao;

/**
 * Servlet implementation class buscar
 */
@WebServlet("/buscar")
public class Buscar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Buscar() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String codigo= request.getParameter("empleado");
		Empleado e=new Empleado();
		EmpleadoDao ed= new EmpleadoDao();
		
		try {
		e=ed.find(codigo);
		response.getWriter().append("here: ").append(e.toString());
		}catch(NullPointerException ex) {
			response.getWriter().append("here: ").append("no encontrado");
	}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("here: ").append(request.getParameter("empleado"));
	}

}
