package clave;
import javax.swing.*;

public class ControlArroba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		boolean punto=false;
		
		
		String mail=JOptionPane.showInputDialog("Ingrese su Mail: ");
		
		for(int i=0; i<mail.length();i++) {
			if(mail.charAt(i)=='@'){
				arroba=true;
			}
		}
		
		if(arroba==true) {
			System.out.println("Su mail esta correcto ");
		}else {
			System.out.println("No puso @, para su mail ");
		}
		

	}

}
