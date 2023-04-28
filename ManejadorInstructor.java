package com.jhon.manejador;
import java.util.ArrayList;
import com.jhon.modelo.Instructor;
public class ManejadorInstructor {
	ArrayList<Instructor> arrInstru=new ArrayList<Instructor>();
	
	public void ingresarInstructor(int codInstructor,String nombre,String apellido,String telefono,String direccion){
		arrInstru.add(new Instructor(codInstructor,nombre,apellido,telefono,direccion));
	}
	
	public void modificacionInstructor(int codInstructor,char desicion,String datoModificar){
		int aux=0;
		for(Instructor a:arrInstru){
			if(a.getCod()==codInstructor){
				switch(desicion){
					case '1':
						a.setNombre(datoModificar);
					break;
					case '2':
						a.setApellido(datoModificar);
					break;
					case '3':
						a.setTelefono(datoModificar);
					break;
					case '4':
						a.setDireccion(datoModificar);
					break;
					default:
						System.out.println("Elejir un valor dentro de las opciones del menu");
					break;
				}
			}else{
				aux++;
			}
			if(aux==arrInstru.size()){
				System.out.println("--------------------------------------------------");
				System.out.println("El instructor no existe en el arreglo");
				System.out.println("--------------------------------------------------");
			}	
		}
	}
	
	public void reporteInstructor(){
		System.out.println("Se muestran los datos ingresados al arreglo");
		for(Instructor b:arrInstru){
			System.out.println(b.getCod()+" "+b.getNombre()+" "+b.getApellido()+" "+b.getTelefono()+" "+b.getDireccion());
		}
	}
	
	public void eliminarIstructor(int codInstructor){
		arrInstru.remove(codInstructor);
		for(Instructor c:arrInstru){
			System.out.println(c.getCod()+" "+c.getNombre()+" "+c.getApellido()+" "+c.getTelefono()+" "+c.getDireccion());
		}
	}
	
	public ArrayList<Instructor> copiaArInst(){
		return arrInstru;
	}
}