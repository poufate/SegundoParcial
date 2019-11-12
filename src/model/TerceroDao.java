package model;

import entities.Tercero;
import util.Conexion;

public class TerceroDao 
extends Conexion<Tercero> 
implements GenericDao<Tercero>{
public TerceroDao() {
	super(Tercero.class);
}


}