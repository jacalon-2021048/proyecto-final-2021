package com.jhon.modelo;

public class Materia {
	int codMateria;
	String nombreMateria;
	String descripcionMateria;
	
	public Materia(int codMateria,String nombreMateria,String descripcionMateria){
		this.codMateria=codMateria;
		this.nombreMateria=nombreMateria;
		this.descripcionMateria=descripcionMateria;
	}
	
	public int getCod(){
        return codMateria;
    }
	
	public String getNombreMat(){
		return nombreMateria;
	}
	
	public void setNombreMat(String nombreMateria){
		this.nombreMateria=nombreMateria;
	}
	
	public String getDescripMat(){
		return descripcionMateria;
	}
	
	public void setDescripMat(String descripcionMateria){
		this.descripcionMateria=descripcionMateria;
	}
	
}