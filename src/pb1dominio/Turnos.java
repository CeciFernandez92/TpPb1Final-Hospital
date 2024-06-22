package pb1dominio;

import pb1dominio.enums.Especialidades;

public class Turnos {
private Pacientes [] turnosDisponibles;
private boolean disponibilidad;
private Doctores doctor;
private Especialidades especialidad;


public Turnos(boolean disponibilidad,Doctores doctor, Especialidades especialidad) {

	this.disponibilidad = disponibilidad;
	this.doctor = doctor;
	this.especialidad = especialidad;
	this.turnosDisponibles=new Pacientes[500];
}

// constructor 
// fecha, horario, doctor, disponibilidad,
// declarar el array con un largo de 
// getter y setters completar



}
//