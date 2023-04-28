package com.jhon.vista;
import com.jhon.manejador.ManejadorLogin;
import com.jhon.manejador.Datos;
public class Login {
	Datos dato=new Datos();
	ManejadorLogin mLogin=new ManejadorLogin();
	String nombreUsuario;
	String claveUsuario;
	
	public void loginInicial(){
		System.out.println("Ingrese el nombre de usuario");
		nombreUsuario=dato.ingresoTexto();
		nombreUsuario=nombreUsuario.toLowerCase();
		System.out.println("Ingrese la clave del usuario");
		claveUsuario=dato.ingresoTexto();
		mLogin.loginInicial(nombreUsuario,claveUsuario);
	}
}