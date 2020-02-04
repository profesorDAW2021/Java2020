package lecturaDatos;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Por cada variable primitiva , existe una variable compleja u objeto
		//que permite añadirle algunas funciones
		//int--> Integer
		//float --> Float
		//double --> Double
		//char --> Character
		
		
		char letra = '?';
		if(Character.isLetter(letra)) {
			System.out.println("Es una letra");
		}
		else if(Character.isDigit(letra)) {
			System.out.println("Es un dígito");
		}
		else if(Character.isWhitespace(letra)) {
			System.out.println("Es un espacio");
		}
		else {
			System.out.println("Es un símbolo");
		}
		
		String numerico = "678";
		//Guardarlo en un int
		
		int numero = Integer.parseInt(numerico);
		
		
		//Pasar un número a un String
		
		int callateXandre = 100;
		
		String deUnaVez = Integer.toString(callateXandre);
		String deUnaVezEnBinario = Integer.toBinaryString(callateXandre);
		String deUnaVezEnHexaDecimal = Integer.toHexString(callateXandre);
		
		
		
		
		
		
		
		
		
		
	}

}
