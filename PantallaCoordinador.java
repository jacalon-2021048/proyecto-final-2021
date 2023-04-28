package com.jhon.vista;
import com.jhon.manejador.Datos;
import com.jhon.manejador.ManejadorMateria;
import com.jhon.manejador.ManejadorInstructor;
import com.jhon.manejador.ManejadorUsuario;
public class PantallaCoordinador {
	Datos dato=new Datos();
	ManejadorMateria mMateria=new ManejadorMateria();
	ManejadorInstructor mInst=new ManejadorInstructor();
	//ManejadorAsignar mAsi=new ManejadorAsignar();
	ManejadorUsuario mUsu=new ManejadorUsuario();
	LoginSecundario lS=new LoginSecundario();
	int idCurso=0;
	int idInstructor=0;
	int apoyo=0;
	char menuOpciones;
	String nombreMateria;
	String descripcionMateria;
	String nombreInst;
	String apellidoInst;
	String telefonoInst;
	String direccionInst;
	String opcion;
	String nombreUsuario;
	String claveUsuario;
	public void menuCoordinador(){
		System.out.println("-------------------------Menu del coordinador-------------------------");
		System.out.println("1....Materia");
		System.out.println("2....Instructor");
		//System.out.println("3....Asignar");
		System.out.println("4....Salir(a pantalla de login)");
		System.out.println("Elija la opcion que desee y presione ENTER");
		System.out.println("--------------------------------------------------");
		menuOpciones=dato.ingresoCaracter();
		switch(menuOpciones){
			case '1':
				this.menuMateria();
			break;
			case '2':
				this.menuInstructor();
			break;
			case '3':
				
			break;
			case '4':
				lS.loginSecundario();
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}
	
	public void menuMateria(){
		System.out.println("--------------------------------------------------");
		System.out.println("1....Crear");
		System.out.println("2....Regresar(a menu principal)");
		System.out.println("Elija la opcion que desee y presione ENTER");
		System.out.println("--------------------------------------------------");
		menuOpciones=dato.ingresoCaracter();
		switch(menuOpciones){
			case '1':
				do{
					System.out.println("Ingrese el nombre de la materia");
					nombreMateria=dato.ingresoTexto();
					System.out.println("Ingrese una breve descripcion de la materia");
					descripcionMateria=dato.ingresoTexto();
					mMateria.ingresarMateria(idCurso,nombreMateria,descripcionMateria);
					idCurso++;
					mMateria.reporteMateria();
					System.out.println("Desea agregar otro curso?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuMateria();
			break;
			case '2':
				this.menuCoordinador();
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}
	
	public void menuInstructor(){
		System.out.println("--------------------------------------------------");
		System.out.println("1....Crear");
		System.out.println("2....Regresar(a menu principal)");
		System.out.println("Elija la opcion que desee y presione ENTER");
		System.out.println("--------------------------------------------------");
		menuOpciones=dato.ingresoCaracter();
		switch(menuOpciones){
			case '1':
				do{
					System.out.println("Ingrese el nombre del instructor");
					nombreInst=dato.ingresoTexto();
					System.out.println("Ingrese el apellido del instructor");
					apellidoInst=dato.ingresoTexto();
					System.out.println("Ingrese el telefono del instructor");
					telefonoInst=dato.ingresoTexto();
					System.out.println("Ingrese la direccion del instructor");
					direccionInst=dato.ingresoTexto();
					mInst.ingresarInstructor(idInstructor,nombreInst,apellidoInst,telefonoInst,direccionInst);
					idInstructor++;
					mInst.reporteInstructor();
					System.out.println("Desea agregar otro instructor?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuInstructor();
			break;
			case '2':
				this.menuCoordinador();
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}

	/*public void loginSecundario(String user,String clave){
		PantallaDirector pD=new PantallaDirector();
		pD.loginSecundario(user,clave);
	}*/
}