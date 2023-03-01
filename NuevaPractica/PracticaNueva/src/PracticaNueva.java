import javax.swing.*;
import java.util.*;

public class PracticaNueva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario=JOptionPane.showInputDialog("Introduzca Nombre: ");
		String edad=JOptionPane.showInputDialog("Su edad: ");
		int edad_usuario=Integer.parseInt(edad);
		
		if(edad_usuario<17) {
			System.out.println("Menor de Edad! ");
		}else {
			System.out.println("Mayor de Edad!");
		}
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una Opcion: \n1:Cuadrado \n2:Rectangulo");
		
		int figura=entrada.nextInt();
		
		
		
		
		
		

	}

}
