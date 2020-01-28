
public class Ejemplo2_Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float y double
		float temperatura = (float)9.5;
		float temperatura2 = 10.6f;
		
		//float e int
		int temperatura3 = (int) temperatura2;
		
		System.out.println(temperatura3);
		
		//char  e int
		char letra = 'A';
		int codigoLetra = letra;
		System.out.println("Código letra " + letra + " = " + codigoLetra);
		
		//int a byte
		
		int numero1 = 130;
		byte numeroByte = (byte)numero1;
		
		System.out.println(numeroByte);
		
		
	}

}
