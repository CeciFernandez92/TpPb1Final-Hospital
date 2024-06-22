package pb1interfaz;

import pb1dominio.Doctores;
import pb1dominio.Hospital;
import pb1dominio.enums.Especialidades;

public class AdministracionHospital {

	public static void main(String[] args) {
	
// crear instancia de clase hospital y pedir datos sobre sus parametros.
		// mostar menu de inicio de sesion
		// iniciar sesion o registrarse
		// mostrar menu principal(usar do while, switch, pedir opcion, validar opcion
		// del enum)
		// acceder al menu secundario (usar do while, switch, pedir opcion, validar
		// opcion del enum)
	 // aplicar metodos a cada switch.
		// crear los metodos y scanners (ingresar por teclado)
}
	
	
	
	
	
	
	
	
	private static void agregarDoctores(Hospital hospital) {
		String nombre = "", apellido = "", horarioDeAtencion = "", fechaDisponible = "";
		Especialidades especialidad = null;
		nombre = ingresarString("\nNombre del doctor/a: ");
		apellido = ingresarString("\nApellido del doctor/a: ");
		horarioDeAtencion = ingresarString("\nMañana o Tarde: ");
		fechaDisponible = ingresarString("\nDias disponibles, ej'Lunes a Miercoles' o 'Martes y Jueves': ");

		if (hospital.agregarDoctores(nombre, apellido, especialidad, horarioDeAtencion, fechaDisponible) == true) {
			// CREAR EL METODO "mostrarPorPantalla(String);"
			mostrarPorPantalla("\nEl medico se agrego con exito!");
		} else {
			mostrarPorPantalla("\nERROR, no se pudo agregar al medico");
		}
	}

}
