package cadenas;

public class Metodos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cadenas o Strings --< array de chars
		
		String mensaje = "Alexandre esta faltando a clase los lunes, por que se queda dormido";
		
		//Métodos básicos
		//length()->Devuelve número de caracteres
		int letras = mensaje.length();
		//charAt(int posicion)--> Me devuelve el caracter que ocupa esa pos
		char caracter = mensaje.charAt(0);
		
		//Comprobar letra de un DNI
		String dni = "12345678Alexandre esta atento";
		if (dni.length() == 9) {
			char ultimoCaracter = dni.charAt(dni.length()-1);
		     boolean letraDNI = Character.isLetter(ultimoCaracter);
		     if(letraDNI) {
		    	 System.out.println("DNI correcto");
		     }
		     else {
		    	 System.out.println("No tiene una letra en la última pos");
		     }
		}
		else {
			System.out.println("Error en el formato del DNI");
		}
		
		//substring(int indice)-->Me devuelve el string desde esa pos hasta el final
		String dniCortado = dni.substring(8);
		System.out.println(dniCortado);
		//substring(int indice , int numeroDeCaracteres)-->
		String dniCortado2 = dni.substring(0, 8);
		System.out.println(dniCortado2);
		
		//Comprobar letra del dni
		int numeroDNI = Integer.parseInt(dniCortado2);
		int resto = numeroDNI % 23;
		
		//startsWith(String c)--< 
		if (dni.startsWith("34")) {
			
		}
		
	}

}
