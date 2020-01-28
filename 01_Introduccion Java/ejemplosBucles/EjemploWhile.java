package ejemplosBucles;

public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular la suma de n numeros
		int n = 250;
		
		int i = 1;
		int suma = 0;
		
		while(i<n) {
			suma = suma + i;
			i++;
		}
		System.out.println("La suma es: " + suma);
	}

}
