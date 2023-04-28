package com.jhon.manejador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Datos {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	
	public String ingresoTexto(){
		String texto=null;
		try{
			texto=bf.readLine();
		}catch(IOException ioe){
			System.out.println("Error al ingreso de datos");
			System.exit(1);
		}
		return texto;
	}
	
	public int ingresoNumero(){
		int numero=0;
		try{
			numero=Integer.parseInt(bf.readLine());
		}catch(IOException ioe){
			System.out.println("Error al ingreso de datos");
			System.exit(1);
		}
		return numero;
	}
	
	public char ingresoCaracter(){
		String texto1=null;
		char caracter='\u0000';
		try{
			texto1=bf.readLine();
			caracter=texto1.charAt(0);
		}catch(IOException ioe){
			System.out.println("Error al ingreso de datos");
			System.exit(1);
		}
		return caracter;
	}
}