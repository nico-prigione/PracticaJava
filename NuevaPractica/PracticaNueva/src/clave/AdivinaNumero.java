package clave;
import java.lang.StackWalker.Option;
import java.util.*;

import javax.swing.JOptionPane;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio=(int)(Math.random()*100);
		
		System.out.println(aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0,intentos=0;
		while(aleatorio!=numero) {
			intentos++;
			System.out.println("Introduce un numero: ");
			numero=entrada.nextInt();
			if(aleatorio>numero) {
			  System.out.println("el numero ingresado es menor");
			}
			else if(aleatorio<numero)  {
				System.out.println("el numero ingresado es mayor");
			}
		}
		System.out.println("Adivinaste el Numero! "+ "lo conseguistes en "+ intentos + " intentos");

	}

}
