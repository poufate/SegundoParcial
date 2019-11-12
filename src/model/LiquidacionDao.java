package model;

import entities.Liquidacion;
import util.Conexion;

public class LiquidacionDao 
extends Conexion<Liquidacion> 
implements GenericDao<Liquidacion>{
public LiquidacionDao() {
	super(Liquidacion.class);
}


}
