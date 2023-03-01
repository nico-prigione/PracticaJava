package ar.com.gugler.sgc.modelo;
	import java.util.*;
	
public abstract class Persona {
	
	public String apellido;
	public String nombre;
	public Date fechaDeNacimiento;
	public String domicilio;
	public String telefono;
	public String email;
	public abstract void mostrarInformacion();
	
	
	public Persona() {
		
	}
	public Persona(String apellido,String nombre, Date fecha, String domicilio, String tel,String mail) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.fechaDeNacimiento=fecha;
		this.domicilio=domicilio;
		this.telefono=tel;
		this.email=mail;
	}
	
	public String getNombreCompleto() {
		String nombreCompleto= nombre + ", "+ apellido;
		return nombreCompleto;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


