package clave;
import javax.swing.*;


public class Clave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Nicolas";
		String pass="";
		
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Ingrese la Clave: ");
			
			if(clave.equals(pass)==false) {
				System.out.println("Clave incorrecta! ");
			}
			
		}
		System.out.println("Clave correcta! Acceso Permitido ");

	}

}