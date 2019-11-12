package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Empleado;
import model.EmpleadoDao;

/**
 * Servlet implementation class registrar
 */
@WebServlet("/registrar")
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Empleado e= new Empleado();
		Empleado re= new Empleado();
		EmpleadoDao ed= new EmpleadoDao();

		/*try {
			if(ed.find(request.getParameter("codigo")).getNombre()==null)
			{
	estado=false;
			}else {
	estado=true;
			}
			}catch(Exception ex) {
				estado=true;
			}
		
		System.out.print(estado);
		*/
		/*
		try {
			e=ed.find(request.getParameter("codigo"));
			response.getWriter().append("ya registrado");
			}catch(NullPointerException ex) {
				Date fecha= new Date();
				e.setCodigo(request.getParameter("codigo"));
				e.setCedula(request.getParameter("cedula"));
		        e.setNombre(request.getParameter("nombre"));
		        String fechare=request.getParameter("fechanac");
		        try {
					fecha= new SimpleDateFormat("yyyy-MM-dd").parse(fechare);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        e.setFechanacimiento(fecha);
		         fechare=request.getParameter("fechaing");
		         try {
		 			fecha= new SimpleDateFormat("yyyy-MM-dd").parse(fechare);
		 		} catch (ParseException e1) {
		 			// TODO Auto-generated catch block
		 			e1.printStackTrace();
		 		}//3167151441
		         e.setFechaingreso(fecha);
		         fechare=request.getParameter("fecharet");
		         try {
		  			fecha= new SimpleDateFormat("yyyy-MM-dd").parse(fechare);
		  		} catch (ParseException e1) {
		  			// TODO Auto-generated catch block
		  			e1.printStackTrace();
		  		}
		         e.setFecharetiro(fecha);
		         ed.insert(e);
		         response.getWriter().append("ya terminado");
		}
			}
		
		*/
		
		
		
		
		
		try {
		
		Date fecha= new Date();
		e.setCodigo(request.getParameter("codigo"));
		e.setCedula(request.getParameter("cedula"));
        e.setNombre(request.getParameter("nombre"));
        String fechare=request.getParameter("fechanac");
        try {
			fecha= new SimpleDateFormat("yyyy-MM-dd").parse(fechare);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        e.setFechanacimiento(fecha);
         fechare=request.getParameter("fechaing");
         try {
 			fecha= new SimpleDateFormat("yyyy-MM-dd").parse(fechare);
 		} catch (ParseException e1) {
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}//3167151441
         e.setFechaingreso(fecha);
         fechare=request.getParameter("fecharet");
         try {
  			fecha= new SimpleDateFormat("yyyy-MM-dd").parse(fechare);
  		} catch (ParseException e1) {
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		}
         e.setFecharetiro(fecha);
         ed.insert(e);
	
		}catch(Exception ex) {
			response.getWriter().append("ya inscrito");
		}
}}



