package com.jhon.modelo;

public class Usuario {
	int idUsuario;
	String nombre;
	String clave;
	String rol;
	public Usuario(){
		idUsuario=0;
		nombre="admin";
		clave="1234";
		rol="d";
	}
	public Usuario(int idUsuario,String nombre,String clave,String rol){
		this.idUsuario=idUsuario;
		this.nombre=nombre;
		this.clave=clave;
		this.rol=rol;
	}
	public int getId(){
        return idUsuario;
    }
    public void setId(int idUsuario){
        this.idUsuario=idUsuario;
    }
	public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
	public String getClave(){
        return clave;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
	public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol=rol;
    }
}