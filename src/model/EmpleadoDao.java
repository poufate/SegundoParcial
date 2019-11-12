package model;




	import util.Conexion;
	
import entities.Empleado;

	public class EmpleadoDao 
		extends Conexion<Empleado> 
		implements GenericDao<Empleado>{
		public EmpleadoDao() {
			super(Empleado.class);
		}


	}


