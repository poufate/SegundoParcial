package model;

import entities.Proceso;
import util.Conexion;

public class ProcesoDao 
extends Conexion<Proceso> 
implements GenericDao<Proceso>{
public ProcesoDao() {
	super(Proceso.class);
}


}
