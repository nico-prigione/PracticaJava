package ejercicio1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inicio = javax.swing.JOptionPane.showInputDialog("Ingrese número desde");
		String fin = javax.swing.JOptionPane.showInputDialog("Ingrese número hasta");
		int contador = Integer.parseInt(inicio);
		do {
		System.out.println("Probando bucle " + contador);
		contador++;
		} while (contador <= Integer.parseInt(fin));

	}

}
