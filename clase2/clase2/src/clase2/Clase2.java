/**
 * 
 */
package clase2;


import java.util.*;

/**
 * @author nico
 *
 */
public class Clase2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in); //creo una entrada 
		System.out.println("Ingrese su Nombre: ");
		String nombre=entrada.nextLine();
		System.out.println("Ingrese su edad: ");
		int edad=entrada.nextInt();
		System.out.println("Hola "+nombre+" su edad es: "+edad);
		

	}

}
