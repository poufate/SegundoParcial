package model;

import entities.Tipoconcepto;
import util.Conexion;

public class TipoconceptoDao 
extends Conexion<Tipoconcepto> 
implements GenericDao<Tipoconcepto>{
public TipoconceptoDao() {
	super(Tipoconcepto.class);
}


}
