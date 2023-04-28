package com.jhon.manejador;
import java.util.ArrayList;
import com.jhon.modelo.Salon;
public class ManejadorSalon {
	ArrayList<Salon> arrSalon=new ArrayList<Salon>();
	
	public void ingresarSalon(int codSalon,String nombreSalon,String cantidadPerSalon){
		arrSalon.add(new Salon(codSalon,nombreSalon,cantidadPerSalon));
	}
	
	public void modificarSalon(int codSalon,char desicion,String datoModificar){
		int aux=0;
		for(Salon a:arrSalon){
			if(a.getCod()==codSalon){
				switch(desicion){
					case '1':
						a.setNombreSal(datoModificar);
					break;
					case '2':
						a.setPerSalon(datoModificar);
					break;
					default:
						System.out.println("Elejir un valor dentro de las opciones del menu");
					break;
				}
			}else{
				aux++;
			}
			if(aux==arrSalon.size()){
				System.out.println("--------------------------------------------------");
				System.out.println("El salon no existe en el arreglo");
				System.out.println("--------------------------------------------------");
			}	
		}
	}
	
	public void reporteSalon(){
		System.out.println("Se muestran los datos ingresados al arreglo");
		for(Salon b:arrSalon){
			System.out.println(b.getCod()+" "+b.getNombreSal()+" "+b.getPerSalon());
		}
	}
	
	public void eliminarSalon(int codSalon){
		arrSalon.remove(codSalon);
		for(Salon c:arrSalon){
			System.out.println(c.getCod()+" "+c.getNombreSal()+" "+c.getPerSalon());
		}
	}
	
	public ArrayList<Salon> copiaArSal(){
		return arrSalon;
	}
}