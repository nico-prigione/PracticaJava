package clase1;

public class Operador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz=Math.sqrt(34.5);
		double a=5,b=3;//a base y b exponente.-
		
		double resultado=Math.pow(a, b);
		
		System.out.println(raiz);
		System.out.println(resultado);
		String cadena="Nicolas Alberto Prigione";
		System.out.println("Su nombre es "+cadena + " posee "+cadena.length()+" letras");
		System.out.println("La primer letra es "+cadena.charAt(0));
		int ultimaLetra=cadena.length();
		System.out.println("Ultima letra es "+ cadena.charAt(ultimaLetra-1));
		
		
	}

}
