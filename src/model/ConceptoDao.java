package model;

import entities.Concepto;

import util.Conexion;

public class ConceptoDao 
extends Conexion<Concepto> 
implements GenericDao<Concepto>{
public ConceptoDao() {
	super(Concepto.class);
}


}