package util;

import java.util.Date;

import entities.*;
import model.*;
public class Prueba {

	public static void main(String[] args) {
		
		Date fecha= new Date();
		EmpleadoDao ed= new EmpleadoDao(); 
		Empleado e= new Empleado();
		System.out.print(e.getNombre().equals(null));
		Concepto c= new Concepto();
		ConceptoDao cd= new ConceptoDao();
	
		c= cd.find("SUEBA");
		
		System.out.print("Concepto="+c.getCodconcepto()+", Descripcion="+c.getDescripcion()+"Cod tercero= "+c.getTercero());
		
		
		e.setNombre("Probando");
		e.setCedula("100");
		e.setFechaingreso(fecha);
		e.setCodigo("11");
		e.setFechanacimiento(fecha);
		e.setFecharetiro(fecha);
		ed.insert(e);
		System.out.print("insertado");
	}

}
