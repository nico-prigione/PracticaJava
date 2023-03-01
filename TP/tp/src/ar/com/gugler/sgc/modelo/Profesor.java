package ar.com.gugler.sgc.modelo;

import java.util.Date;

public class Profesor extends Persona {

	public String cuil;
	public Date fechaIngreso;
	
	
	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		System.out.printf("Nombre del Docente: "+ getNombreCompleto().toUpperCase());
		System.out.printf("Cuil: "+ this.getCuil());
	}
	
	
	
}
