package pb1dominio;

import pb1dominio.enums.Especialidades;
import pb1dominio.Turnos;

public class Hospital {

	public static final double PARTICULAR= 0.0;
	public static final double OBRA_SOCIAl= 0.70;
	public static final double PREPAGA=1.00;
	
	private String nombre;
	private String ubicacion;
	private Doctores[] doctores;
	private Pacientes[] pacientes;
	private Doctores[] especialidadesDisponibles;
	private Usuario usuario;

	public Hospital(String nombre) {

		this.nombre = nombre;
		this.especialidadesDisponibles = new Doctores[7];
		this.pacientes = new Pacientes[500];
		this.inicializarMedicosDisponibles();
		// Crear la clase usuario y el metodo registrar que estara en esta clase.
		registrarUsuario(this.usuario);

	}

	private void registrarUsuario(Usuario usuario) {
		this.usuario = usuario;

	}

	private void inicializarMedicosDisponibles() {

		// SE ME HIZO DIFICIL, QUIERO RESOLVER HARDCODEANDO 7 DOCTORES Y
		// DAR LA OPCION DE CREAR NUEVOS PIDIENDO LOS DATOS AL ADMIN
		// USE EL ARRAY "this.especialidadesDisponibles" PARA CREAR LA CANTIDAD DE
		// DOCTORES QUE VAMOS
		// A TENER AL INICIALIZAR NUESTRO HOSPITAL, Y QUEREMOS DAR LA OPCION DE AGREGAR
		// MAS. "resuelvo esto con el metodo "private boolean agregarMedico();"

		this.especialidadesDisponibles[0] = new Doctores("Mariana", "Schneider", Especialidades.CLINICA_MEDICA,
				"Mañana", "Lunes a Jueves");
		this.especialidadesDisponibles[1] = new Doctores("Ana", "Fittipaldi", Especialidades.GINECOLOGIA, "Tarde",
				"Miercoles y Viernes");
		this.especialidadesDisponibles[2] = new Doctores("Omar", "Paez", Especialidades.CARDIOLOGIA, "Mañana",
				"Martes a Viernes");
		this.especialidadesDisponibles[3] = new Doctores("Ines", "Arnaldi", Especialidades.TRAUMATOLOGIA, "Tarde",
				"Lunes, Miercoles y Viernes");
		this.especialidadesDisponibles[4] = new Doctores("Victor", "Toranti", Especialidades.TRAUMATOLOGIA, "Mañana",
				"Martes y Jueves");
		this.especialidadesDisponibles[5] = new Doctores("Hugo", "Vera", Especialidades.GINECOLOGIA, "Mañana",
				"Lunes a Jueves");
		this.especialidadesDisponibles[6] = new Doctores("Mia", "Krum", Especialidades.NUTRICION, "Tarde",
				"Miercoles y Viernes");

		// ¿ Como genero un aleatorio para nombres, apellidos, fechas y horarios?
		/*
		 * for (int i = 0; i < Especialidades.values().length; i++) { //
		 * this.pescialidades.values[i] this.especialidadesDisponibles[i] =
		 * this.agregarMedico(" ", " ", Especialidades.values()[i], "", ""); } // true;
		 * //"12/11" "martes"
		 */

	}

	public boolean agregarDoctores(String nombre, String apellido, Especialidades especialidad, String horarioDeAtencion,
			String diasDisponibles) {

		// SI QUIERO DAR LA OPCION DE AGREGAR UN MEDICO, DEBO PEDIR AL ADMIN QUE INGRESE
		// LOS DATOS POR EL SCANNER DEL MAIN
		// EL METODO DEBERIA DEVOLVER UN BOOLEANO Y DAR UN MENSAJE DE EXITO EN CASO DE
		// RESULTAR "true"

		int indice = 0;
		boolean seAgrego = false;

		while (indice < this.especialidadesDisponibles.length && !seAgrego) {
			if (this.especialidadesDisponibles[indice] == null) {
				this.especialidadesDisponibles[indice] = new Doctores(nombre, apellido, especialidad, horarioDeAtencion,
						diasDisponibles);
				seAgrego = true;
			}
			indice++;
		}

		return false;
	}

// agrega el paciente que viene por parametro al array de pacientes. 
	public boolean agregarPaciente(Pacientes paciente) {
		boolean seAgrego=false;
		int index=0;
		while(index< this.pacientes.length && !seAgrego){
			if(this.pacientes[index]== null) {
				this.pacientes[index]=paciente;
				seAgrego=true;
			}
			index++;
		}
		
		return seAgrego;
	}

/* Recorremos el array pacientes comparando cada posicion con el paciente 
 * que viene por parametro para corroborar que sea el mismo  
 * para igualar lo a null.
	*/
	public void eliminarPaciente(Pacientes paciente) {
		
		int index=0;
		boolean seElimino=false;
		while(index< this.pacientes.length && !seElimino) {
			if(this.pacientes[index]!=null&& this.pacientes[index].equals(paciente)) {
				this.pacientes[index]= null;
				seElimino=true;
			}
			index++;
		}
	}
	
// HACER BUSCAR PACIENTE/MEDICO/TURNO
	public Pacientes buscarPacientePor(int dni, Turnos turnosPacientes) {
		Pacientes pacienteBuscado=null;
		int index=0;
		while(index< turnosPacientes. ) {
			
		}
		return pacienteBuscado;
	}
//MOSTRAR DISPONIBLE
// ORDENADAR POR 
// VOLVER MENU PRINCIPAL

// precioPorCobertura()--> toma cobertura y calcula el precio.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Doctores[] getDoctores() {
		return doctores;
	}

	public void setDoctores(Doctores[] doctores) {
		this.doctores = doctores;
	}

	public Pacientes[] getPacientes() {
		return pacientes;
	}

	public void setPacientes(Pacientes[] pacientes) {
		this.pacientes = pacientes;
	}

}
