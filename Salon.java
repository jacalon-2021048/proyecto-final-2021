package com.jhon.modelo;

public class Salon {
	int codSalon;
	String nombreSalon;
	String cantidadPerSalon;
	
	public Salon(int codSalon,String nombreSalon,String cantidadPerSalon){
		this.codSalon=codSalon;
		this.nombreSalon=nombreSalon;
		this.cantidadPerSalon=cantidadPerSalon;
	}
	
	public int getCod(){
        return codSalon;
    }
	
	public String getNombreSal(){
		return nombreSalon;
	}
	
	public void setNombreSal(String nombreSalon){
		this.nombreSalon=nombreSalon;
	}
	
	public String getPerSalon(){
		return cantidadPerSalon;
	}
	
	public void setPerSalon(String cantidadPerSalon){
		this.cantidadPerSalon=cantidadPerSalon;
	}
}