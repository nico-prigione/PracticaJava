package ar.com.gugler.sgc.modelo;

import java.util.*;

public class TPfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Almuno alumnos=new Almuno();
		alumnos.apellido=("Prigione");
		alumnos.nombre=("Nicolas Alberto");
		alumnos.domicilio=("Carlos Pellegrini");
		alumnos.telefono=("343-5716691");
		alumnos.legajo=("206.919");
		
		for(int i=0;i<5;i++) {
			System.out.println(alumnos.getNombreCompleto());
			
		}
		
		

	}

}
