package com.jhon.vista;
import java.util.ArrayList;
import com.jhon.manejador.Datos;
import com.jhon.manejador.ManejadorMateria;
import com.jhon.manejador.ManejadorInstructor;
import com.jhon.manejador.ManejadorSalon;
import com.jhon.manejador.ManejadorUsuario;
import com.jhon.modelo.Instructor;
public class PantallaDirector {
	Datos dato=new Datos();
	ManejadorMateria mMateria=new ManejadorMateria();
	ManejadorInstructor mInst=new ManejadorInstructor();
	ManejadorSalon mSalon=new ManejadorSalon();
	ManejadorUsuario mUsu=new ManejadorUsuario();
	LoginSecundario lS=new LoginSecundario();
	int busquedaCurso;
	int busquedaInst;
	int busquedaSal;
	int busquedaUsu;
	int idCurso=0;
	int idInstructor=0;
	int idSalon=0;
	int idUsuario=0;
	int apoyo=0;
	char menuOpciones;
	String opcion;
	String nombreMateria;
	String descripcionMateria;
	String datoMateriaModificar;
	String nombreInst;
	String apellidoInst;
	String telefonoInst;
	String direccionInst;
	String datoInstModificar;
	String nombreDelSalon;
	String cantidadPersonaSalon;
	String datoSalonModificar;
	String nombreDeUsuaio;
	String claveDeUsuario;
	String rolDeUsuario;
	String datoUsuModificar;
	String nombreUsuario;
	String claveUsuario;
	public void menuPrincipal(){
		System.out.println("-------------------------Menu del director-------------------------");
		System.out.println("1....Materia");
		System.out.println("2....Instructor");
		System.out.println("3....Salones");
		System.out.println("4....Usuario");
		System.out.println("5....Asignar");
		System.out.println("6....Salir(a pantalla de login)");
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
				this.menuSalones();
			break;
			case '4':
				this.menuUsuario();
			break;
			case '5':
				do{

					ArrayList<Instructor> listaInst = mInst.copiaArInst();
					
					ArrayList<String> asignaciones = new ArrayList<>();

					//System.out.println("Ingresa al ciclo for" + listaInst);					
					if(listaInst.isEmpty()){
						System.out.println("Viene vacio");
					}else{
						/*for(Instructor inst: listaInst) {
							System.out.println("Instructor: " + inst.getNombre() + " " + inst.getApellido() + inst.getCod());
						}
					}*/
					System.out.println("Ingresar el codigo de instructor para asignar");
					busquedaInst=dato.ingresoNumero();
					
					for(Instructor inst: listaInst) {
						//System.out.println("Instructor: " + inst.getNombre() + " " + inst.getApellido() + inst.getCod());
						if(inst.getCod() == busquedaInst) {
							System.out.println("Instructor seleccionado: " + inst.getNombre() + " " + inst.getApellido());
							
							System.out.println("Ingresar el codigo del curso para asignar");
							busquedaCurso=dato.ingresoNumero();
							
							System.out.println("Ingresar el codigo del salon para asignar");
							busquedaSal=dato.ingresoNumero();
				
							asignaciones.add("Instructor: " + inst.getCod()+ "Codigo Curso: " + busquedaCurso + "Salon: " + busquedaSal);
						}
					}

					  System.out.println("Asignaciones Actuales:");
					  for(String asings: asignaciones) {
						 System.out.println(asings);
						
					  }
					}
					
					//prueba instacia array instructores
					/*ArrayList<Instructor> listaInst = mInst.reporteInstructor();
					
					System.out.println("Ingresa al ciclo for" + listaInst);
					
					if (listaInst.isEmpty()){
						System.out.println("Viene vacio");
					}else {
						for(Instructor inst: listaInst) {
							System.out.println("Instructor: " + inst.getNombre() + " " + inst.getApellido() + inst.getCod());
						}
					}*/
					
					
					/*System.out.println("Ingresar el codigo del curso para asignar");
					busquedaCurso=dato.ingresoNumero();
					System.out.println("Ingresar el codigo del salon para asignar");
					busquedaSal=dato.ingresoNumero();
					System.out.println("Ingresar el dia de la clase");*/
					
					System.out.println("Desea asignar otro curso? si/no");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
			break;
			case '6':
				lS.loginSecundario();
			break;

			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}
	public void menuMateria(){
		System.out.println("--------------------------------------------------");
		System.out.println("1....Crear materia");
		System.out.println("2....Modificar materia");
		System.out.println("3....Eliminar materia");
		System.out.println("4....Regresar(a menu principal)");
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
				do{
					System.out.println("Ingrese el codigo de la materia a modificar:");
					busquedaCurso=dato.ingresoNumero();
					System.out.println("--------------------------------------------------");
					System.out.println("1....Modificar nombre de la materia");
					System.out.println("2....Modificar descripcion de la materia");
					System.out.println("Elija la opcion que desee y presione ENTER");
					System.out.println("--------------------------------------------------");
					menuOpciones=dato.ingresoCaracter();
					switch(menuOpciones){
						case '1':
							System.out.println("Ingrese el nuevo nombre de la materia:");
							datoMateriaModificar=dato.ingresoTexto();
						break;
						case '2':
							System.out.println("Ingrese la descripcion nueva a la materia:");
							datoMateriaModificar=dato.ingresoTexto();
						break;
						default:
							System.out.println("Elejir un valor dentro de las opciones del menu");
						break;
					}
					mMateria.modificarMateria(busquedaCurso,menuOpciones,datoMateriaModificar);
					mMateria.reporteMateria();
					System.out.println("Desea modificar otro curso?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuMateria();
			break;
			case '3':
				do{
					System.out.println("Ingrese el codigo de la materia a eliminar:");
					busquedaCurso=dato.ingresoNumero();
					mMateria.eliminarMateria(busquedaCurso);
					System.out.println("Desea eliminar otro curso?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuMateria();
			break;
			case '4':
				this.menuPrincipal();	
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}
	public void menuInstructor(){
		System.out.println("--------------------------------------------------");
		System.out.println("1....Crear instructor");
		System.out.println("2....Modificar instructor");
		System.out.println("3....Eliminar instructor");
		System.out.println("4....Regresar(a menu principal)");
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
				do{
					System.out.println("Ingrese el codigo del instructor a modificar:");
					busquedaInst=dato.ingresoNumero();
					System.out.println("--------------------------------------------------");
					System.out.println("1....Modificar nombre del profesor");
					System.out.println("2....Modificar apellido del profesor");
					System.out.println("3....Modificar telefono del instructor");
					System.out.println("4....Modificar direccion del instructor");
					System.out.println("Elija la opcion que desee y presione ENTER");
					System.out.println("--------------------------------------------------");
					menuOpciones=dato.ingresoCaracter();
					switch(menuOpciones){
						case '1':
							System.out.println("Ingrese el nuevo nombre del instructor:");
							datoInstModificar=dato.ingresoTexto();
						break;
						case '2':
							System.out.println("Ingrese el nuevo apellido del instructor:");
							datoInstModificar=dato.ingresoTexto();
						break;
						case '3':
							System.out.println("Ingrese el nuevo telefono del instructor:");
							datoInstModificar=dato.ingresoTexto();
						break;
						case '4':
							System.out.println("Ingrese la nueva direccion del instructor:");
							datoInstModificar=dato.ingresoTexto();
						break;
						default:
							System.out.println("Elejir un valor dentro de las opciones del menu");
						break;
					}
					mInst.modificacionInstructor(busquedaInst,menuOpciones,datoInstModificar);
					mInst.reporteInstructor();
					System.out.println("Desea modificar otro instructor?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuInstructor();
			break;
			case '3':
				do{
					System.out.println("Ingrese el codigo del instructor a eliminar:");
					busquedaInst=dato.ingresoNumero();
					mInst.eliminarIstructor(busquedaInst);
					System.out.println("Desea eliminar otro instructor?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuInstructor();
			break;
			case '4':
				this.menuPrincipal();	
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}
	public void menuSalones(){
		System.out.println("--------------------------------------------------");
		System.out.println("1....Crear salon");
		System.out.println("2....Modificar salon");
		System.out.println("3....Eliminar salon");
		System.out.println("4....Regresar(a menu principal)");
		System.out.println("Elija la opcion que desee y presione ENTER");
		System.out.println("--------------------------------------------------");
		menuOpciones=dato.ingresoCaracter();
		switch(menuOpciones){
			case '1':
				do{
					System.out.println("Ingrese el nombre del salon");
					nombreDelSalon=dato.ingresoTexto();
					System.out.println("Ingrese la cantidad de personas en el salon");
					cantidadPersonaSalon=dato.ingresoTexto();
					mSalon.ingresarSalon(idSalon,nombreDelSalon,cantidadPersonaSalon);
					idSalon++;
					mSalon.reporteSalon();
					System.out.println("Desea agregar otro salon?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuSalones();
			break;
			case '2':
				do{
					System.out.println("Ingrese el codigo del salon a modificar:");
					busquedaSal=dato.ingresoNumero();
					System.out.println("--------------------------------------------------");
					System.out.println("1....Modificar nombre del salon");
					System.out.println("2....Modificar numero de personas en el salon");;
					System.out.println("Elija la opcion que desee y presione ENTER");
					System.out.println("--------------------------------------------------");
					menuOpciones=dato.ingresoCaracter();
					switch(menuOpciones){
						case '1':
							System.out.println("Ingrese el nuevo nombre del salon:");
							datoSalonModificar=dato.ingresoTexto();
						break;
						case '2':
							System.out.println("Ingrese el numero de personas nuevas en el salon:");
							datoSalonModificar=dato.ingresoTexto();
						break;
						default:
							System.out.println("Elejir un valor dentro de las opciones del menu");
						break;
					}
					mSalon.modificarSalon(busquedaSal,menuOpciones,datoSalonModificar);
					mSalon.reporteSalon();
					System.out.println("Desea modificar otro salon?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuSalones();
			break;
			case '3':
				do{
					System.out.println("Ingrese el codigo del salon a eliminar:");
					busquedaSal=dato.ingresoNumero();
					mSalon.eliminarSalon(busquedaSal);
					System.out.println("Desea eliminar otro salon?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuSalones();
			break;
			case '4':
				this.menuPrincipal();	
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}
	public void menuUsuario(){
		System.out.println("--------------------------------------------------");
		System.out.println("1....Crear usuario");
		System.out.println("2....Modificar usuario");
		System.out.println("3....Eliminar usuario");
		System.out.println("4....Regresar(a menu principal)");
		System.out.println("Elija la opcion que desee y presione ENTER");
		System.out.println("--------------------------------------------------");
		menuOpciones=dato.ingresoCaracter();
		switch(menuOpciones){
			case '1':
				do{
					System.out.println("Ingrese el nombre del usuario a crear:");
					nombreDeUsuaio=dato.ingresoTexto();
					System.out.println("Ingrese la clave del usuario a crear:");
					claveDeUsuario=dato.ingresoTexto();
					System.out.println("Ingrese el rol del usuario a crear:");
					rolDeUsuario=dato.ingresoTexto();
					mUsu.ingresarUsuario(idUsuario,nombreDeUsuaio,claveDeUsuario,rolDeUsuario);
					idUsuario++;
					mUsu.reporteUsuario();
					System.out.println("Desea agregar otro usuario?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuUsuario();
			break;
			case '2':
				do{
					System.out.println("Ingrese el codigo del usuario a modificar:");
					busquedaUsu=dato.ingresoNumero();
					System.out.println("--------------------------------------------------");
					System.out.println("1....Modificar el nombre del usuario");
					System.out.println("2....Modificar la clave del usuario");
					System.out.println("3....Modificar el rol del usuario");
					System.out.println("Elija la opcion que desee y presione ENTER");
					System.out.println("--------------------------------------------------");
					menuOpciones=dato.ingresoCaracter();
					switch(menuOpciones){
						case '1':
							System.out.println("Ingrese el nuevo nombre del usuario:");
							datoUsuModificar=dato.ingresoTexto();
						break;
						case '2':
							System.out.println("Ingrese la nueva clave del usuario:");
							datoUsuModificar=dato.ingresoTexto();
						break;
						case '3':
							System.out.println("Ingrese el nuevo rol del usuario:");
							datoUsuModificar=dato.ingresoTexto();
						break;
						default:
							System.out.println("Elejir un valor dentro de las opciones del menu");
						break;
					}
					mUsu.modificarUsuario(busquedaUsu,menuOpciones,datoUsuModificar);
					mUsu.reporteUsuario();
					System.out.println("Desea modificar otro usuario?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuUsuario();
			break;
			case '3':
				do{
					System.out.println("Ingrese el id del usuario a eliminar:");
					busquedaUsu=dato.ingresoNumero();
					mUsu.eliminarUsuario(busquedaUsu);
					System.out.println("Desea eliminar otro usuario?");
					opcion=dato.ingresoTexto();
					opcion=opcion.toLowerCase();
				}while(opcion.equals("si"));
				this.menuUsuario();
			break;
			case '4':
				this.menuPrincipal();	
			break;
			default:
				System.out.println("Elejir un valor dentro de las opciones del menu");
			break;
		}
	}

	/*public void loginSecundario(String user,String clave){
		ArrayList<Usuario> arregloUsu=mUsu.copiaArUsu();
		PantallaCoordinador pC=new PantallaCoordinador();
		if(arregloUsu.isEmpty()){
			System.out.println("Ingrese un usuario primero, para que el login funcione correctamente");
		}else{
			for(Usuario c:arregloUsu){
				if(user.equals(c.getNombre()) && clave.equals(c.getClave())){
					if(c.getRol().equals("d")){
						System.out.println("Bienvenido al sistema director");
						this.menuPrincipal();
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
	}*/
}