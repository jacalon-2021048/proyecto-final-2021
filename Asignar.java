package com.jhon.modelo;

public class Asignar {//CLASE SIN USO
	String instructor;
	String materia;
	String salon;
	String dia;
	
	public Asignar(String instructor,String materia,String salon,String dia){
		this.instructor=instructor;
		this.materia=materia;
		this.salon=salon;
		this.dia=dia;	
	}

	public String getInstructor(){
		return instructor;
	}

	public String getMateria(){
		return materia;
	}

	public String getSalon(){
		return salon;
	}

	public String getDia(){
		return dia;
	}

}