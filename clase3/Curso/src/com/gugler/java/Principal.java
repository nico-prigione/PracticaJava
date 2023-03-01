package com.gugler.java;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var unAlumno=new Alumno(30880939L,"Nicolas Prigione");
		unAlumno.setN1(50);
		unAlumno.setN2(80);
		unAlumno.setN3(60);
		
		System.out.println("Promedio del Alumno "+unAlumno.getNombre()+ " es "+unAlumno.Promedio());

	}

}
