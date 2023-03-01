package ar.com.gugler.sgc.modelo;

import java.util.ArrayList;
import java.util.*;

public class Asignatura {
	
	public int codigo;
	public String nombre;
	List<Almuno> alumnos=new ArrayList<>();
	public Profesor profesores;
	
	public Asignatura(int codigo,String nombre, List<Almuno> alumnos, Profesor profesores) {
		super();
		this.codigo=codigo;
		this.nombre=nombre;
		this.alumnos=alumnos;
		this.profesores=profesores;
	}
		
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
