package clase2;
import javax.swing.*;
public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Diga su Nombre: ");
		String edad=JOptionPane.showInputDialog("Diga su edad: ");
		int nuevaEdad=Integer.parseInt(edad);
		nuevaEdad++;
		System.out.println("Hola Querido "+nombre+ " el año que viene cumplis "+(nuevaEdad));

	}

}
