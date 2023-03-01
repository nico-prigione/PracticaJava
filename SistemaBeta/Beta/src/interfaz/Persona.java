package interfaz;
import javax.swing.*;
import java.awt.*;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoCentrado miMarco=new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla=miPantalla.getScreenSize();
		
		int altura=tamanioPantalla.height;
		int ancho=tamanioPantalla.width;
		
		setTitle("Previsional");
		
		setSize(ancho/2,altura/2);
		
		setLocation(ancho/4,altura/4);
	}
}
