package ar.com.gugler.sgc.modelo;

import java.util.*;

public class Curso extends Asignatura {
	
	public int cupo;
	
	public Curso(int codigo, String nombre, List<Almuno> alumnos, Profesor profesores,int cupo) {
		super(codigo, nombre, alumnos, profesores);
		// TODO Auto-generated constructor stub
		this.cupo=cupo;
	}
	
	public void agregarAlumno(List<Almuno> a) {
		for(int i=0;i<a.size();i++) {
			a.add(null);
		}
	}
	
	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	
	
}
