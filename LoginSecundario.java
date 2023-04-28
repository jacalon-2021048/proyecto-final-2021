package com.jhon.vista;

import com.jhon.manejador.Datos;
import com.jhon.manejador.ManejadorLoginSecundario;

public class LoginSecundario {
	Datos dato=new Datos();
	ManejadorLoginSecundario mLoginS=new ManejadorLoginSecundario();
	String nombreUsuario;
	String claveUsuario;
	
	public void loginSecundario(){
		System.out.println("--------------------------------------------------");
		System.out.println("Bienvenido al login secundario");
		System.out.println("--------------------------------------------------");
		System.out.println("Ingrese el nombre de usuario");
		System.out.println("--------------------------------------------------");
		nombreUsuario=dato.ingresoTexto();
		nombreUsuario=nombreUsuario.toLowerCase();
		System.out.println("--------------------------------------------------");
		System.out.println("Ingrese la clave del usuario");
		System.out.println("--------------------------------------------------");
		claveUsuario=dato.ingresoTexto();
		mLoginS.loginSecundario(nombreUsuario,claveUsuario);
	}
}
