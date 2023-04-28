package com.jhon.modelo;

public class Instructor {
	int codInstructor;
	String nombre;
	String apellido;
	String telefono;
	String direccion;
	
	public Instructor(int codInstructor,String nombre,String apellido,String telefono,String direccion){
		this.codInstructor=codInstructor;
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	
	public int getCod(){
        return codInstructor;
    }
	
	public String getNombre(){
        return nombre;
    }
	
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
	public String getApellido(){
		return apellido;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
}