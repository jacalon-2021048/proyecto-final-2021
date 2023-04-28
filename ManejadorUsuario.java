package com.jhon.manejador;
import java.util.ArrayList;
import com.jhon.modelo.Usuario;
public class ManejadorUsuario {
	Usuario usuario=new Usuario();
	static ArrayList<Usuario> arregloUsuario=new ArrayList<Usuario>();
	
	public void ingresarUsuario(int idUsuario,String nombre,String clave,String rol){
		arregloUsuario.add(new Usuario(idUsuario,nombre,clave,rol));
	}
	
	public void eliminarUsuario(int idUsuario){
		arregloUsuario.remove(idUsuario);
		for(Usuario a:arregloUsuario){
			System.out.println(a.getId()+" "+a.getNombre()+" "+a.getClave()+" "+a.getRol());
		}
	}
	
	public void modificarUsuario(int idUsuario,char desicion,String datoModificar){
		int aux=0;
		for(Usuario b:arregloUsuario){
			if(b.getId()==idUsuario){
				switch(desicion){
					case '1':
						b.setNombre(datoModificar);
					break;
					case '2':
						b.setClave(datoModificar);
					break;
					case '3':
						b.setRol(datoModificar);
					break;
					default:
						System.out.println("Elejir un valor dentro de las opciones del menu");
					break;
				}
			}else{
				aux++;
			}
			if(aux==arregloUsuario.size()){
				System.out.println("--------------------------------------------------");
				System.out.println("El usuario no existe en el arreglo");
				System.out.println("--------------------------------------------------");
			}
		}
	}
	
	public void reporteUsuario(){
		System.out.println("Se muestran los datos ingresados al arreglo");
		for(Usuario c:arregloUsuario){
			System.out.println(c.getId()+" "+c.getNombre()+" "+c.getClave()+" "+c.getRol());
		}
	}

	public ArrayList<Usuario> copiaArUsu(){
		return arregloUsuario;
	}
}