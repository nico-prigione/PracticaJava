package ejercicio1;

import java.util.Date;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titulo="Presione 1 para ver la hora "+'\n'+"Presione 2 para salir";
		String opcion=javax.swing.JOptionPane.showInputDialog(titulo);
		if(Integer.parseInt(opcion)==1)
			System.out.println(new Date());
			else
				System.out.println("Opcion no es correcta!");
			
		if(Integer.parseInt(opcion)==2)
			System.exit(0);
		

	}

}
