package com.gugler.java;

public class Alumno {

	private long dni;
	private String nombre;
	
	private int n1,n2,n3;
	private List<Integer> notas=new ArrayList<>();

	public Alumno(long dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public double Promedio() {
		return (this.n1+this.n2+this.n3)/3.0;
	}

	public long getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
	
	
	
	

}
