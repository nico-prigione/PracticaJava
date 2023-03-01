package ar.com.gugler.sgc.modelo;

import java.util.List;

public class Materia extends Asignatura{
	
	int anio;
	
	public Materia(int codigo, String nombre, List<Almuno> alumnos, Profesor profesores, int anio) {
		super(codigo, nombre, alumnos, profesores);
		// TODO Auto-generated constructor stub
		this.anio=anio;
	}

		

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	
}
