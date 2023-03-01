import java.util.*;


public class EjercicioC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite un Numero: ");
		
		int dato= entrada.nextInt();
		
		if(dato%2==0) {
			System.out.println("Mostrando Numero Pares "+"6,8,10,12,14");
		}else {
			System.out.println("Mostrando Numero Impares "+"5,7,9,11,13");
		}
		
		

	}

}
