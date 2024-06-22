package pb1dominio;

import pb1dominio.enums.Especialidades;

public class Pacientes {
private String nombre;
private String apellido;
private int dni;
private Cobertura obraSocial;
private Especialidades motivo;

public Pacientes(String nombre, String apellido, int dni, Cobertura obraSocial, Especialidades motivo) {

	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.obraSocial = obraSocial;
	this.motivo = motivo;
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

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

public Cobertura getObraSocial() {
	return obraSocial;
}

public void setObraSocial(Cobertura obraSocial) {
	this.obraSocial = obraSocial;
}

public Especialidades getMotivo() {
	return motivo;
}

public void setMotivo(Especialidades motivo) {
	this.motivo = motivo;
}

@Override
public String toString() {
	return "Pacientes [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", obraSocial=" + obraSocial
			+ ", motivo=" + motivo + "]";
}

 
	
	
}
