package com.jhon.manejador;
import com.jhon.modelo.Usuario;
import com.jhon.vista.PantallaCoordinador;
import com.jhon.vista.PantallaDirector;
public class ManejadorLogin {
	Usuario usuario=new Usuario();
	PantallaDirector pantDir=new PantallaDirector();
	PantallaCoordinador pantCoo=new PantallaCoordinador();
	public void loginInicial(String user,String clave){
		if(user.equals(usuario.getNombre())&& clave.equals(usuario.getClave())){
			if(usuario.getRol().equals("d")){
				pantDir.menuPrincipal();
			}else if(usuario.getRol().equals("c")){
				pantCoo.menuCoordinador();
			}
		}else{
			System.out.println("Los datos ingresados no son correctos");
		}
	}
}