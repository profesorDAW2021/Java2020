package metodos;

public class Pruebas {
	public static void e2(String mensaje) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Llamar a los métodos de la clase Ejemplos
		Ejemplos.e("Esto es un ejemplo");
		
		int x1 = 9, x2 = 8;
		
		int suma = Ejemplos.suma(x1, x2);
		
		float suma2Valores = Ejemplos.suma(3.5f,8.9f);
		float suma5Valores = Ejemplos.suma(4f,7f,5f,3f,2f);
		
		int valor = 6;
		System.out.println(Ejemplos.sumar10(valor));
		Ejemplos.e("Valor = " + valor);
		
		int matriz[] = {1,2,3,4,5,6,7};
		Ejemplos.resetearMatriz(matriz);
		
		for(int valor2 : matriz) {
			System.out.print(valor2 + " ");
		}
		
		
	}

}
