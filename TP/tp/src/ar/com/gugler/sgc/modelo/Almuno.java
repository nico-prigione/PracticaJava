package ar.com.gugler.sgc.modelo;

public class Almuno extends Persona {
	
	public String legajo;
	
	public String getLegajo() {
		return legajo;
	}
	public Almuno() {
		
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		System.out.printf("Nombre del Alumno: "+ getNombreCompleto()+"Legajo: "+this.getLegajo());
	}
	
}
