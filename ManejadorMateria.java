package com.jhon.manejador;
import java.util.ArrayList;
import com.jhon.modelo.Materia;
public class ManejadorMateria {
	ArrayList<Materia> agMateria=new ArrayList<Materia>();
	
	public void ingresarMateria(int codMateria,String nombreMateria,String descripcion){
		agMateria.add(new Materia(codMateria,nombreMateria,descripcion));
	}
	
	public void reporteMateria(){
		System.out.println("Se muestran los datos ingresados al arreglo");
		for(Materia a:agMateria){
			System.out.println(a.getCod()+" "+a.getNombreMat()+" "+a.getDescripMat());
		}
	}
	
	public void modificarMateria(int codigoMateria,char desicion,String datoModificar){
		int aux=0;
		for(Materia b:agMateria){
			if(b.getCod()==codigoMateria){
				switch(desicion){
					case '1':
						b.setNombreMat(datoModificar);
					break;
					case '2':
						b.setDescripMat(datoModificar);
					break;
					default:
						System.out.println("Elejir un valor dentro de las opciones del menu");
					break;
				}
			}else{
				aux++;
			}
			if(aux==agMateria.size()){
				System.out.println("--------------------------------------------------");
				System.out.println("La materia no existe en el arreglo");
				System.out.println("--------------------------------------------------");
			}	
		}
	}
	
	public void eliminarMateria(int codMateria){
		agMateria.remove(codMateria);
		for(Materia c:agMateria){
			System.out.println(c.getCod()+" "+c.getNombreMat()+" "+c.getDescripMat());
		}
	}
	
	public ArrayList<Materia> copiaArMat(){
		return agMateria;
	}
}