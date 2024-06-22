package pb1dominio;

import pb1dominio.enums.Especialidades;

public class Doctores {
private String nombre;
private String apellido;
private Especialidades especialidad;
private String horarioDeAtencion;
private String diasDisponibles;

public Doctores(String nombre, String apellido, Especialidades especialidad, String horarioDeAtencion,
		String diasDisponibles) {

	this.nombre = nombre;
	this.apellido = apellido;
	this.especialidad = especialidad;
	this.horarioDeAtencion = horarioDeAtencion;
	this.diasDisponibles = diasDisponibles;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Especialidades getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(Especialidades especialidad) {
	this.especialidad = especialidad;
}
public String getHorarioDeAtencion() {
	return horarioDeAtencion;
}
public void setHorarioDeAtencion(String horarioDeAtencion) {
	this.horarioDeAtencion = horarioDeAtencion;
}
public String getDiasDisponibles() {
	return diasDisponibles;
}
public void setDiasDisponibles(String diasDisponibles) {
	this.diasDisponibles = diasDisponibles;
}

}
