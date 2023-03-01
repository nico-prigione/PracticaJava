package clave;
import java.util.*;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		do {
			genero=JOptionPane.showInputDialog("Ingrese su genero (H o M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Diga su Altura: "));
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal=altura-110;
		}else {
			pesoIdeal=altura-120;
		}
		
		System.out.println("Su peso es "+ pesoIdeal);
		

	}

}
