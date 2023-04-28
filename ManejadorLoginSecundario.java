package com.jhon.manejador;

import java.util.ArrayList;

import com.jhon.modelo.Usuario;
import com.jhon.vista.PantallaCoordinador;
import com.jhon.vista.PantallaDirector;
public class ManejadorLoginSecundario {
	ManejadorUsuario mUsu=new ManejadorUsuario();
	int apoyo=0;
	public void loginSecundario(String user,String clave){
		
		ArrayList<Usuario> arregloUsu=mUsu.copiaArUsu();
		PantallaCoordinador pC=new PantallaCoordinador();
		PantallaDirector pD=new PantallaDirector();
		System.out.println(arregloUsu.size());
		if(arregloUsu.isEmpty()){
			System.out.println("Ingrese un usuario primero, para que el login funcione correctamente");
		}else{
			for(Usuario c:arregloUsu){
				if(user.equals(c.getNombre()) && clave.equals(c.getClave())){
					if(c.getRol().equals("d")){
						System.out.println("Bienvenido al sistema director");
						pD.menuPrincipal();
					}else if(c.getRol().equals("c")){
						System.out.println("Bienvenido al sistema coordinador");
						pC.menuCoordinador();
					}
				}else{
					apoyo++;
				}
			}
			if(apoyo==arregloUsu.size()){
				System.out.println("El nombre de usuario no existe");
			}
		}
	}
}
