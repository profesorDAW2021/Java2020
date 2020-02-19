package cadenas;
import metodos.Ejemplos;
public class MetodosDeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Alexandre se queda sin los donuts";
		
		//length(): Devuelve el número de caracteres de un String
		int numeroCaracteres = cadena.length();
		
		//charAt(int posicion): Devuelve el caracter que ocupa esa pos
		char caracter = cadena.charAt(0);
		
		//startsWith(String c): Devuelvel booleano si el string empieza por el string que le 
		//paso como parámetro
		
		boolean condicion = cadena.startsWith("Alex");
		
		if(cadena.startsWith("Al")){
			
		}
		
		//substring(int indice): 
		String subCadena = cadena.substring(5);
		
		String cuentaBancaria = "ES45-09-0000-345678-09393939";
		
		String subCadena2 = cadena.substring(0, 5);
		
		System.out.println(subCadena2);
		
		//split('separador'): Devuelve una matriz con las cadenas formados a 
		//partir del separador.
		
		String ejemplo="12345678K-Pablo Rodríguez-15-pablo@ciclosmontecastelo.es";
		String trozos[] = ejemplo.split("-");
		//6y
		//8u  [1-9]?*/
		for(String c : trozos) {
			System.out.println(c + ",");
		}
		
		//Es mayor de edad o no?
		int edad = Integer.parseInt(trozos[2]);
		
		if(edad>18) {
			System.out.println("Mayor de edad");
		}
		else {
			System.out.println("Menor de edad");
		}
		
		//compareTo(String a2): Devuelve -1 , 0 , o 1
		String a1 = "Alexandre";
		String a2 = "zAlexandre";
		
		int comparacion = a1.compareTo(a2);
		
		System.out.println(comparacion);
		
		//Igualdad de strings
		
		String s1 ="Hola";
		String s2 = "Hola";
		
		boolean iguales = s1==s2;
		boolean igualesConEquals = s1.equals(s2);
		System.out.println(iguales);
		System.out.println(igualesConEquals);
		
		String original = "Alexandre*no*se*calla*ni*debajo*del*agua";
		String copia = original.replace("*", " ");
		System.out.println(copia);
		
		
	
		
		
	
	}

}
